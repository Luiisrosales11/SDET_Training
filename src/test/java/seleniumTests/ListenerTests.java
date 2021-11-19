package seleniumTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseTests.BaseTest;
@Listeners(listeners.TestListener.class)

public class ListenerTests extends BaseTest{
	
	@Test(priority = 1, enabled = true)
	public void loginTest() {
		loginPage.setUserName("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickLoginButton();
	}
	
	@Test(retryAnalyzer = listeners.RetryListener.class, priority = 2)
	public void getDashboardHeadingTest( ) {
		dashboardPage.clickDashboardTab();
		dashboardPage.getDashboardHeading();
		//fail to test retryAnalyzer
		Assert.assertEquals(dashboardPage.getDashboardHeading(), "Dash");
	}

}
