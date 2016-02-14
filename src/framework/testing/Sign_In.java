package framework.testing;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.MyAccountPage;
import framework.pages.HomePage;
import framework.pages.LandingPage;

public class Sign_In extends TestCore {



	/*@AfterMethod
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
	public void signInToAccount() {

		try {
			account = new MyAccountPage(driver);
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
	}*/

}
