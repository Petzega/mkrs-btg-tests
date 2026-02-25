package org.btg.practual.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AccessChronosWeb implements Task {

    private String baseUrl;

    public AccessChronosWeb() {
        // Siempre usar la URL del archivo MHTML local
        this.baseUrl = "file:///Users/luispersonal/Downloads/Ozono_2.mhtml";
    }

    public AccessChronosWeb(String url) {
        this.baseUrl = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.url(baseUrl)
        );
    }

    public static AccessChronosWeb theChronosWeb() {
        return new AccessChronosWeb();
    }

    public static AccessChronosWeb theChronosWebAtUrl(String url) {
        return new AccessChronosWeb(url);
    }
}

