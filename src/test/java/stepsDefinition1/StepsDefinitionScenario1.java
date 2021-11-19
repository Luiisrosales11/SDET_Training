package stepsDefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinitionScenario1 {
	WebDriver driver;
	
	@Given("I am in orangeHRP Application")
	public void iAmInOrangeHRPApplication() {
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("logInPanelHeading")).isDisplayed();
	}

	@When("Login to Application")
	public void loginToApplication() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("Dashboard page is available")
	public void dashboardPageIsAvailable() {
		driver.findElement(By.xpath("//*[contains(text(), 'Dashboard')]")).isDisplayed();
	}

	@Then("Click on Admin menu")
	public void clickOnAdminMenu() {
		driver.findElement(By.xpath("//*[contains(text(), 'Admin')]")).click();
	}
}
