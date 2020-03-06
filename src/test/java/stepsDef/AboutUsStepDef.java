package stepsDef;

import driverFactory.DriverProvider;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;
import pages.FooterBlock;
import steps.DefaultStepsData;

public class AboutUsStepDef extends DefaultStepsData {
    private WebDriver driver;

    @Step
    @When("I go to About Us page")
    public void goToAboutUsPage() {
        footerBlock = new FooterBlock(driver);
        footerBlock.goToAboutUsPage();
    }

    @Step
    @Then("I see correct text")
    public void checkTextCorrectness() {
        aboutUsPage = new AboutUsPage(driver);
        String aboutUsExpected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer fermentum quam eget molestie lacinia. Suspendisse consectetur velit vitae tellus commodo pharetra." +
                " Curabitur lobortis turpis tortor, id blandit metus pellentesque sit amet. Etiam cursus dolor purus, sit amet vestibulum ipsum aliquet nec. Nunc sed aliquet eros. Sed at vehicula urna." +
                " Aliquam euismod nisl a felis adipiscing tincidunt. Etiam vestibulum arcu sed massa ornare, vitae venenatis odio convallis.";
        String aboutUs = aboutUsPage.getAboutUsText().getText();
        Assert.assertEquals(aboutUsExpected,aboutUs);
    }

}
