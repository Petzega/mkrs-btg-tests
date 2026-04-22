package org.btg.practual.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;


public class LoginPage {

    public static final Target BUTTON_INGRESAR = Target.the("botón ingresar").located(xpath("//button[contains(text() ,'Ingresar')]"));
    public static final Target INPUT_USERNAME = Target.the("campo usuario").located(id("i0116"));
    public static final Target BUTTON_NEXT = Target.the("boton siguiente").located(id("idSIButton9"));
    public static final Target INPUT_PASSWORD = Target.the("campo contraseña").located(id("i0118"));
    public static final Target BUTTON_LOGIN = Target.the("botón login").located(xpath(""));
}
