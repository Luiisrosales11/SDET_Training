package cucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/cucumberAssignmentFeatures/Scenario1.feature",
		glue = "stepsDefinition1",
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		plugin = {"pretty", "html:CucumberReports"}
		)
public class RunnerStepsScenario1 extends AbstractTestNGCucumberTests{
	

}
