package framework.testing;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Feeding101Page;
import framework.pages.FeedingPage;
import framework.pages.HeaderPage;
import framework.pages.LandingPage;

public class Feeding_Navigation extends TestCore {

	/*
	 * USE CASE 10 :
	 * Reference to : TESTCASE10 Feeding Navigation
	 * -------------------------
	 * 
	 * User clicks on Feeding from Header
	 * User waits for OUR COMMITMENT image to load
	 * Clicks on OUR COMMITMENT image
	 * Verify at the bottom of the page the CONTAINER image is present
	 */

	@BeforeTest
	public void startUp() {

		Logger log = Logger.getLogger("honest");
		log.info(" STARTING FEEDING NAVIGATION TEST ");

		startBrowser();
	}
	
	@Test(description = " FEEDING NAVIGATION TEST ")
	public void feedingNavigationTest() {
		
		try {
			
			LandingPage land = PageFactory.initElements(driver, LandingPage.class);
			
			HeaderPage header = land.closeFreeTrialToHeaderPage();
						
			FeedingPage feed = header.navigateToFeeding();
			
			Feeding101Page commitment = feed.click_OurCommitment();
			
			commitment.verifyFeedingImage();		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			log.debug(e.getMessage());
		}
	}

	@AfterTest(enabled = false)
	public void shutDown () {
		
		log.info(" FINISHING FEEDING NAVIGATION TEST ");
		closeBrowser();	
	}
}
