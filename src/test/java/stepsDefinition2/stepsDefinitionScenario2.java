package stepsDefinition2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepsDefinitionScenario2 {
	WebDriver driver;
	
	@Given("On home page of application")
	public void onHomePageOfApplication() {
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Then("Login to Application")
	public void loginToApplication() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	}

	@When("click on Admin link")
	public void clickOnAdminLink() {
		driver.findElement(By.xpath("//*[contains(text(), 'Admin')]")).click();
	}

	@Then("Click on Job")
	public void clickOnJob() {
		WebElement jobOption = driver.findElement(By.id("menu_admin_Job"));
		Actions action = new Actions(driver);
		action.moveToElement(jobOption).perform();
		
	}

	@Then("Validate text Job title")
	public void validateTextJobTitle() {
	    Assert.assertEquals(driver.findElement(By.id("menu_admin_viewJobTitleList")).getText(), "Job Titles");
	}
}
