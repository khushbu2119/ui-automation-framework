package org.qa.test.stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.qa.test.Utils.BaseClass;
import org.qa.test.pages.HomePage;
import org.qa.test.pages.LoginPage;

public class Login extends BaseClass{

    LoginPage loginPage;
    HomePage homePage;

    @Before
    public void initElement(){
        loginPage = new LoginPage(getDriver());
        homePage = new HomePage(getDriver());
    }

    @Given("User launch swag lab url")
    public void userLaunchSwagLabUrl() {
        getDriver().get("https://www.saucedemo.com/");
    }

    @When("^User logged into to swag lab website with (.+) and (.+)$")
    public void userLoggedIntoToSwagLabWebsiteWithUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Then("User navigates to home page")
    public void userNavigatesToHomePage() {
        getDriver().getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
    }

    @And("User logged out from swag lab website")
    public void userLoggedOutFromSwagLabWebsite() {
        homePage.openSideMenu();
        homePage.clickOnLogout();
        getDriver().getCurrentUrl().equals("https://www.saucedemo.com/");
    }
}
