package stepsDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginBlock;
import pages.LoginPage;
import steps.DefaultStepsData;

public class LoginBlockStepDef extends DefaultStepsData {

    private WebDriver driver;

    @Step
    @When("^I login to application with username '(.*)' and password '(.*)'$")
    public void enterWrongCredentials(String login, String password) {
        loginBlock = new LoginBlock(driver);
        loginBlock.enterLogin(login);
        loginBlock.enterPassword(password);
        loginBlock.submitLogin();
    }

    @Step
    @Then("I see error message")
    public void verifyErrorMessage() {
        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getBadLoginAlert().isDisplayed());
    }

}
