package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Cleaning;
import framework.pages.HomepageHeader;

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
			
			HomepageHeader home = PageFactory.initElements(driver, HomepageHeader.class);
	
			// Click on Cleaning from Header
			Cleaning clean = home.click_Header_Cleaning();
			
			// User Selects Dish Soap
			clean.selectDishSoap();
			
			// User Selects Lemon Verbana
			clean.selectLemonVerbena();
			
			// User Increases Quantity to 5
			clean.increaseQuantity();
			
			// Verify Page Image
			clean.verifyImage();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		
	}

}
