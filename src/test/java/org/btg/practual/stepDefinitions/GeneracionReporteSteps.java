package org.btg.practual.stepDefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class GeneracionReporteSteps {

    @Dado("el usuario ingresa a la web de Chronos")
    public void el_usuario_ingresa_a_la_web_de_chronos() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step: el usuario ingresa a la web de Chronos");
    }

    @Cuando("ingrese los datos del reporte {string} para la compañia {string} segun la fecha {string}")
    public void ingrese_los_datos_del_reporte_para_la_compañia_segun_la_fecha(String reporte, String compania,
            String fecha) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step: ingrese los datos del reporte " + reporte + " para la compañia " + compania
                + " segun la fecha " + fecha);
    }

    @Entonces("se genera el reporte {string} de manera exitosa")
    public void se_genera_el_reporte_de_manera_exitosa(String reporte) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step: se genera el reporte " + reporte + " de manera exitosa");
    }
}
