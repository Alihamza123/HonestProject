package framework.pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;

public class Gifts extends TestCore {

	// MAIN CONSTRUCTOR
	public Gifts(WebDriver driver) {
		TestCore.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Elements.gifts)
	WebElement gifts;
	@FindBy(xpath = Elements.giftCardImage)
	WebElement giftCardImage;
	@FindBy(xpath = Elements.customizeAmount)
	WebElement customizeAmount;
	@FindBy(xpath = Elements.buyNowButton)
	WebElement buyNowButton;
	@FindBy(xpath = Elements.scrollDown)
	WebElement scrollDown;
	
	// METHOD FOR GIFTS NAVIGATION TEST
	public Gifts gifts_Navigation_Test() throws Exception {

		try {
			user_Selects_Giftcards();
			user_Enters_InvalidAmount("700");
			verify_TextPopup();
		} catch (Exception e) {
			log.debug(e);
		}

		return new Gifts(driver);
	}

	// METHOD FOR USER ( CLICKS GIFTS ON HEADER, WAIT FOR GIFT CARD IMAGE TO LOAD THEN CLICK IT )
	public Gifts user_Selects_Giftcards() throws Exception {

		explicitWait(gifts, 20, driver);

		// USER CLICKS (GIFTS) ON HEADER
		gifts.click();
		log.debug(" GIFTS ON HEADER NOW CLICKED ");

		explicitWait(giftCardImage, 20, driver);
		
		// USER CLICKS GIFT CARD IMAGE
		giftCardImage.click();
		log.debug(" GIFT CARD IMAGE NOW CLICKED ");

		return this;
	}

	// METHOD FOR USER ( ENTERS INVALID AMOUNT )
	public Gifts user_Enters_InvalidAmount(String invalid_Amount) throws Exception {

		explicitWait(customizeAmount, 20, driver);

		// USER TYPES AN INVALID CUSTOMIZED AMOUNT
		if (customizeAmount.isEnabled()) {
			customizeAmount.sendKeys(invalid_Amount);
			log.debug(" ENTERING CUSTOMIZE AMOUNT : " + invalid_Amount);
		} else {
			log.debug(" CUSTOMIZE AMOUNT BOX NOT ENABLED ");
		}

		return this;
	}
	
	// METHOD FOR USER ( CLICKS BUY NOW BUTTON BUTTON , CAPTURE THE INVALID AMOUNT ALERT ) 
	public Gifts verify_TextPopup() throws Exception {

		explicitWait(buyNowButton, 20, driver);

		// PAGE SCROLL DOWN A LITTLE
		scrollDown.sendKeys(Keys.ARROW_DOWN);
		scrollDown.sendKeys(Keys.ARROW_DOWN);

		// USER CLICKS BUY NOW BUTTON
		buyNowButton.click();

		Thread.sleep(2000L);

		// SYSTEM CAPTURES SCREENSHOT OF INVALID AMOUNT AND POP UP MESSAGE
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File(
				"C:\\Users\\Ali Hamza\\Desktop\\EclipseWorkspace\\Project Honest.com\\src\\libraries\\screenshots\\TEXTPOPUP.jpg"));

		return this;
	}
}
