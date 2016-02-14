package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.utils.Wait;

public class GiftsPage {

	WebDriver driver;

	public GiftsPage(WebDriver driver) {
		this.driver = driver;
	}

	public GiftsCardPage clickGiftCard() throws Exception {

		/*
		 *  This method waits for the gift card image to be visible
		 *  Then Clicks on Gift Card
		 */
		
		Wait.elementToBeVisible(giftCardImage, 25, driver);

		giftCardImage.click();

		return PageFactory.initElements(driver, GiftsCardPage.class);
	}

	// Elements that are used in the Gift card page
	@CacheLookup
	@FindBy(xpath = "html/body/div[5]/div[1]/div/div/div[4]/a/img")
	WebElement giftCardImage;
}
