package tasks.login;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.login.LoginView;

import java.util.List;
import java.util.Map;

public class LoginTo implements Task {
    private DataTable dataTable;

    public LoginTo(DataTable dataTable) {
        this.dataTable = dataTable;
    }

    public static Performable login(DataTable dataTable) {
        return Tasks.instrumented(LoginTo.class, dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            actor.attemptsTo(
                    SendKeys.of(row.get("username")).into(LoginView.username),
                    SendKeys.of(row.get("password")).into(LoginView.password),
                    Click.on(LoginView.submit)
            );
        }

    }


}
