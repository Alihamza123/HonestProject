package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import framework.config.TestCore;
import framework.utils.Wait;

public class PressPage {

	WebDriver driver;
	
	public PressPage(WebDriver driver) {
		this.driver = driver;
	}

	public PressPage user_Selects_2ndImage() throws Exception {

		/*
		 * This method waits for Press Image to be visible
		 * Then Clicks the Press Image top most influential people
		 * Then waits for few seconds using Thread.sleep to capture screenshot of the Image		 *
		 */
		
		Wait.elementToBeVisible(pressImage, 20, driver);

		pressImage.click();
		
		Thread.sleep(3000L);
		
		TestCore.captureScreenshot(driver, "Press2ndImage");
		
		return this;
	}
		
	@CacheLookup
	@FindBy(xpath = ".//*[@id='accordion-1']/dl/dd[2]/div/a")
	WebElement pressImage;
}
