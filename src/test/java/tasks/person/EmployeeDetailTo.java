package tasks.person;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.person.EmployeeDetailView;

import java.util.List;
import java.util.Map;

public class EmployeeDetailTo implements Task {
    private DataTable dataTable;

    public EmployeeDetailTo(DataTable dataTable) {
        this.dataTable = dataTable;
    }

    public static Performable employeeDetailTo(DataTable dataTable) {
        return Tasks.instrumented(EmployeeDetailTo.class, dataTable);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            actor.attemptsTo(
                    SendKeys.of(row.get("otherId")).into(EmployeeDetailView.otherId),
                    SendKeys.of(row.get("licenseNumber")).into(EmployeeDetailView.licenseNumber),
                    SendKeys.of(row.get("licenseExpired")).into(EmployeeDetailView.licenseExpired),
                    SendKeys.of(row.get("SSNumber")).into(EmployeeDetailView.ssnNumber),
                    SendKeys.of(row.get("SINumber")).into(EmployeeDetailView.sinNumber)
            );
        }

    }
}
