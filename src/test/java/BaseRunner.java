import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@debug",features = "src/test/resources/features",glue = "stepsDef",plugin = {"pretty","html:target/cucumber"})
public class BaseRunner
{

}