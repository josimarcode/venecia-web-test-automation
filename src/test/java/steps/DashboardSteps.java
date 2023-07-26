package steps;

import io.cucumber.java.en.When;
import tasks.dashboard.NavigateBarTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class DashboardSteps {
    @When("I choose the {string} option in the dashboard options menu")
    public void iChooseTheOptionInTheDashboardOptionsMenu(String options) {
        theActorCalled("Josimar").attemptsTo(new NavigateBarTo(options));
    }
}
