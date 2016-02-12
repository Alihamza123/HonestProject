package framework.config;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.properties.TestData;

public class TestCore {

	public static WebDriver driver;
	public static String webpage = "https://www.honest.com/";
	public static Logger log = Logger.getLogger("TestCore");
	
	public static final int DEFAUL_WAIT_TIME = 20;

	public static void startBrowser() {
		
		PropertyConfigurator.configure("log4j.properties");
		
		if (TestData.browserToTest.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			log.info("~~~~~~~~~ Loading in Firefox Browser ~~~~~~~~~");
			
		} else if (TestData.browserToTest.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ali Hamza\\Desktop\\EclipseWorkspace\\Project Honest.com\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
			log.info("~~~~~~~~~ Loading in Chrome Browser ~~~~~~~~~");
			
		} else if (TestData.browserToTest.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Ali Hamza\\Desktop\\EclipseWorkspace\\Project Honest.com\\jars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			log.info("~~~~~~~~~ Loading in Inter Explorer Browser ~~~~~~~~~");
		}

		driver.manage().timeouts().implicitlyWait(DEFAUL_WAIT_TIME, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(webpage);
		log.info("Navigating to : " + driver.getCurrentUrl());
	}

	public static void closeBrowser() {
		log.info("########## SHUTTING DOWN BROWSER ##########" );
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
