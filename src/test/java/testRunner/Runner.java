package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/features/Story.feature",
		glue = "steps",
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		plugin = {"pretty", "html:CucumberReports"}
		)
public class Runner extends AbstractTestNGCucumberTests{

}
