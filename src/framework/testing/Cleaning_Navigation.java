package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Cleaning;
import framework.pages.Homepage;

public class Cleaning_Navigation extends TestCore {

	/*
	 * USE CASE 09 :
	 * REFERENCE : TESTCASE09 Cleaning Navigation
	 * ---------------------------------------------------
	 * User clicks on Cleaning from Header
	 * User selects Dish Soap
	 * User selects from drop down Lemon Verbana
	 * User increases Quantity to 5
	 * Verify Image has changed
	 *  
	 */
	
	@Test(description = " Cleaning navigation test")
	public void cleaning_Navigation() throws Exception {
	
		try {
			
			Homepage home = PageFactory.initElements(driver, Homepage.class);
	
			// Click on Cleaning from Header
			Cleaning clean = home.click_Header_Cleaning();
			
			// Call Cleaning Navigation Method
			clean.cleaningNavigationTest();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		
	}

}
