package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage{
	

	private By txtUsername = By.cssSelector("#txtUsername");
	private By txtPassword = By.cssSelector("#txtPassword");
	private By btnLogin = By.cssSelector("#btnLogin");
	
	public Login(WebDriver driver) {
		super(driver);
	}
	
	public void setUserName(String username) {
		type(username, txtUsername);
	}
	
	public void setPassword (String password) {
		type(password, txtPassword);
	}
	
	public Dashboard clickLoginButton( ) {
		click(btnLogin);
		return new Dashboard(driver);
	}

}
