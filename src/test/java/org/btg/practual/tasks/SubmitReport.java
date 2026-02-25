package org.btg.practual.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.btg.practual.pages.ChronosReportPage;

public class SubmitReport implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Hacer clic en el botón Generar
        actor.attemptsTo(
            Click.on(ChronosReportPage.GENERATE_BUTTON)
        );
    }

    public static SubmitReport theReport() {
        return new SubmitReport();
    }
}
