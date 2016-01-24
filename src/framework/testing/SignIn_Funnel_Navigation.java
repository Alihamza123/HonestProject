package framework.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.FunnelNavigation;

public class SignIn_Funnel_Navigation extends TestCore {

	FunnelNavigation funnel;

	@BeforeClass
	public void start_up() throws Exception {
		log.debug(" WWW.HONEST.COM STARTING ( USER HOVERS OVER 5 SUB MENU ELEMENTS TESTS ) ");
		startBrowser();
	}

	@AfterClass
	public void shut_down() {
		closeBrowser();
	}

	@Test(description = "USER PERFORMS END-TO-END NAVIGATION FROM SIGN-IN TO CHECK-OUT")
	public void SignInFunnelNavigation() throws Exception {
		try {
			funnel = new FunnelNavigation(driver);
			funnel.funnelNavigation_Test();
		} catch (Exception e) {
			log.debug(e.getMessage());
		}

	}

}
