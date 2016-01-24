package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;
import framework.properties.TestData;

public class Search extends TestCore {
	
	// MAIN CONSTRUCTOR
	public Search(WebDriver driver) {
		TestCore.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Elements.searchBox)
	WebElement searchBox;
	@FindBy(xpath = TestData.searchData)
	WebElement searchData;
	@FindBy(xpath = Elements.resultDrop)
	WebElement resultDrop;
	@FindBy(xpath = Elements.expectedImage)
	WebElement expectedImage;	

	// METHOD FOR MAIN SEARCH TEST
	public Search main_Search_Test() throws Exception{
		
		try {
			user_SearchInput();
			verify_Search();
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		
		return new Search(driver);
	}

	// METHOD FOR USER ( SEARCHES FOR "BABY" , DYNAMIC RESULTS SHOW BABY & TODDLER MULTI POWDER, CLICK THE RESULT )
	public Search user_SearchInput() throws Exception{
	
		explicitWait(searchBox, 20, driver);
		
		// USER SEARCHES FOR INPUT
		searchBox.sendKeys(TestData.searchData);
		searchBox.clear();
		searchBox.click();
		searchBox.sendKeys(TestData.searchData);	
		
		explicitWait(resultDrop, 20, driver);
		
		// USER CLICKS RESULT DROP BABY & TODDLER MULTI POWDER
		resultDrop.click();
			
		return this;
	}

	// METHOD FOR VERIFYING ( EXPECTED IMAGE / URL / PAGE TITLE WITH ACTUAL )
	public Search verify_Search() throws Exception {
		
		explicitWait(expectedImage, 20, driver);
		
		// VERIFY RESULT IMAGE IS VISIBLE
		if (expectedImage.isDisplayed()){
			log.debug(" EXPECTED IMAGE OF VITAMIN POWDER ( SOLD OUT ) LOADED ");
		} else {
			log.debug(" EXPECTED IMAGE OF VITAMIN POWDER ( SOLD OUT ) NOT LOADED ");
		}
		
		// VERIFY ACTUAL / EXPECTED URL 
		String expectedUrl = "https://www.honest.com/health-and-wellness/baby-toddler-multi-powder";
		String actualUrl = driver.getCurrentUrl();	
		if (expectedUrl.equals(actualUrl)) {
			log.debug(" SEARCH URL VERIFICATION [ PASSED ] ");
		} else {
			log.debug(" SEARCH URL VERIFICATION [ FAILED ] ");
			log.debug(" ACTUAL URL = " + driver.getCurrentUrl());
		}
	
		// VERIFY ACTUAL / EXPECTED PAGE TITLE
		String actualTitle = driver.getTitle();
		String expectedTitle = "Baby Toddler Multi Powder | Natural Products | The Honest Company";
		if (actualTitle.equals(expectedTitle)) {
			log.debug(" SEARCH PAGE TITLE | VERIFICATION [ PASSED ] ");
		} else {
			log.debug(" SEARCH PAGE TITLE | VERIFICATION [ FAILED ] ");
			log.debug(" ACTUAL TITLE = " + driver.getTitle());
		}
		
		return this;
	}
}