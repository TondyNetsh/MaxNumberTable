import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/Facebook.feature",
        glue = "stepDefinitions", plugin = {"pretty", "html:target/Report.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}