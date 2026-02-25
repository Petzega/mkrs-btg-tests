package org.btg.practual.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import org.btg.practual.tasks.AccessChronosWeb;
import org.btg.practual.tasks.FillReportData;
import org.btg.practual.tasks.SubmitReport;
import org.btg.practual.questions.ReportGenerationStatus;

public class GeneracionReporteSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("el usuario {word} ingresa a la web de Chronos")
    public void loginIntoWeb(String actor) {
        theActorCalled(actor).attemptsTo(
                AccessChronosWeb.theChronosWeb()
        );
    }

    @Cuando("ingrese los datos del reporte {string} para la compañia {string} segun la fecha {string}")
    public void setReportData(String report, String company, String reportDate) {
        theActorInTheSpotlight().attemptsTo(
                FillReportData.withNumber(report)
                    .forCompany(company)
                    .withDate(reportDate),
                SubmitReport.theReport()
        );
    }

    @Entonces("se genera el reporte {string} de manera exitosa")
    public void validateReporte(String reporte) {
        theActorInTheSpotlight().should(
                seeThat("el reporte se generó exitosamente", 
                    ReportGenerationStatus.forReport(reporte), 
                    is(true))
        );
        
        // Delay de 5 segundos para visualizar el resultado antes de cerrar el navegador
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
