package hooks;

import org.openqa.selenium.OutputType;

import cucumber.api.Result.Type;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class Hooks extends DriverInstance{
	
	@BeforeStep
	public void beforeEachStep(Scenario sc) {
		if (driver != null) {
			byte[] screenShot = driver.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenShot, "image/png");
		}
	}
	
	@AfterStep
	public void afterEachStep(Scenario sc) {
		byte[] screenShot = driver.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenShot, "image/png");
	}
	
	@Before
	public void beforeSc(Scenario sc) {
		String name = sc.getName();	
	}
	
	@After
	public void afterSc(Scenario sc) {
			Type status = sc.getStatus();
			System.out.println("Result: " + status);
			boolean failed = sc.isFailed();
			
			if (failed) {
				byte[] screenShot = driver.getScreenshotAs(OutputType.BYTES);
				sc.embed(screenShot, "image/png");
			}
			
			driver.quit();
			
	}

}
