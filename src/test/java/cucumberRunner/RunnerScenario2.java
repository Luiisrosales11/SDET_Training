package cucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/cucumberAssignmentFeatures/Scenario2.feature",
		glue = "stepsDefinition2",
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		plugin = {"pretty", "html:CucumberReports"}
		)
public class RunnerScenario2 extends AbstractTestNGCucumberTests{

}
