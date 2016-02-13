package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import framework.config.TestCore;
import framework.properties.Elements;

public class SearchResultsPage extends TestCore {
	
	public SearchResultsPage(WebDriver driver){
		TestCore.driver=driver;
	}

	// METHOD FOR VERIFYING ( EXPECTED IMAGE / URL / PAGE TITLE WITH ACTUAL )
	public void verify_UrlAndTitle() throws Exception {
		
		explicitWait(expectedImage, 20, driver);
		
		// VERIFY RESULT IMAGE IS VISIBLE
		Assert.assertTrue(expectedImage.isDisplayed());
		
		// VERIFY ACTUAL / EXPECTED URL 
		String expectedUrl = "https://www.honest.com/health-and-wellness/baby-toddler-multi-powder";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));
	
		// VERIFY ACTUAL / EXPECTED PAGE TITLE
		String expectedTitle = "Baby Toddler Multi Powder | Natural Products | The Honest Company";
		Assert.assertTrue(driver.getTitle().contains(expectedTitle));
		
	}

	@CacheLookup@FindBy(xpath = Elements.expectedImage)WebElement expectedImage;	
}
