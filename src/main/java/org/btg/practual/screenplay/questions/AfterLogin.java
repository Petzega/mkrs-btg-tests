package org.btg.practual.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.btg.practual.screenplay.ui.ReportGeneratorPage;

public class AfterLogin implements Question<String> {

    public static AfterLogin value() {
        return new AfterLogin();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ReportGeneratorPage.LABEL_USER).answeredBy(actor);
    }
}
