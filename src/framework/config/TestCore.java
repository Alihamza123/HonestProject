package framework.config;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.properties.TestData;

public class TestCore {

	public static WebDriver driver;
	public static String webpage = "https://www.honest.com/";
	public static Logger log = Logger.getLogger("honest");
	public static final int DEFAUL_WAIT_TIME = 12;

	public static void startBrowser() {

		if (TestData.browserToTest.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			log.debug("~~~~~~~~~ Loading in Firefox Browser ~~~~~~~~~");
			driver.manage().window().maximize();
			driver.get(webpage);
			log.debug(" NAVIGATING TO ... " + driver.getCurrentUrl());
		} else if (TestData.browserToTest.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ali Hamza\\Desktop\\EclipseWorkspace\\Project Honest.com\\src\\libraries\\jar_files\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			log.debug("~~~~~~~~~ Loading in Chrome Browser ~~~~~~~~~");
			driver.manage().window().maximize();
			driver.get(webpage);
			log.debug(" NAVIGATING TO ... " + driver.getCurrentUrl());
		}

		driver.manage().timeouts().implicitlyWait(DEFAUL_WAIT_TIME, TimeUnit.SECONDS);
	}

	public static void closeBrowser() {
		log.debug(" --------------------------- CLOSING ALL PAGES --------------------------- ");
		driver.quit();
	}

	public static WebElement explicitWait(WebElement locator, int timeout, WebDriver driver) throws Exception {

		WebElement element;

		try {
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOf(locator));

			driver.manage().timeouts().implicitlyWait(DEFAUL_WAIT_TIME, TimeUnit.SECONDS);

			return element;
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		return null;
	}
}
