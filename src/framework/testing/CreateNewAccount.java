package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Account;
import framework.pages.Homepage;
import framework.pages.MyAccountPage;

public class CreateNewAccount extends TestCore {

	/*
	 * USE CASE 4.1 
	 * Reference : TEST_CASE04 Create Account
	 * ------------------------------------------ 
	 * User clicks on My Account from Footer
	 * User Registers for new Account 
	 * Verify Page Title
	 * User signs out of account
	 * 
	 */

	@Test
	public void userCreatesNewAccount() throws Exception {

		Homepage home = PageFactory.initElements(driver, Homepage.class);

		// user clicks on My Account From Footer
		Account account = home.click_MyAccount_Footer();

		// user enters Valid New Registration Data
		account.enters_NewUserData();

		// user clicks on Register Button
		MyAccountPage loggedIn = account.clickNewAccountButton();

		// verify page my account page title
		loggedIn.verifyPageTitle();

		// user logs out of account
		loggedIn.signOut();

	}

}
