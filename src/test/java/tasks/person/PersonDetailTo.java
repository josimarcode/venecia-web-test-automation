package tasks.person;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import ui.person.PersonDetailView;

import java.util.List;
import java.util.Map;

public class PersonDetailTo implements Task {
    private DataTable dataTable;
    public PersonDetailTo(DataTable dataTable) {
        this.dataTable = dataTable;
    }

    public static Performable login(DataTable dataTable) {
        return Tasks.instrumented(PersonDetailTo.class, dataTable);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            actor.attemptsTo(
                    SendKeys.of(row.get("midlename")).into(PersonDetailView.middleName),
                    SendKeys.of(row.get("nickname")).into(PersonDetailView.nickName)
            );
        }

    }
}
