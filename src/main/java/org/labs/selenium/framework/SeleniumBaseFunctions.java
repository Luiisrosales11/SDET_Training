package org.labs.selenium.framework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBaseFunctions implements Browser, Element{



	public RemoteWebDriver driver = null;
	public WebDriverWait wait = null;
	private long timeOut = 30;


	@Override
	public void click(WebElement ele) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			System.out.println("The element is clicked");
		} catch (StaleElementReferenceException e) {
			throw new StaleElementReferenceException("Element is not clicked");
		}
	}

	@Override
	public void append(WebElement ele, String data) {
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.sendKeys(data);
			System.out.println("The value "+data+ " is appended");
		} catch (ElementNotInteractableException e) {
			throw new ElementNotInteractableException("Element is not interactable, try click by another locator");
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Test data is missing");
		}

	}

	@Override
	public void clear(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearAndType(WebElement ele, String data) {
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.clear();
			ele.sendKeys(data);
		} catch (ElementNotInteractableException e) {
			throw new ElementNotInteractableException("Element is not interactable, try click by another locator");
		}
	}

	@Override
	public String getElementText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBackgroundColor(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTypedText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyDisappeared(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyEnabled(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void startApp(String url) {
		try {
			System.setProperty("webdriver.chrome.driver", 
					"./driver/chromedriver.exe");
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, timeOut);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
			driver.get(url);
		}catch (WebDriverException e) {
			throw new WebDriverException("Unexpected Error");
		}

	}

	@Override
	public void startApp(String browser, String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public WebElement findElementBy(String locatorType, String value) {
		switch (locatorType.toLowerCase()) {
		case "id":
			return driver.findElement(By.id(value));
		case "xpath":

			


		default:
			break;
		}
		return null;
	}

	@Override
	public List<WebElement> findElementsBy(String type, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void switchToAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void typeAlert(String data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(String title) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(String idOrName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void defaultContent() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyUrl(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub

	}

}
