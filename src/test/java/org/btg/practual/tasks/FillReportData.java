package org.btg.practual.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

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
        // TODO: Implement filling the form with report data
        // actor.attemptsTo(
        //     Click.on(reportNumberField),
        //     typeValue(reportNumber),
        //     selectOption(company),
        //     setDate(reportDate)
        // );
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
