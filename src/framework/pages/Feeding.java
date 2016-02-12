package framework.pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;

public class Feeding extends TestCore {
	
	// MAIN CONSTRUCTOR
	public Feeding(WebDriver driver) {
		TestCore.driver = driver;
	}

	// METHOD FOR USER ( CLICKS FEEDING ON HEADER, WAIT FOR OUR COMMITMENT IMAGE TO SLIDE THEN SELECT THAT IMAGE )
	public Feeding101 click_OurCommitment() throws Exception {

		// wait for our commitment image to be visible
		explicitWait(ourCommitment, 20, driver);
		
		// capture screenshot of Our Commitment image once it shows
		if (ourCommitment.isDisplayed()) {
			File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Screenshot, new File(
					"C:\\Users\\Ali Hamza\\Desktop\\EclipseWorkspace\\Project Honest.com\\src\\libraries\\screenshots\\OurCommitment.jpg"));
		}
		
		// click on our commitment image
		ourCommitment.click();
		
		return PageFactory.initElements(driver, Feeding101.class);
	}

	@CacheLookup @FindBy(xpath = Elements.ourCommitment) WebElement ourCommitment;	
}
