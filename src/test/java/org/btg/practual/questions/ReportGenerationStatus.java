package org.btg.practual.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.btg.practual.pages.ChronosReportPage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ReportGenerationStatus implements Question<Boolean> {

    private String reportNumber;

    public ReportGenerationStatus(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // Verificar si aparece el mensaje de éxito
        try {
            WebDriver driver = BrowseTheWeb.as(actor).getDriver();
            return driver.findElement(ChronosReportPage.SUCCESS_ALERT).isDisplayed();
        } catch (NoSuchElementException e) {
            // Si no está el mensaje de éxito, verificar si hay error
            try {
                WebDriver driver = BrowseTheWeb.as(actor).getDriver();
                return !driver.findElement(ChronosReportPage.ERROR_ALERT).isDisplayed();
            } catch (NoSuchElementException errorEx) {
                // Ni éxito ni error, probablemente está en proceso
                return false;
            }
        }
    }

    public static ReportGenerationStatus forReport(String reportNumber) {
        return new ReportGenerationStatus(reportNumber);
    }
}
