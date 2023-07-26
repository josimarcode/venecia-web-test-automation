package ui.common;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CommonView {
    public String getLocatorForText() {
        return "//*[text()='@label']";
    }
    public static Target replaceLabelInLocator(String locator, String label) {
        return Target.the("").located(By.xpath(locator.replace("@label", label)));
    }

}
