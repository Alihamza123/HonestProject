package framework.testing;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.FreeTrial;
import framework.pages.PersonalCare;

public class Personal_Care_Navigation extends TestCore {

	PersonalCare personal;
	FreeTrial freetrial;

	@BeforeClass
	public void start_up() throws Exception {
		log.debug(" WWW.HONEST.COM STARTING ( PERSONAL CARE NAVIGATION TESTS ) ");
		startBrowser();
		freetrial = new FreeTrial(driver);
		freetrial.close_freeTrialAlert();
	}

	@AfterClass
	public void shut_down() {
		closeBrowser();
	}

	@Test(description = " Verify User Clicks Personal Care Navigation Image ")
	public void user_Clicks_PersonalCareImage() {
		
		try {
			personal = new PersonalCare(driver);
			personal.click_feminineCareImage();
			File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Screenshot, new File(
					"C:\\Users\\Ali Hamza\\Desktop\\screenshot.jpeg"));
		} catch (Exception e) {
			log.debug(" USER CLICKS PERSONAL CARE IMAGE EXCEPTION : " + e);
		}
	}
}
