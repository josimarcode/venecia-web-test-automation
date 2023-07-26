package ui.person;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AditionalDetailView {

    public static Target optionsNationality = Target.the("options Nationality")
            .located(By.cssSelector("div[role=\"listbox\"] div span"));
    public static Target selectNationality = Target.the("select Nationality")
            .located(By.xpath("//label[contains(text(),\"Nationality\")]//following::div[1]"));

    public static Target selectMaritalStatus = Target.the("select Marital Status")
            .located(By.xpath("//label[contains(text(),\"Marital Status\")]//following::div[1]"));

    public static Target dateOfBird = Target.the("select Date of Birth")
            .located(By.xpath("//label[contains(text(),'Date of Birth')]//following::input[1]"));

    public static Target militaryService = Target.the("select Military Service")
            .located(By.xpath("//label[contains(text(),\"Military Service\")]//following::input[1]"));



}
