package stepsDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
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

import java.time.Duration;

public class PurchaseStepDef extends DefaultStepsData {
    private WebDriver driver;

    @Step
    @When("^I buy '(.*)'$")
    public void buyDuck(String duck){
        purchaseBlock = new PurchaseBlock(driver);
        purchaseBlock.buyItem(duck).addToShoppingCart();
    }

    @Step
    @When("go to shopping cart")
    public void goToShoppingCart(){
        purchasePage = new PurchasePage(driver);
        WebElement element = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@src,'filled')]")));
        purchasePage.goToShoppingCart();
    }

    @Step
    @Then("I see that item present in table")
    public void checkPurchasePresence(){
        shoppingCartPage = new ShoppingCartPage(driver);
        Assert.assertTrue(shoppingCartPage.getShoppingCartTable().isDisplayed());
    }
}
