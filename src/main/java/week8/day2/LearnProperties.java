package week8.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("Locator.properties"));
		System.setProperty("webdriver.chrome.driver", "./ChromeWebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElementById(prop.get("LoginPage.userName.id").toString()).sendKeys("standard_user");
		driver.findElementById(prop.get("LoginPage.password.id").toString()).sendKeys("secret_sauce");
		driver.findElementByXPath(prop.get("LoginPage.loginBtn.xpath").toString()).click();
		
	}

}
