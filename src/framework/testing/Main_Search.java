package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Homepage;
import framework.pages.LandingPage;
import framework.pages.SearchResultsPage;

public class Main_Search extends TestCore {

	
/*	@Test(description = " Verify User Can Search for (Baby & Toddler Multi Powder) and verify result ")
	public void user_Search() {
		try {
			search = new Search(driver);
			// USER PERFORMS THE MAIN SEARCH 
			search.main_Search_Test();
		} catch (Exception e) {
			log.debug(" USER SEARCHES FOR INPUT EXCEPTION : " + e);
		}
	}*/

	@BeforeTest
	public void start_Up() {
		
		startBrowser();
		log.debug(" ---- Starting SEARCH TEST CASE ---- ");
		
	}
	
	@Test
	public void search_Test () throws Exception {
		
		try {
			LandingPage land = PageFactory.initElements(driver, LandingPage.class);
			
			// close free trial alert
			Homepage home = land.close_freeTrialAlert();
			log.debug(" Closed Free Trial Alert ");
			
			// user searches for "baby"
			home.user_Types_SearchBox();
			
			// capture screenshot of results set
			TestCore.captureScreenshot(driver, "SearchResultsList");
			log.debug(" Captured screenshot of Dynamic Search Results ");
			
			// user selects "Baby & Toddler Multi Powder" from dynamic results set
			SearchResultsPage results = home.select_DynamicSearchResult();
			
			// verify results page
			results.verify_UrlAndTitle();	
			log.debug(" Page Results verification - PASS ");
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		
	}
	
	@AfterTest
	public void tear_Down () {
		
		closeBrowser();
		log.debug(" ----- Shutting down Browser ----- ");
		
	}
}
