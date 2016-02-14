package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import framework.properties.TestData;
import framework.utils.Wait;

public class ShippingPage {

	WebDriver driver;

	public ShippingPage(WebDriver driver) {
		this.driver = driver;
	}

	public BillingPage enterShippingInfo() throws Exception {

		/*
		 * This method enters customer's shipping details inside the input text
		 * fields 
		 * Then clicks Save and Continue Button 
		 * Which will then take user to Payment info Page
		 */

		final String country = "United States";
		final String state = "California";

		Wait.elementToBeVisible(shipFirstName, 10, driver);

		shipFirstName.sendKeys(TestData.fNameShipping);

		shipLastName.sendKeys(TestData.lNameShipping);

		shipStreet.sendKeys(TestData.streetShipping);

		Select sel = new Select(countryDrpDown);
		sel.selectByVisibleText(country);

		shipCity.sendKeys(TestData.cityShipping);

		Select sel2 = new Select(stateDrpDown);
		sel2.selectByVisibleText(state);

		shipZipCode.sendKeys(TestData.zipShipping);

		shipPhoneNumber.sendKeys(TestData.phoneShipping);

		Wait.elementToBeVisible(saveAndContinueBtn, 15, driver);

		saveAndContinueBtn.click();

		return PageFactory.initElements(driver, BillingPage.class);
	}

	// Elements used in the shipping page
	@CacheLookup
	@FindBy(xpath = ".//*[@id='shipping_address_first_name']")
	WebElement shipFirstName;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='shipping_address_last_name']")
	WebElement shipLastName;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='shipping_address_address1']")
	WebElement shipStreet;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='shipping_address_country']")
	WebElement countryDrpDown;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='shipping_address_city']")
	WebElement shipCity;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='shipping_address_state']")
	WebElement stateDrpDown;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='shipping_address_zip']")
	WebElement shipZipCode;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='shipping_address_telephone_attributes_full_number']")
	WebElement shipPhoneNumber;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='shipping_cart_checkout']/div[3]/div[1]/input")
	WebElement saveAndContinueBtn;

}
