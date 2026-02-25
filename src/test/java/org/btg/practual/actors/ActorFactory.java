package org.btg.practual.actors;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActorFactory {

    public static Actor createActor(String actorName) {
        WebDriver driver = new ChromeDriver();
        return Actor.named(actorName)
            .whoCan(BrowseTheWeb.with(driver));
    }

    public static Actor createUserActor() {
        return createActor("Usuario");
    }
}
