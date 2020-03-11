package stepsDef;

import driverFactory.DriverProvider;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PurchaseBlock;
import pages.PurchasePage;
import pages.ShoppingCartPage;
import steps.DefaultStepsData;

public class PurchaseStepDef extends DefaultStepsData {
    private WebDriver driver;

    @When("^I buy '(.*)'$")
    public void buyDuck(String duck){
        purchaseBlock = new PurchaseBlock(driver);
        purchaseBlock.buyItem(duck).addToShoppingCart();
    }

    @When("go to shopping cart")
    public void goToShoppingCart() {
         purchasePage = new PurchasePage(driver);
        WebElement element = (new WebDriverWait(DriverProvider.newDriver(),5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@src,'filled')]")));
        purchasePage.goToShoppingCart();
    }

    @Then("I see that item present in table")
    public void checkPurchasePresence() {
        shoppingCartPage = new ShoppingCartPage(driver);
        boolean element = (new WebDriverWait(DriverProvider.newDriver(),5)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader']")));
        Assert.assertTrue(shoppingCartPage.getShoppingCartTable().isDisplayed());
    }
}
