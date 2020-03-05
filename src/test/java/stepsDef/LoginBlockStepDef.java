package stepsDef;

import driverFactory.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import pages.LoginBlock;
import steps.DefaultStepsData;
import steps.LoginBlockSteps;

public class LoginBlockStepDef extends DefaultStepsData {

    private WebDriver driver;

    @Before
    @Given("I am on main page")
    public void goToMainPage() {
        driver = DriverProvider.newDriver();
        driver.get("http://kuopassa.net/litecart/en/");
    }

    @When("^I login to application with username '(.*)' and password '(.*)'$")
    public void enterWrongCredentials(String login, String password) {
        loginBlock = new LoginBlock(driver);
        loginBlock.enterLogin(login);
        loginBlock.enterPassword(password);
        loginBlock.submitLogin();
    }

    @Then("I see error message")
    public void verifyErrorMessage() {
    }

    @After
    public void closeBrowser(){
        DriverProvider.closeDriver();
    }

}
