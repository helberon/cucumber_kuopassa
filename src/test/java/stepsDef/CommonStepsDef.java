package stepsDef;

import driverFactory.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import steps.DefaultStepsData;

@Slf4j
public class CommonStepsDef extends DefaultStepsData {

    private WebDriver driver;
    @Given("I am on main page")
    public void goToMainPage() {
        driver = DriverProvider.newDriver();
        driver.get("http://kuopassa.net/litecart/en/");
    }

    @After
    public void closeBrowser() {
        DriverProvider.closeDriver();
    }
}
