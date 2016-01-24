package framework.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Footer;
import framework.pages.FreeTrial;

public class Footer_Navigation_Click extends TestCore {

	FreeTrial freetrial;
	Footer footer;

	@BeforeClass
	public void start_up() throws Exception {
		log.debug(" WWW.HONEST.COM STARTING ( USER CLICKS 5 FOOTER ELEMENTS TESTS ) ");
		startBrowser();
		freetrial = new FreeTrial(driver);
		freetrial.close_freeTrialAlert();
	}

	@AfterClass
	public void shut_down() {
		closeBrowser();
	}

	@Test(description = "All Footer Navigation ")
	public void footer_Navigation_Click() throws Exception {

		try {
			footer = new Footer(driver);
			footer.footer_Navigation_Click_Test();
		} catch (Exception e) {
			log.debug("Footer Navigation Click Exception : " + e);
		}
	}
}
