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

public class Sign_In extends TestCore {

	Account account;
	Homepage homepage;
	FreeTrial freetrial;

	@BeforeClass
	public void start_up() throws Exception {
		log.debug(" WWW.HONEST.COM STARTING ( VALID LOG IN TESTS ) ");
		startBrowser();
		freetrial = new FreeTrial(driver);
		freetrial.close_freeTrialAlert();
	}

	@AfterClass
	public void shut_down() {
		closeBrowser();
	}

	@AfterMethod
	public void user_SignsOutOfAccount() throws Exception {

		try {
			homepage = new Homepage(driver);
			// USER SIGNS OUT / LOGS OUT OF ACCOUNT
			homepage.user_SignsOutOfAccount();
		} catch (IOException e) {
			log.debug("sign out exception : " + e);
		}
	}

	@Test(description = " user logs in from account page", priority = 1)
	public void user_LogsInFromMyAccount() {

		try {
			account = new Account(driver);
			// USER SIGNS IN / LOGS IN FROM ACCOUNT PAGE
			account.user_SignsIn_FromMyAccount();
		} catch (Exception e) {
			log.debug(" VALID LOG IN EXCEPTION : " + e);
		}
	}

	@Test(description = "user logs in from header", priority = 2)
	public void user_LogsInFromHeader() {

		try {
			homepage = new Homepage(driver);
			// USER SIGNS IN / LOGS IN FROM HEADER
			homepage.user_SignsIn_FromHeader();
		} catch (Exception e) {
			log.debug(" VALID LOG IN EXCEPTION : " + e);
		}
	}

}
