package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.HeaderPage;

public class Header_SubMenu_Navigation extends TestCore {

	@Test(description = " User clicks 5 header sub menu elements", dependsOnMethods = { "click_5_HeaderElements" })
	public void click_5_Header_SubMenuElements() {

		try {

			HeaderPage head = PageFactory.initElements(driver, HeaderPage.class);

			// user clicks Header diapering -- then Swim Diapers
			head.click_Diapering_SwimDiapers();

			driver.navigate().back();

			// user clicks Header feeding -- then infant formula
			head.click_Feeding_InfantFormula();

			driver.navigate().back();

			// user clicks Header Personal Care -- then hand sanitizer
			head.click_PersonalCare_HandSanitizer();

			driver.navigate().back();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
