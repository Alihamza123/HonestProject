package framework.testing;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Account;
import framework.pages.FreeTrial;
import framework.pages.Homepage;

public class Create_Account extends TestCore {

	Account account;
	FreeTrial freetrial;
	Homepage homepage;
	
	@BeforeClass
	public void start_up() throws IOException, InterruptedException {
		log.debug(" WWW.HONEST.COM STARTING ( USER CREATES NEW ACCOUNT TESTS ) ");
		startBrowser();
	}

	@AfterClass
	public void shut_down() {
		closeBrowser();
	}

	@AfterMethod(description = "User signs out of Account")
	public void user_SignsOut() {
		try {
			homepage = new Homepage(driver);
			// USER SIGNS OUT / LOGS OUT OF ACCOUNT 
			homepage.user_SignsOutOfAccount();			
		} catch (Exception e) {
			log.debug("Returning  to homepage exception : " + e);
		}
	}
	
	@Test(description = " Create New Account in Honest.com ")
	public void user_CreatesAccount_FromFreeTrial() {
		try {
			freetrial = new FreeTrial(driver);			
			// USER CREATES NEW ACCOUNT FROM FIRST FREE TRIAL ALERT
			freetrial.user_JoinsFreeTrial();		
		} catch (Exception e) {
			log.debug("Creating New Account from FREE TRIAL Exception : " + e);
		}

	}

	@Test(description = "Create New Account from My account page ")
	public void user_CreatesNewAccount_FromMyAccount() {
		try {			
			account = new Account(driver);	
			// USER CREATES NEW ACCOUNT FROM ACCOUNT PAGE
			account.user_CreatesNewAccount();		
		} catch (Exception e) {
			log.debug("Creating new user from My account page exception : " + e);
		}
	}
}
