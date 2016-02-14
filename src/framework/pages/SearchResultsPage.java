package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import framework.utils.Wait;

public class SearchResultsPage {
	
	WebDriver driver;
	
	public SearchResultsPage(WebDriver driver){
		this.driver=driver;
	}

	public void validateSearchResult() throws Exception {
		
		/*
		 *  This method waits for Expected image to be visible
		 *  Then verifies and validates image is displayed
		 *  Then verifies and validates Page Title and Url
		 */
		
		Wait.elementToBeVisible(expectedImage, 20, driver);
		
		Assert.assertTrue(expectedImage.isDisplayed());
		
		String expectedUrl = "https://www.honest.com/health-and-wellness/baby-toddler-multi-powder";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));
	
		String expectedTitle = "Baby Toddler Multi Powder | Natural Products | The Honest Company";
		Assert.assertTrue(driver.getTitle().contains(expectedTitle));
		
	}

	@CacheLookup
	@FindBy(xpath = ".//div[@data-disable-touch='true']//img[@class='pdp-carousel-img img-responsive']")
	WebElement expectedImage;	
}
