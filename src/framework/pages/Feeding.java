package framework.pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;

public class Feeding extends TestCore {

	@FindBy(xpath = Elements.feeding)
	WebElement feeding;
	@FindBy(xpath = Elements.ourCommitment)
	WebElement ourCommitment;
	@FindBy(xpath = Elements.verifyFeedingImage)
	WebElement verifyFeedingImage;
	
	
	// MAIN CONSTRUCTOR
	public Feeding(WebDriver driver) {
		TestCore.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// METHOD FOR FEEDING NAVIGATION TEST
	public Feeding feedingNavigationTest() throws Exception{
		
		try {
			user_Clicks_Feeding();
		} catch (Exception e) {
			log.debug(e);
		} finally {
			verify_PageImage();
		}
		
		return new Feeding(driver);
	}

	// METHOD FOR USER ( CLICKS FEEDING ON HEADER, WAIT FOR OUR COMMITMENT IMAGE TO SLIDE THEN SELECT THAT IMAGE )
	public Feeding user_Clicks_Feeding() throws Exception {

		explicitWait(feeding, 20, driver);

		feeding.click();
		log.debug("Feeding HEADER [ CLICKED ] ");
		
		explicitWait(ourCommitment, 20, driver);
		
		// capture screenshot of Our Commitment image once it shows
		if (ourCommitment.isDisplayed()) {
			File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Screenshot, new File(
					"C:\\Users\\Ali Hamza\\Desktop\\EclipseWorkspace\\Project Honest.com\\src\\libraries\\screenshots\\OurCommitment.jpg"));
		}

		ourCommitment.click();
		log.debug(" OUR COMMITMENT PICTURE [ CLICKED ] ");

		return this;
	}

	// METHOD FOR VERIFYING IMAGE HAS LOADED ON PAGE 
	public Feeding verify_PageImage() throws Exception {
		
		explicitWait(verifyFeedingImage, 20, driver);	
		
		if (verifyFeedingImage.isDisplayed()) {
			log.debug(" FEEDING IMAGE [ VERIFICATION  PASSED ] ");
		} else {
			log.debug(" FEEDING IMAGE [ VERIFICATION FAILED ] ");
		}

		return this;
	}
}
