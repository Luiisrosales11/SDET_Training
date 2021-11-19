package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.DriverInstance;
import hooks.Hooks;

public class Steps extends DriverInstance{
	
	
	@Given("user should launch browser")
	public void userShouldLaunchBrowser() {
			System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
			driver = new ChromeDriver();
	}

	@Given("user goto google website")
	public void userGotoGoogleWebsite() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@When("user search for the {string}")
	public void userSearchForThe(String value) {
	   driver.findElementByName("q").sendKeys(value, Keys.ENTER);
	}

	@Then("page title should have {string}")
	public void pageTitleShouldHave(String string) {
	    System.out.println(driver.getTitle());
	}

	@Then("close the browser")
	public void closeTheBrowser() {
		driver.quit();
	}
	

}
