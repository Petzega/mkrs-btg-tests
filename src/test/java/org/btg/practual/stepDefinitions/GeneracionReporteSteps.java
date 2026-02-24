package org.btg.practual.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import org.btg.practual.screenplay.questions.AfterLogin;
import org.btg.practual.screenplay.tasks.GenerateReport;
import org.btg.practual.screenplay.tasks.Login;
import org.btg.practual.screenplay.ui.ReportGeneratorPage;
import org.btg.practual.ui.ChronosPage;

public class GeneracionReporteSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    private ChronosPage chronosPage;

    @Dado("el usuario {word} ingresa a la web de Chronos")
    public void loginIntoWeb(String actor) {
        theActorCalled(actor).attemptsTo(
                Open.browserOn().the(chronosPage),
                Login.withCredentials("Peter", "Zegarra")
        );
    }

    @Cuando("ingrese los datos del reporte {string} para la compañia {string} segun la fecha {string}")
    public void setReportData(String report, String company, String reportDate) {
        theActorInTheSpotlight().attemptsTo(
                GenerateReport.witData(report, company, reportDate)
        );
    }

    @Entonces("se genera el reporte {string} de manera exitosa")
    public void validateReporte(String reporte) {
        theActorInTheSpotlight().should(
                seeThat("el mensaje de bienvenida", AfterLogin.value(), equalTo("Peter Zegarra"))
        );
    }
}
