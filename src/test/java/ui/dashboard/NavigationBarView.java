package ui.dashboard;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavigationBarView {
    public static Target optionsMenuBar = Target.the("options navigations bar")
            .located(By.cssSelector("ul[class=\"oxd-main-menu\"] > li"));
}
