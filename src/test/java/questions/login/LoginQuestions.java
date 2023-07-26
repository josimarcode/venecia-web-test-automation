package questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.checkerframework.checker.units.qual.C;
import ui.common.CommonView;
import ui.dashboard.DashboardView;

public class LoginQuestions implements Question {
    private final String message;
    CommonView commonView = new CommonView();
    public LoginQuestions(String message) {
        this.message = message;
    }

    public static LoginQuestions withMessage(String message) {
        return new LoginQuestions(message);
    }

    @Override
    public Object answeredBy(Actor actor) {
        return CommonView.replaceLabelInLocator(commonView.getLocatorForText(),message).resolveFor(actor).getText();
    }

}
