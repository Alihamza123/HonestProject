package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.FeedingPage;
import framework.pages.Feeding101Page;
import framework.pages.HeaderPage;

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

	@Test(description = " FEEDING NAVIGATION TEST ")
	public void feedingNavigationTest() {
		try {
			
			HeaderPage home = PageFactory.initElements(driver, HeaderPage.class);
			
			// user clicks on Feeding from Header
			FeedingPage feed = home.click_Header_Feeding();
			
			// user wait for our commitment image to load then clicks it 
			Feeding101Page commitPage = feed.click_OurCommitment();
			
			// verify image has loaded on page 
			commitPage.verify_PageImage();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
