package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Gifts;
import framework.pages.HomepageHeader;

public class Gifts_Navigation extends TestCore {

	@Test(description = "GIFTS NAVIGATION TEST")
	public void giftCard_Test() throws Exception {

		try {

			HomepageHeader home = PageFactory.initElements(driver, HomepageHeader.class);

			Gifts gift = home.click_Header_Gifts();

			gift.click_GiftCardImage();

			gift.user_Enters_InvalidAmount("789");

			TestCore.captureScreenshot(driver, "TextPopUp");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
