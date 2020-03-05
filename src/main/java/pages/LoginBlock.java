package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginBlock extends BasePage{
    @FindBy(xpath = "//input[@type='email']")
    private WebElement loginField;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@name='login']")
    private WebElement signInButton;

    public LoginBlock(WebDriver driver) {
        super(driver);
    }

    public void enterLogin(String login){
        loginField.sendKeys(login);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void submitLogin(){
        signInButton.click();
    }
}
