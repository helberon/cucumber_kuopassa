package driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {
    private static WebDriver driver;

    public static WebDriver newDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }
    public static void closeDriver(){
        driver.close();
        if (driver != null)
        {
            driver = null;
        }
    }

}
