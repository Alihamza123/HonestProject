package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import framework.config.TestCore;
import framework.properties.Elements;

public class PersonalCare extends TestCore {
	
	// MAIN CONSTRUCTOR
	public PersonalCare(WebDriver driver) {
		TestCore.driver = driver;
	}

	// METHOD FOR USER ( CLICKS PERSONAL CARE ON HEADER, CLICK ON FEMININE IMAGE, VERIFY URL/PAGE TITLE )
	public PersonalCare click_feminineCareImage() throws Exception {

		// wait for feminine image to be visible
		explicitWait(feminineImage, 20, driver);

		// verify feminine image is visible then click the image
		Assert.assertTrue(feminineImage.isDisplayed());
		feminineImage.click();

		return new PersonalCare(driver);
	}
	
	// METHOD FOR VERIFYING PAGE TITLE AND PAGE URL
	public void verify_ImagePageTitleUrl () {
		
		// VERIFY ACTUAL / EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/feminine-care";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertTrue(actualUrl.contains(expectedUrl));
		
		String expectedTitle = "Feminine Care | Feminine Hygiene | The Honest Company";
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains(expectedTitle));
	}
	
	@CacheLookup@FindBy(xpath = Elements.feminineImage)WebElement feminineImage;

}
