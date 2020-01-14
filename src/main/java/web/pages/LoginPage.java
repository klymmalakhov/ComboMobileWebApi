package web.pages;

import org.openqa.selenium.By;
import properties.PropertyHolder;
import web.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private final static By INPUT_USER_EMAIL = By.xpath("//*[@inputmode='email']");
    private final static By INPUT_USER_PASSWORD = By.xpath("//*[@type='password']");
    private final static By BUTTON_SUBMIT = By.xpath("//button[@type='submit']");

    public void login() {
        $(INPUT_USER_EMAIL).setValue(PropertyHolder.getPropValue("USER_EMAIL"));
        $(INPUT_USER_PASSWORD).setValue(PropertyHolder.getPropValue("USER_PASSWORD"));
        $(BUTTON_SUBMIT).click();
    }


}
