package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class PurchaseBlock extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class='content']//span[@class='quantity']")
    private WebElement amountOfPurchases;


    @FindBy(xpath = "//div[@class='tab-content']")
    private WebElement itemsContainer;

    public PurchaseBlock(WebDriver driver) {
        super(driver);
    }

    public PurchasePage buyItem(String userChoice) {
        Duck duck = new Duck();
        duck.getElementByName(itemsContainer, userChoice).click();
        return new PurchasePage(driver);
    }


}
