package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "/Users/abdullahsabbir9/eclipse-workspace/TargetCucumber/Features",
		glue = "Target",
		//format = "pretty", "html:test-output",
		plugin = "pretty",
		monochrome = true,
		dryRun = false
		
		)




public class TestRunner {

}
