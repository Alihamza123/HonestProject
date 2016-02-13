package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Account;
import framework.pages.HomepageFooter;
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

		HomepageFooter home = PageFactory.initElements(driver, HomepageFooter.class);

		// user clicks on My Account From Footer
		Account account = home.click_MyAccount_Footer();

		// user enters Valid New Registration Data
		MyAccountPage user = account.user_Inputs_NewUserData();

		// verify page text 
		user.verify_MyAccount_Text();
		
		// user signs out of account
		user.signOut();

	}

}
