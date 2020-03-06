package stepsDef;

import driverFactory.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonStepsDef {
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
