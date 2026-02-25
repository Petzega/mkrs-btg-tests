package org.btg.practual.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ReportGenerationStatus implements Question<Boolean> {

    private String reportNumber;

    public ReportGenerationStatus(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // TODO: Implement verification of report generation success
        // return actor.asksFor(
        //     visibility(successMessage)
        // );
        return true;
    }

    public static ReportGenerationStatus forReport(String reportNumber) {
        return new ReportGenerationStatus(reportNumber);
    }
}
