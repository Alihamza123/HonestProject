package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import framework.config.TestCore;
import framework.properties.Elements;

public class Press extends TestCore {

	// MAIN CONSTRUCTOR
	public Press(WebDriver driver) {
		TestCore.driver = driver;
	}

	// METHOD FOR USER ( SELECTS 2ND IMAGE 100 MOST CREATIVE PEOPLE, AND CAPTURE SCREENSHOT OF THE IMAGE LOADED )
	public Press user_Selects_2ndImage() throws Exception {

		explicitWait(pressImage, 20, driver);

		// USER SELECTS THE 2ND ( THE 100 MOST CREATIVE PEOPLE ) IMAGE
		pressImage.click();
		
		// wait for few seconds then capture screenshot
		Thread.sleep(3000L);
		
		// call capture screenshot method
		TestCore.captureScreenshot(driver, "Press2ndImage");
		
		return this;
	}
		
	@CacheLookup@FindBy(xpath = Elements.pressImage)WebElement pressImage;
}
