package web.pages;

import org.openqa.selenium.By;
import properties.PropertyHolder;
import web.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private final By LINK_FOR_LOGIN = By.xpath("//a[@href='/login']");
    private final By INPUT_USER_PASSWORD = By.xpath("//*[@type='password']");
    private final By BUTTON_SUBMIT = By.xpath("//button[@type='submit']");
    private final By INPUT_USER_EMAIL = By.xpath("//*[@inputmode='email']");
//    for Page Factory
//    @FindBy(xpath = "//*[@inputmode='email']")
//    private static By INPUT_USER_EMAIL;

    public void login() {
        $(LINK_FOR_LOGIN).click();
        $(INPUT_USER_EMAIL).setValue(PropertyHolder.getPropValue("USER_EMAIL"));
        $(INPUT_USER_PASSWORD).setValue(PropertyHolder.getPropValue("USER_PASSWORD"));
        $(BUTTON_SUBMIT).click();
    }


}
