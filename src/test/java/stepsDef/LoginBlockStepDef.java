package stepsDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginBlock;
import pages.LoginPage;
import steps.DefaultStepsData;

public class LoginBlockStepDef extends DefaultStepsData {

    private WebDriver driver;

    @Description("Lorem Ipsum")
    @When("^I login to application with username '(.*)' and password '(.*)'$")
    public void enterWrongCredentials(String login, String password) {
        loginBlock = new LoginBlock(driver);
        loginBlock.enterLogin(login);
        loginBlock.enterPassword(password);
        loginBlock.submitLogin();
    }

    @Then("I see error message")
    public void verifyErrorMessage() {
        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getBadLoginAlert().isDisplayed());
    }

}
