package framework.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.FreeTrial;
import framework.pages.Search;

public class Main_Search extends TestCore {

	Search search;
	FreeTrial freetrial;

	@BeforeClass
	public void start_up() throws Exception {
		log.debug(" WWW.HONEST.COM STARTING ( MAIN SEARCH TESTS ) ");
		startBrowser();
		freetrial = new FreeTrial(driver);
		freetrial.close_freeTrialAlert();
	}

	@AfterClass
	public void shut_down() {
		closeBrowser();
	}
	
	@Test(description = " Verify User Can Search for (Baby & Toddler Multi Powder) and verify result ")
	public void user_Search() {
		try {
			search = new Search(driver);
			// USER PERFORMS THE MAIN SEARCH 
			search.main_Search_Test();
		} catch (Exception e) {
			log.debug(" USER SEARCHES FOR INPUT EXCEPTION : " + e);
		}
	}

}
