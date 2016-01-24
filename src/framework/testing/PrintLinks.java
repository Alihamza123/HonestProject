package framework.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.FreeTrial;
import framework.pages.Links;

public class PrintLinks extends TestCore {

	FreeTrial freetrial;
	Links links;

	@BeforeClass
	public void start_up() throws Exception {
		log.debug(" WWW.HONEST.COM STARTING ( LINKS TESTS ) ");
		startBrowser();
		freetrial = new FreeTrial(driver);
		freetrial.close_freeTrialAlert();
	}

	@AfterClass
	public void shut_down() {
		closeBrowser();
	}

	@Test(description = "USER PRINTS ALL LINKS ON HOMEPAGE")
	public void print_AllTheLinks() {

		try {
			links = new Links(driver);
			links.print_AllLinks();
		} catch (Exception e) {
			log.debug(e.getMessage());
		}

	}

	@Test(description = "USER PRINTS SPECIFIC NUMBER OF LINK (9) ", dependsOnMethods = { "print_AllTheLinks" })
	public void print_SpecificLink() {

		try {
			links = new Links(driver);
			links.print_SpecificLink(9);
		} catch (Exception e) {
			log.debug(e.getMessage());
		}

	}

}
