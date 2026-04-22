package org.btg.practual.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class ReportGeneratorPage {

    public static final Target LABEL_USER = Target.the("etiqueta usuario").located(xpath("//button[@aria-label='open profile']/descendant::h6"));
    public static final Target COMBO_BOX_REPORT = Target.the("combo box reporte").located(id("report"));
    public static final Target OPTION_REPORT = Target.the("opción {0} del combo").locatedBy("//li[@role='option' and text()='{0}']");
    public static final Target SELECT_COMPANY = Target.the("selector de compañia").located(id("company"));
    public static final Target OPTION_COMPANY = Target.the("opción {0} de la compañía").locatedBy("//li[@role='option' and text()='{0}']");
    public static final Target INPUT_REPORT_DATE = Target.the("ícono del calendario").locatedBy("button[aria-label='Choose date']");
    public static final Target BUTTON_DATE = Target.the("día {0} del calendario").locatedBy("//button[@role='gridcell' and text()='{0}']");


    public static final Target HARD_BUTTON = Target.the("día {0} del calendario").locatedBy("//input[@id='report' and @value='BPF']");

}