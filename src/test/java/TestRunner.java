import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.qa.test.stepDefinition"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@login",
        dryRun  = false,
        monochrome = true
)
public class TestRunner {}
