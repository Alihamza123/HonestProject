package framework.testing;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.HomePage;
import framework.pages.LandingPage;
import framework.pages.LoginRegisterPage;
import framework.pages.MyAccountPage;

public class CreateNewAccount extends TestCore {

	/*
	 * USE CASE 4.1 
	 * Reference : TEST_CASE04 Create Account
	 * ------------------------------------------ 
	 * User clicks on My Account from Footer
	 * User Registers for new Account 
	 * Verify Logged in account page Title
	 * User signs out of account
	 * Verify Homepage Title
	 * 
	 */
	
	@BeforeTest
	public void startUp() {
		
		Logger log = Logger.getLogger("honest");
		log.info(" STARTING CREATE NEW ACCOUNT FROM LOG IN/REGISTER PAGE TEST ");
		
		startBrowser();
	}


	@Test
	public void canUserRegisterNewAccount() throws Exception {
		
		try {
			
			LandingPage land = PageFactory.initElements(driver, LandingPage.class);
			
			HomePage home = land.closeFreeTrial();	
			log.debug(" Closed Join Free Trial Alert ");
			
			home.verifyHomePageTitle();		
			log.debug(" HomePage Title VERIFIED ");		
			
			LoginRegisterPage register = home.clickMyAccountFooter();
			
			register.validatePageTitle();		
			log.debug(" Log in / Register Page Title VERIFIED ");
			
			MyAccountPage account = register.typeNewUserData();
			
			account.validateLoggedInText();
			log.debug(" User Logged In Text VERIFIED ");
			
			account.signOut();
			
			home.verifyHomePageTitle();
			log.debug(" Navigated To HomePage Title VERIFIED ");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			log.error(e.getMessage());
		}
				
	}
	
	@AfterTest
	public void shutDown () {
		
		log.info(" FINISHING CREATE NEW ACCOUNT FROM LOG IN/REGISTER PAGE TEST ");
		closeBrowser();	
	}

}
