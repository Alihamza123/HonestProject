package framework.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.FreeTrial;
import framework.pages.Gifts;

public class Gifts_Navigation extends TestCore {

	FreeTrial freetrial;
	Gifts gifts;

	@BeforeClass
	public void start_up() throws Exception {
		log.debug(" WWW.HONEST.COM STARTING ( GIFT CARDS NAVIGATION TESTS ) ");
		startBrowser();
		freetrial = new FreeTrial(driver);
		freetrial.close_freeTrialAlert();
	}

	@AfterClass
	public void shut_down() {
		closeBrowser();
	}

	@Test(description = "GIFTS NAVIGATION TEST")
	public void user_Clicks_GiftCards() throws Exception {

		try {
			gifts = new Gifts(driver);
			// USER PERFORMS GIFTS NAVIGATION TEST
			gifts.gifts_Navigation_Test();
		} catch (Exception e) {
			log.debug("GIFTS NAVIGATION TEST EXCEPTION : " + e);
		}
	}
}
