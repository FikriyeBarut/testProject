package testRunners;
import util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions", "util"},
        tags = "@CareerTest",
        plugin = {
                "summary","pretty","html:Reports/CucumberReport/Reports.html"
        }
)
public class runner extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverFactory.getDriver();
}