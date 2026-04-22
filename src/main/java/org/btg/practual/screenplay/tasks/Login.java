package org.btg.practual.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.btg.practual.screenplay.ui.LoginPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

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

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.BUTTON_INGRESAR, isClickable ()).forNoMoreThan(30).seconds(),
                Click.on(LoginPage.BUTTON_INGRESAR)
//                Enter.theValue(username).into(LoginPage.INPUT_USERNAME),
//                Enter.theValue(password).into(LoginPage.INPUT_PASSWORD),
//                Click.on(LoginPage.BUTTON_LOGIN)
        );
    }
}
