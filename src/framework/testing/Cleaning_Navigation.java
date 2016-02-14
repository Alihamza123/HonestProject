package framework.testing;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.CleaningPage;
import framework.pages.HomePage;
import framework.pages.LandingPage;

public class Cleaning_Navigation extends TestCore {

	/*
	 * USE CASE 09 : REFERENCE : TESTCASE09 Cleaning Navigation
	 * --------------------------------------------------- User clicks on
	 * Cleaning from Header User selects Dish Soap User selects from drop down
	 * Lemon Verbana User increases Quantity to 5 Verify Image has changed
	 * 
	 */

	@BeforeTest
	public void startUp() {

		Logger log = Logger.getLogger("honest");
		log.info(" STARTING CLEANING NAVIGATION TEST ");

		startBrowser();
	}

	@Test(description = " Cleaning navigation test")
	public void canUserCleaningNavigate() throws Exception {

		try {
			
			LandingPage land = PageFactory.initElements(driver, LandingPage.class);
			
			HomePage home = land.closeFreeTrial();
			log.debug(" Closed Join Free Trial Alert ");
			
			home.verifyHomePageTitle();
			log.debug(" Homepage Title VERIFIED ");
			
			CleaningPage dish = home.navigateToCleaning();
			
			dish.clickDishSoap();
			dish.clickScentList();
			dish.increaseQuantity();
			dish.verifyImage();
			log.debug(" Dish Soap Successfully EDITED ");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			log.error(e.getMessage());
		}
	}
	
	@AfterTest(enabled = false)
	public void shutDown () {
		
		log.info(" FINISHING CLEANING NAVIGATION TEST ");
		closeBrowser();	
	}

}
