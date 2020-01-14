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


    @Given("^I open \"([^\"]*)\" browser$")
    public void iOpenTheEconomicCalendarPagePageInBrowser(String browserName) {
    //TODO: This a common part!
        indexPage.openBrowser(browserName);
    }

    @When("^I open \"([^\"]*)\" page$")
    public void iOpenPage(String pageName) {
        //TODO: This a common part!
        loginPage.openPage(pageName);
    }

    @And("^I login$")
    public void iLogin() {
        loginPage.login();
    }

    @Then("^I validate that the \"([^\"]*)\" present")
    public void iValidateElementPresent(String elementName){
        //TODO: This a common part!
    }


}
