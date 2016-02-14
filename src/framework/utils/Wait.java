package framework.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static final int DEFAULT_WAIT_TIME = 20;

	public static WebElement elementToBeVisible(WebElement locator, int timeout, WebDriver driver) throws Exception {

		WebElement element;

		/*
		 * WAIT FOR ELEMENT TO BE VISIBLE IN THE DOM
		 */

		try {
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOf(locator));

			driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_TIME, TimeUnit.SECONDS);

			return element;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static WebElement elementToBeClickable(WebElement locator, int timeOutInSeconds, WebDriver driver) {

		WebElement element;

		/*
		 * WAIT FOR ELEMENT TO BE CLICKABLE
		 */

		try {

			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);

			element = wait.until(ExpectedConditions.elementToBeClickable(locator));

			driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_TIME, TimeUnit.SECONDS);

			return element;

		} catch (Exception e) {

			e.printStackTrace();

		}

		return null;

	}

}
