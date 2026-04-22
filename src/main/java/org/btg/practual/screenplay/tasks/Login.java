package org.btg.practual.screenplay.tasks;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.btg.practual.screenplay.ui.LoginPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

   private final String username;
   private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Login withCredentials(String username, String password) {
        return Tasks.instrumented(Login.class, username, password);
    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.BUTTON_INGRESAR, isVisible ()).forNoMoreThan(30).seconds(),
                Click.on(LoginPage.BUTTON_INGRESAR),
                WaitUntil.the(LoginPage.INPUT_USERNAME, isVisible ()).forNoMoreThan(30).seconds(),
                Enter.theValue(username).into(LoginPage.INPUT_USERNAME),
                WaitUntil.the(LoginPage.BUTTON_NEXT, isClickable ()).forNoMoreThan(30).seconds(),
                Click.on(LoginPage.BUTTON_NEXT),
                Enter.theValue(password).into(LoginPage.INPUT_PASSWORD),
                WaitUntil.the(LoginPage.BUTTON_NEXT, isClickable ()).forNoMoreThan(30).seconds(),
                Click.on(LoginPage.BUTTON_NEXT)
//                Click.on(LoginPage.BUTTON_LOGIN)
        );
        Thread.sleep(10000);
        actor.attemptsTo(

        );
    }
}
