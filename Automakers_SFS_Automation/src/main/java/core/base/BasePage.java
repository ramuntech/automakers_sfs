package core.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	//variables / objects
	private WebDriver driver = null;
	private int explictiWait = 60;
	private WebDriverWait wait  = null;

	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getElement(By locator) {
		wait = new WebDriverWait(driver, explictiWait);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
	}
	
	public void setText(By locator, String content) {
		wait = new WebDriverWait(driver, explictiWait);
		wait.until(ExpectedConditions.elementSelectionStateToBe(locator, true));
		getElement(locator).sendKeys(content);
	}
	
	public void click(By locator) {
		wait = new WebDriverWait(driver, explictiWait);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		getElement(locator).click();
	}

}
