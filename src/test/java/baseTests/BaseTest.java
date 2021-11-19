package baseTests;

import pages.Dashboard;
import pages.Login;
import pages.PIM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
	
	private WebDriver driver;
	private final String url = "https://opensource-demo.orangehrmlive.com/";
	protected Login loginPage;
	protected Dashboard dashboardPage;
	protected PIM pimPage;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		loginPage = new Login(driver);
		dashboardPage = new Dashboard(driver);
		pimPage = new PIM(driver);
	}
	
	@AfterClass
	public void tear() {
		driver.close();
	}
}