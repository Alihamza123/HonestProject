package framework.config;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import framework.properties.TestData;

public class TestCore {

	public static WebDriver driver;
	public static String webpage = "https://www.honest.com/";
	public static Logger log = Logger.getLogger("honest");
	
	public static final int DEFAUL_WAIT_TIME = 20;

	public static void startBrowser() {
		
		if (TestData.browserToTest.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.println(" -------- STARTING TESTS IN MOZILLA FIREFOX BROWSER -------- ");
			
		} else if (TestData.browserToTest.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ali Hamza\\Desktop\\EclipseWorkspace\\Project Honest.com\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println(" -------- STARTING TESTS IN GOOGLE CHROME BROWSER -------- ");
			
		} else if (TestData.browserToTest.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Ali Hamza\\Desktop\\EclipseWorkspace\\Project Honest.com\\jars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println(" -------- STARTING TESTS IN INTERNET EXPLORER BROWSER -------- ");
			
		}

		driver.manage().timeouts().implicitlyWait(DEFAUL_WAIT_TIME, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(webpage);
	}

	public static void closeBrowser() {
		
		driver.quit();
	}


	
	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot "+e.getMessage());
		} 
	}
}
