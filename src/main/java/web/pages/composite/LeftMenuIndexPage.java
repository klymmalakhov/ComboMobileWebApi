package web.pages.composite;

import com.codeborne.selenide.Driver;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.SelenideElementListIterator;
import com.codeborne.selenide.impl.WebElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;

public class LeftMenuIndexPage  {

    public static final By USER_NAME = By.xpath("//aside//button[1]//p");
    public static final By BUTTON_CREATE_DESIGN = By.xpath("(//aside//button)[2]");
    public static final By BUTTON_TRY_PRO = By.xpath("(//aside//button)[3]");
    public static final By ITEM_MAIN = By.xpath("//aside//a[@href='/']");



}

