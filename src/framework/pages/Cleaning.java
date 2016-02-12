package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import framework.config.TestCore;
import framework.properties.Elements;

public class Cleaning extends TestCore {

	@CacheLookup @FindBy(xpath = Elements.dishSoap)	WebElement dishSoap;
	@CacheLookup @FindBy(xpath = Elements.scentList) WebElement scentList;
	@CacheLookup @FindBy(xpath = Elements.increase)	WebElement increase;
	@CacheLookup @FindBy(xpath = Elements.cleaning)	WebElement itemImage;

	// MAIN CONSTRUCTOR
	public Cleaning(WebDriver driver) {
		TestCore.driver = driver;
	}

	// METHOD FOR USER (CLICKS CLEANING ON HEADER, THEN SELECTS DISH SOAP)
	public Cleaning selectDishSoap() throws Exception {

		// wait for dish soap to be visible
		explicitWait(dishSoap, 20, driver);

		// click on dish soap item
		dishSoap.click();

		return this;
	}

	// METHOD FOR SELECTING LEMON VERBANA FROM DROP DOWN
	public Cleaning selectLemonVerbena() throws Exception {

		// wait for scent list to be visible
		explicitWait(scentList, 20, driver);

		// select scent list
		Select scent = new Select(scentList);
		
		// click on lemon verbana
		scent.selectByIndex(1);

		return this;
	}

	// METHOD FOR INCREASING QUANTITY TO 5
	public Cleaning increaseQuantity() throws Exception {

		// wait for increase element to be visible
		explicitWait(increase, 20, driver);

		// loop to increase quantity to + 5
		int a = 1;
		while (a < 5) {
			increase.click();
			a++;
		}

		return this;
	}

	// METHOD FOR VERIFYING PAGE ON IMAGE HAS LOADED
	public Cleaning verifyImage() throws Exception {

		// wait for item image to be visible
		explicitWait(itemImage, 20, driver);

		// verify item image is displayed
		Assert.assertEquals(itemImage.isDisplayed(), true);

		return this;
	}

	// METHOD FOR COMPLETE CLEANING NAVIGATION 
	public Cleaning cleaningNavigationTest() throws Exception {

		selectDishSoap();
		selectLemonVerbena();
		increaseQuantity();
		verifyImage();
		log.info(" CLEANING NAVIGATION TEST - COMPLETE ");

		return PageFactory.initElements(driver, Cleaning.class);
	}

}
