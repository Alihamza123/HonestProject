package framework.testing;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.HeaderPage;
import framework.pages.LandingPage;

public class Header_SubMenu_Navigation extends TestCore {

	@BeforeTest
	public void startUp() {

		Logger log = Logger.getLogger("honest");
		log.info(" STARTING SUB MENU NAVIGATION TEST ");

		startBrowser();
	}
	
	
	@Test(description = " Navigate to Sub menus ")
	public void canUserNavigateToSubMenus() {

		try {

			LandingPage land = PageFactory.initElements(driver, LandingPage.class);
			
			HeaderPage header = land.closeFreeTrialToHeaderPage();
			
			header.submenuHandSanitizer();
			
			driver.get(webpage);
			
			header.submenuInfantFormula();
			
			driver.get(webpage);
			
			header.submenuSwimDiapers();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@AfterTest
	public void shutDown () {
		
		log.info(" SHUTTING SUB MENU NAVIGATION TEST ");
		closeBrowser();	
	}
}
