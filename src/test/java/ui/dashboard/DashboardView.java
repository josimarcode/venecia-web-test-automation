package ui.dashboard;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardView {
    public static Target user = Target.the("user")
            .located(By.cssSelector("span > p"));
}
