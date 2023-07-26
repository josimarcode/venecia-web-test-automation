package questions.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.dashboard.DashboardView;

public class DashboardQuestions implements Question {

    @Override
    public String answeredBy(Actor actor) {
        return DashboardView.user.resolveFor(actor).getText();
    }

    public static Question<String> value() {
        return new DashboardQuestions();
    }
}
