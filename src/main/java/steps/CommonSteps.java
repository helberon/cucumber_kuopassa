package steps;

import driverFactory.DriverProvider;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class CommonSteps  extends DefaultStepsData{
    private WebDriver driver;

    @Step
    public void navigateToPage(){
        driver = DriverProvider.newDriver();
        driver.get("http://kuopassa.net/litecart/en/");
    }
}
