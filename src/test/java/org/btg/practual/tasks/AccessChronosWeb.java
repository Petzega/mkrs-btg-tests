package org.btg.practual.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AccessChronosWeb implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String baseUrl = System.getProperty("webdriver.base.url", "https://chronos.example.com");
        actor.attemptsTo(
            Open.url(baseUrl)
        );
    }

    public static AccessChronosWeb theChronosWeb() {
        return new AccessChronosWeb();
    }
}
}
