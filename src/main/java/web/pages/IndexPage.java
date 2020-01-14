package web.pages;

import com.codeborne.selenide.Condition;
import web.BasePage;
import web.pages.composite.LeftMenuIndexPage;

import static com.codeborne.selenide.Selenide.$;

public class IndexPage extends BasePage {

    private LeftMenuIndexPage MENU = new LeftMenuIndexPage();

    public void validateThatMenuDisplayed() {

        $(MENU.USER_NAME).shouldBe(Condition.visible);
        $(MENU.BUTTON_CREATE_DESIGN).shouldBe(Condition.visible);
        $(MENU.BUTTON_TRY_PRO).shouldBe(Condition.visible);
        $(MENU.ITEM_MAIN).shouldBe(Condition.visible);

    }
}
