package tasks.person;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;
import ui.common.CommonView;
import ui.person.AditionalDetailView;

import java.util.List;
import java.util.Map;

public class AditionalDetailTo implements Task {
    private DataTable dataTable;
    CommonView commonView = new CommonView();

    // Constructor con el parámetro
    public AditionalDetailTo(DataTable dataTable) {
        this.dataTable = dataTable;
    }

    public static Performable aditionalDetailTo(DataTable dataTable) {
        return Tasks.instrumented(AditionalDetailTo.class, dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {

            actor.attemptsTo(Click.on(AditionalDetailView.selectNationality));
            List<WebElementFacade> elements = AditionalDetailView.optionsNationality.resolveAllFor(actor);

            for (WebElementFacade element : elements) {
                if (element.getText().equals(row.get("nationality"))) {
                    element.click();
                    break;
                }

            }

            actor.attemptsTo(Click.on(AditionalDetailView.selectMaritalStatus));
            List<WebElementFacade> elements2 = AditionalDetailView.optionsNationality.resolveAllFor(actor);

            for (WebElementFacade element : elements2) {
                if (element.getText().equals(row.get("marital"))) {
                    element.click();
                    break;
                }

            }

            actor.attemptsTo(SendKeys.of(Keys.COMMAND + "a").into(AditionalDetailView.dateOfBird),
                    SendKeys.of(Keys.BACK_SPACE).into(AditionalDetailView.dateOfBird),
                    SendKeys.of(row.get("date")).into(AditionalDetailView.dateOfBird),
                    Click.on(CommonView.replaceLabelInLocator(commonView.getLocatorForText(), row.get("gender"))),
                    SendKeys.of(row.get("military")).into(AditionalDetailView.militaryService)

            );
        }
    }
}
