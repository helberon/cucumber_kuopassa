package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends BasePage{

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement badLoginAlert;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

}
