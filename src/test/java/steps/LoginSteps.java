package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.dashboard.DashboardQuestions;
import questions.login.LoginQuestions;
import tasks.login.LoginTo;
import tasks.login.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class LoginSteps {
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        theActorCalled("Josimar").attemptsTo(NavigateTo.theHomePage());
    }
    @When("I enter valid credentials")
    public void iEnterValidCredentials(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(new LoginTo(dataTable));
    }
    @When("I enter invalid credentials")
    public void iEnterInvalidCredentials(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(new LoginTo(dataTable));
    }
    @When("I leave the username or password fields empty")
    public void iLeaveTheUsernameAndOrPasswordFieldsEmpty(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(new LoginTo(dataTable));
    }
    @Then("I should see an error message indicating login failure {string}")
    public void iShouldSeeAnErrorMessageIndicatingLoginFailure(String message) {
        theActorInTheSpotlight().should(
                seeThat("the message error", LoginQuestions.withMessage(message),
                        equalTo(message))
        );
    }
    @Then("I should be logged in and redirected to dashboard the Orange HRM")
    public void iShouldBeLoggedInAndRedirectedToDashboardTheOrangeHRM() {
        theActorInTheSpotlight().should(
                seeThat(DashboardQuestions.value(), not(blankOrNullString()))
                        .orComplainWith(AssertionError.class, "El campo está vacío")
        );
    }


}
