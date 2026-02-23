package org.btg.practual.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import org.btg.practual.actors.ActorFactory;
import org.btg.practual.tasks.AccessChronosWeb;
import org.btg.practual.tasks.FillReportData;
import org.btg.practual.tasks.SubmitReport;
import org.btg.practual.questions.ReportGenerationStatus;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class GeneracionReporteSteps {

    private Actor user;

    @Before
    public void setup() {
        user = ActorFactory.createUserActor();
    }

    @Dado("el usuario ingresa a la web de Chronos")
    public void el_usuario_ingresa_a_la_web_de_chronos() {
        user.attemptsTo(
            AccessChronosWeb.theChronosWeb()
        );
    }

    @Cuando("ingrese los datos del reporte {string} para la compañia {string} segun la fecha {string}")
    public void ingrese_los_datos_del_reporte_para_la_compañia_segun_la_fecha(String reporte, String compania,
            String fecha) {
        user.attemptsTo(
            FillReportData.withNumber(reporte)
                .forCompany(compania)
                .withDate(fecha)
        );
        user.attemptsTo(
            SubmitReport.theReport()
        );
    }

    @Entonces("se genera el reporte {string} de manera exitosa")
    public void se_genera_el_reporte_de_manera_exitosa(String reporte) {
        user.should(
            seeThat(ReportGenerationStatus.forReport(reporte), is(true))
        );
    }
}
