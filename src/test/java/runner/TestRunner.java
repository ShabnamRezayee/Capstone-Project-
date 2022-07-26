package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:feature", // we provide path of feature folder
		glue = "step.definition", // we provide path of step definition classes
		tags = "@TestAll", // with tags we will run our test cases
		dryRun = false, // DryRun checks if there is any missing step def
		monochrome = true, // it makes console readable
		strict = true, // this will mark a scenario failed if one step failed
		plugin = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json" }, publish = true 
		// this
																												
)
public class TestRunner {
}
