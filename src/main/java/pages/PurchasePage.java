package pages;

import lombok.Getter;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class PurchasePage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//button[@name='add_cart_product']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//div[@class='content']")
    private WebElement shoppingCart;

    @FindBy(id = "//img[contains(@src,'filled')]")
    private WebElement shoppingCartImageFilled;


    public PurchasePage(WebDriver driver) {
        super(driver);
    }

    public ShoppingCartPage goToShoppingCart() {
        shoppingCart.click();
        return new ShoppingCartPage(driver);
    }

    public void addToShoppingCart() {
        addToCartButton.click();
    }
}
