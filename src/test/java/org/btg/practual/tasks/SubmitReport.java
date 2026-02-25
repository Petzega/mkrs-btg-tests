package org.btg.practual.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SubmitReport implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        // TODO: Implement clicking the submit button
        // actor.attemptsTo(
        //     Click.on(submitButton)
        // );
    }

    public static SubmitReport theReport() {
        return new SubmitReport();
    }
}
