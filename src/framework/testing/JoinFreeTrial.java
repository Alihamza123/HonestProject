package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.LandingPage;
import framework.pages.Homepage;
import framework.pages.MyAccountPage;

public class JoinFreeTrial extends TestCore {

	/*
	 * USE CASE 4.0 
	 *  Reference : TESTCASE04 Create Account
	 * -----------------------------------------
	 * User navigates to webpage
	 * User joins free trial 
	 * User signs out of account
	 */

	@Test(description = " Join free trial | sign out ")
	public void accountCreation() {
		
		try {

			LandingPage land = PageFactory.initElements(driver, LandingPage.class);

			// USER JOINS FREE TRIAL FROM HOMEPAGE
			Homepage home = land.user_JoinsFreeTrial();

			// VERIFY PAGE TITLE
			home.verifyHomePageTitle();

			MyAccountPage account = PageFactory.initElements(driver, MyAccountPage.class);

			// USER SIGNS OUT
			account.signOut();
			
		} catch (Exception e) {
			log.debug("Creating New Account from FREE TRIAL Exception : " + e);
		}

	}

}
