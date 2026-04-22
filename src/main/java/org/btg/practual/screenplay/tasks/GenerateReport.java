package org.btg.practual.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.btg.practual.screenplay.ui.ReportGeneratorPage.*;

public class GenerateReport implements Task {

    private final String report;
    private final String company;
    private final String reportDate;

    public GenerateReport(String report, String company, String reportDate) {
        this.report = report;
        this.company = company;
        this.reportDate = reportDate;
    }

    public static GenerateReport witData(String report, String company, String reportDate) {
        return Tasks.instrumented(GenerateReport.class, report, company, reportDate);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(COMBO_BOX_REPORT, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(COMBO_BOX_REPORT),
                WaitUntil.the(OPTION_REPORT.of(report), isClickable()).forNoMoreThan(30).seconds(),
                Click.on(OPTION_REPORT)
       );
/*
        actor.attemptsTo(
                WaitUntil.the(SELECT_COMPANY, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(SELECT_COMPANY),
                WaitUntil.the(OPTION_COMPANY.of(company), isClickable()).forNoMoreThan(30).seconds(),
                Click.on(OPTION_COMPANY)
        );

        actor.attemptsTo(
                WaitUntil.the(INPUT_REPORT_DATE, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(INPUT_REPORT_DATE),

                WaitUntil.the(BUTTON_DATE.of(reportDate), isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_DATE.of(reportDate))
        );*/
    }
}
