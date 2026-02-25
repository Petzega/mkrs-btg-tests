package org.btg.practual.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.btg.practual.pages.ChronosReportPage;

public class FillReportData implements Task {

    private String reportNumber;
    private String company;
    private String reportDate;

    public FillReportData(String reportNumber, String company, String reportDate) {
        this.reportNumber = reportNumber;
        this.company = company;
        this.reportDate = reportDate;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Hacer scroll al inicio de la página para asegurar que los elementos son visibles
        actor.attemptsTo(Scroll.to(ChronosReportPage.REPORT_FIELD));
        
        // Obtener el WebDriver para ejecutar JavaScript
        WebDriver driver = actor.abilityTo(BrowseTheWeb.class).getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        // Usar JavaScript para llenar los campos directamente
        // Esto evita problemas de interactividad con elementos de Material-UI
        js.executeScript(
            "document.querySelector(\"input[id='report']\").value = arguments[0]; " +
            "document.querySelector(\"input[id='report']\").dispatchEvent(new Event('input', { bubbles: true }));",
            reportNumber
        );

        js.executeScript(
            "document.querySelector(\"[data-testid='select-company'] input\").value = arguments[0]; " +
            "document.querySelector(\"[data-testid='select-company'] input\").dispatchEvent(new Event('input', { bubbles: true }));",
            company
        );

        js.executeScript(
            "document.querySelector(\"input[id='reportDate']\").value = arguments[0]; " +
            "document.querySelector(\"input[id='reportDate']\").dispatchEvent(new Event('input', { bubbles: true }));",
            reportDate
        );
    }

    public static FillReportData withNumber(String reportNumber) {
        return new FillReportData(reportNumber, "", "");
    }

    public FillReportData forCompany(String company) {
        this.company = company;
        return this;
    }

    public FillReportData withDate(String reportDate) {
        this.reportDate = reportDate;
        return this;
    }
}
