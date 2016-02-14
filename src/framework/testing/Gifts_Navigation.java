package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.GiftsPage;
import framework.pages.HeaderPage;

public class Gifts_Navigation extends TestCore {

	@Test(description = "GIFTS NAVIGATION TEST")
	public void giftCard_Test() throws Exception {

		try {

			HeaderPage home = PageFactory.initElements(driver, HeaderPage.class);

			GiftsPage gift = home.click_Header_Gifts();

			gift.click_GiftCardImage();

			gift.user_Enters_InvalidAmount("789");

			TestCore.captureScreenshot(driver, "TextPopUp");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
