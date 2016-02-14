package framework.testing;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.HomePage;
import framework.pages.LandingPage;
import framework.pages.SearchResultsPage;

public class Main_Search extends TestCore {

	@BeforeTest
	public void startUp() {

		Logger log = Logger.getLogger("honest");
		log.info(" STARTING SEARCH TEST ");

		startBrowser();
	}

	@Test
	public void search_Test() throws Exception {

		try {

			LandingPage land = PageFactory.initElements(driver, LandingPage.class);

			HomePage home = land.closeFreeTrial();

			SearchResultsPage results = home.typeInSearchBox();

			results.validateSearchResult();

		} catch (Exception e) {
			log.debug(e.getMessage());
		}

	}

	@AfterTest
	public void shutDown() {

		log.info(" SHUTTING SEARCH NAVIGATION TEST ");
		closeBrowser();
	}
}
