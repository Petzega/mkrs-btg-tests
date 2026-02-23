package org.btg.practual.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AccessChronosWeb implements Task {

    private static final String CHRONOS_URL = "https://chronos.example.com";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.url(CHRONOS_URL)
        );
    }

    public static AccessChronosWeb theChronosWeb() {
        return new AccessChronosWeb();
    }
}
