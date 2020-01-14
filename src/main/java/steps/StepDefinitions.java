package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import web.pages.IndexPage;
import web.pages.LoginPage;


public class StepDefinitions {

    private IndexPage indexPage = new IndexPage();
    private LoginPage loginPage = new LoginPage();


    @When("^I open \"([^\"]*)\" page in \"([^\"]*)\" browser$")
    public void iOpenPage(String pageName, String browserName) {
        loginPage.openPage(pageName, browserName);
    }

    @And("^I login$")
    public void iLogin() {
        loginPage.login();
    }

    @Then("^I validate that the \"([^\"]*)\" present")
    public void iValidateElementPresent(String elementName){
        indexPage.validateThatMenuDisplayed();
    }


}
