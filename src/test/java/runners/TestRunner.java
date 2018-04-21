package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests",
		plugin = {"json:target/cucumber.json", "html: target/site/cucumber-pretty"},
		glue = {"stepDefinitions"},
		monochrome = true
		)

public class TestRunner {
	
}