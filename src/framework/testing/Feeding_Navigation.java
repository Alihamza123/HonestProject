package framework.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Feeding;
import framework.pages.FreeTrial;

public class Feeding_Navigation extends TestCore {

	Feeding feeding;
	FreeTrial freetrial;

	@BeforeClass
	public void start_up() throws Exception {
		log.debug(" WWW.HONEST.COM STARTING ( FEEDING NAVIGATION TEST ) ");
		startBrowser();
		freetrial = new FreeTrial(driver);
		freetrial.close_freeTrialAlert();
	}

	@AfterClass
	public void shut_down() {
		closeBrowser();
	}

	@Test(description = " FEEDING NAVIGATION TEST ")
	public void user_clicks_ourCommitment() {
		try {
			feeding = new Feeding(driver);
			feeding.feedingNavigationTest();
		} catch (Exception e) {
			log.debug(" FEEDING NAVIGATION EXCEPTION : " + e);
		}
	}

}
