package framework.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Cleaning;
import framework.pages.FreeTrial;

public class Cleaning_Navigation extends TestCore {

	FreeTrial freetrial;
	Cleaning cleaning;

	@BeforeClass
	public void start_up() throws Exception {
		log.debug(" WWW.HONEST.COM STARTING ( CLEANING NAVIGATION TESTS ) ");
		startBrowser();
		freetrial = new FreeTrial(driver);
		freetrial.close_freeTrialAlert();
	}

	@AfterClass
	public void shut_down() {
		closeBrowser();
	}

	@Test(description = " Cleaning navigation test")
	public void cleaning_Navigation() {
		try {
			cleaning = new Cleaning(driver);
			cleaning.cleaningNavigationTest();
		} catch (Exception e) {
			log.debug("CLEANING NAVIGATION EXCEPTION : " + e);
		}
	}

}
