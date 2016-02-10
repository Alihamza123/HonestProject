package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;

public class Cleaning extends TestCore {

	@FindBy(xpath = Elements.cleaning)	WebElement cleaning;
	@FindBy(xpath = Elements.dishSoap)	WebElement dishSoap;
	@FindBy(xpath = Elements.scentList)	WebElement scentList;
	@FindBy(xpath = Elements.lemonVerbena)	WebElement lemonVerbena;
	@FindBy(xpath = Elements.increase)	WebElement increase;
	@FindBy(xpath = Elements.cleaning)	WebElement itemImage;

	// MAIN CONSTRUCTOR
	public Cleaning(WebDriver driver) {
		TestCore.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// METHOD FOR CLEANING NAVIGATION TEST
	public Cleaning cleaningNavigationTest() throws Exception {

		try {
			user_Selects_DishSoap();
			user_Selects_lemonScent();
			user_Increases_Qty();
			verify_ImageLoaded();
		} catch (Exception e) {
			log.debug(e);
		}

		return new Cleaning(driver);
	}
	
	// METHOD FOR USER (CLICKS CLEANING ON HEADER, THEN SELECTS DISH SOAP)
	public Cleaning user_Selects_DishSoap() throws Exception {

		explicitWait(cleaning, 20, driver);

		cleaning.click();
		log.debug(" HEADER | CLEANING [ CLICKED ] ");

		explicitWait(dishSoap, 20, driver);

		dishSoap.click();
		log.debug(" ITEM | DISH SOAP [ CLICKED ] ");

		return new Cleaning(driver);
	}

	// METHOD FOR USER (SELECTS FROM DROP DOWN SCENT LIST AND SELECTS LEMON VERBENA)
	public Cleaning user_Selects_lemonScent() throws Exception {

		explicitWait(scentList, 20, driver);

		scentList.click();
		log.debug(" SCENT LIST [ CLICKED ] ");

		explicitWait(lemonVerbena, 20, driver);

		lemonVerbena.click();
		log.debug(" LEMON VERBENA [ SELECTED ] ");

		return this;
	}

	
	// METHOD FOR USER ( INCREASES QUANTITY TO 5 )
	public Cleaning user_Increases_Qty() throws Exception {

		explicitWait(increase, 20, driver);

		int a = 1;
		while (a < 5) {
			increase.click();
			a++;
			log.debug("INCREASE QTY BY : " + a);
		}

		return this;
	}

	// METHOD FOR VERIFYING PAGE ON IMAGE HAS LOADED
	public Cleaning verify_ImageLoaded() throws Exception {

		explicitWait(itemImage, 20, driver);

		if (itemImage.isDisplayed()) {
			log.debug(" LEMON VERBENA IMAGE CHANGED [ PASSED ] ");
		} else {
			log.debug(" LEMON VERBENA IMAGE DID NOT CHANGE [ FAILED ] ");
		}

		return this;
	}

}
