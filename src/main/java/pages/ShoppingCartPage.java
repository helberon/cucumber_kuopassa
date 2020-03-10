package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ShoppingCartPage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@id='box-checkout-cart']")
    private WebElement shoppingCartTable;


    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

}
