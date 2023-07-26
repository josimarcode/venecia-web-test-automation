package ui.person;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmployeeDetailView {
    public static Target employeeId = Target.the("employeeId")
            .located(By.xpath("//label[contains(text(),'Employee Id')]//following::input[1]"));

    public static Target otherId = Target.the("otherId")
            .located(By.xpath("//label[contains(text(),'Other Id')]//following::input[1]"));

    public static Target licenseNumber = Target.the("licenseNumber")
            .located(By.xpath("//label[contains(text(),\"Driver's License Number\")]//following::input[1]"));

    public static Target licenseExpired = Target.the("licenseExpired")
            .located(By.xpath("//label[contains(text(),'License Expiry Date')]//following::input[1]"));

    public static Target ssnNumber = Target.the("ssnNumber")
            .located(By.xpath("//label[contains(text(),'SSN Number')]//following::input[1]"));

    public static Target sinNumber = Target.the("sinNumber")
            .located(By.xpath("//label[contains(text(),'SIN Number')]//following::input[1]"));
}
