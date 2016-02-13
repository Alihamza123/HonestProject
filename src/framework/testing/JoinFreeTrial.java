package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Homepage;
import framework.pages.LandingPage;
import framework.pages.MyAccountPage;

public class JoinFreeTrial extends TestCore {

	/*
	 * USE CASE 4.0 Reference : 
	 * TESTCASE04 Create Account
	 * ----------------------------------------- 
	 * User navigates to webpage User
	 * joins free trial User signs out of account
	 */

	@BeforeTest
	public void start_Up() {

		startBrowser();
		log.debug(" ----- STARTING JOIN FREE TRIAL TEST CASE ----- ");

	}

	@Test(description = " Join free trial ")
	public void accountCreation() {

		try {

			LandingPage land = PageFactory.initElements(driver, LandingPage.class);

			// USER JOINS FREE TRIAL FROM HOMEPAGE
			Homepage home = land.user_JoinsFreeTrial();
			log.debug(" User joined Free Trial - Successfully ");

			TestCore.captureScreenshot(driver, "FreeTrialJoined");
			log.debug(" Captured screenshot of page ");

			// VERIFY PAGE TITLE
			home.verifyHomePageTitle();
			log.debug(" Homepage Page Title verified ");

			MyAccountPage account = PageFactory.initElements(driver, MyAccountPage.class);

			// USER SIGNS OUT
			account.signOut();
			log.debug(" User signs out of Account ");

		} catch (Exception e) {
			log.debug(e.getMessage());
		}

	}
	
	@AfterTest
	public void tear_Down () {
		
		closeBrowser();
		log.debug(" ----- Shutting down Browser ----- ");
		
	}

}
