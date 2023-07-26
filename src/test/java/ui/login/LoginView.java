package ui.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {
    public static Target username = Target.the("username")
            .located(By.xpath("//input[@name='username']"));

    public static Target password = Target.the("password")
            .located(By.cssSelector("input[name='password']"));

    public static Target submit = Target.the("submit")
            .located(By.cssSelector("button[type='submit']"));
}
