package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.HeaderPage;

public class Header_Navigation extends TestCore {


	@Test(description = " Header Navigation Test ")
	public void click_5_HeaderElements() throws Exception{
		
		try {

			HeaderPage header = PageFactory.initElements(driver, HeaderPage.class);
			
			// user clicks header bundles
			header.click_Bundles();
			
			driver.navigate().back();
			
			// user clicks header cleaning
			header.click_Cleaning();
			
			driver.navigate().back();
			
			// user clicks header diapering
			header.click_Diapering();
			
			driver.navigate().back();
			
			// user clicks header feeding
			header.click_Feeding();
			
			driver.navigate().back();
			
			// user clicks header gears
			header.click_Gears();
			
			driver.navigate().back();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
