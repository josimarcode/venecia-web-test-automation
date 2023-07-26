package tasks.dashboard;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import ui.dashboard.NavigationBarView;

import java.util.List;

public class NavigateBarTo implements Task {
    private final String options;
    public NavigateBarTo(String options) {
        this.options = options;
    }

    public static Performable navigateBar(String options) {
        return Tasks.instrumented(NavigateBarTo.class, options);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> elements = NavigationBarView.optionsMenuBar.resolveAllFor(actor);
        for (WebElementFacade element : elements) {
            if(element.getText().equals(options)){
                element.click();
                break;
            }
        }
    }
}
