package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import tasks.person.AditionalDetailTo;
import tasks.person.EmployeeDetailTo;
import tasks.person.PersonDetailTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PersonDetailSteps {

    @And("register the personal data of the user")
    public void registerThePersonalDataOfTheUser(DataTable dataTable) {
        theActorCalled("Josimar").attemptsTo(new PersonDetailTo(dataTable));
    }
    @And("register the employee data of the user")
    public void registerTheEmployeeDataOfTheUser(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(new EmployeeDetailTo(dataTable));
    }
    @And("register the additional data of the employee")
    public void registerTheAdditionalDataOfTheEmployee(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(new AditionalDetailTo(dataTable));
    }
}
