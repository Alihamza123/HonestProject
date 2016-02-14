package framework.testing;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.HomePage;
import framework.pages.LandingPage;

public class JoinFreeTrial extends TestCore {

	/*
	 * USE CASE 4.0 Reference : 
	 * TESTCASE04 Create Account
	 * ----------------------------------------- 
	 * User navigates to webpage User
	 * joins free trial User signs out of account
	 */

	@BeforeTest
	public void startUp() {
		
		Logger log = Logger.getLogger("honest");
		log.info(" STARTING JOIN FREE TRIAL TEST ");
		
		startBrowser();
	}

	@Test(description = " Can User Join Free Trial ?")
	public void canJoinFreeTrial() throws Exception {
		
		try {
			
			LandingPage land = PageFactory.initElements(driver, LandingPage.class);
			
			HomePage loggedIn = land.joinFreeTrial();
			log.debug(" User Joined Free Trial ");
			
			loggedIn.verifyHomePageTitle();
			log.debug(" Homepage Title VERIFIED ");
			
			HomePage loggedOut = loggedIn.signOut();
			log.debug(" User Logged Out ");
			
			loggedOut.verifyHomePageTitle();
			log.debug(" Homepage Title VERIFIED ");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			log.error(e.getMessage());
		}		
	}

	@AfterTest
	public void shutDown () {
		
		log.info(" FINISHING JOIN FREE TRIAL TEST ");
		closeBrowser();		
	}

}
