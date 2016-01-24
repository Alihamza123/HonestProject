package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import framework.config.TestCore;
import framework.properties.Elements;
import framework.properties.TestData;

public class FunnelNavigation extends TestCore {

	// MAIN CONSTRUCTOR
	public FunnelNavigation(WebDriver driver) {
		TestCore.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Elements.closeTrialAlert)
	WebElement closeTrial;
	@FindBy(xpath = Elements.trialFirstName)
	WebElement trialFirstName;
	@FindBy(xpath = Elements.trialLastName)
	WebElement trialLastName;
	@FindBy(xpath = Elements.trialEmail)
	WebElement trialEmail;
	@FindBy(xpath = Elements.trialPassword)
	WebElement trialPassword;
	@FindBy(xpath = Elements.trialCreateButton)
	WebElement trialCreateButton;
	@FindBy(xpath = Elements.cleaning)
	WebElement cleaning;
	@FindBy(xpath = Elements.stainRemover)
	WebElement stainRemover;
	@FindBy(xpath = Elements.dropDownMenu)
	WebElement dropDownMenu;
	@FindBy(xpath = Elements.concentrateBottle)
	WebElement concentrateBottle;
	@FindBy(xpath = Elements.increaseQty)
	WebElement increaseQty;
	@FindBy(xpath = Elements.buyNowFunnel)
	WebElement buyNowFunnel;
	@FindBy(xpath = Elements.checkOutDropDown)
	WebElement checkOutDropDown;
	@FindBy(xpath = Elements.shipFirstName)
	WebElement shipFirstName;
	@FindBy(xpath = Elements.shipLastName)
	WebElement shipLastName;
	@FindBy(xpath = Elements.shipStreet)
	WebElement shipStreet;
	@FindBy(xpath = Elements.countryDrpDown)
	WebElement countryDrpDown;
	@FindBy(xpath = Elements.shipCity)
	WebElement shipCity;
	@FindBy(xpath = Elements.stateDrpDown)
	WebElement stateDrpDown;
	@FindBy(xpath = Elements.shipZipCode)
	WebElement shipZipCode;
	@FindBy(xpath = Elements.shipPhoneNumber)
	WebElement shipPhoneNumber;
	@FindBy(xpath = Elements.saveAndContinueBtn)
	WebElement saveAndContinueBtn;
	@FindBy(xpath = Elements.proceedCheckOut)
	WebElement proceedCheckout;

	public FunnelNavigation funnelNavigation_Test() throws Exception {
		
		// calling user joins free trial method 
		user_JoinsFreeTrial();

		// calling user selects item method
		user_Selects_Item();

		// calling user customizes item method
		user_Customizes_Item();

		// calling user checksout method
		user_ChecksOut();

		// calling user enters shipping information
		user_EntersInformation();

		return new FunnelNavigation(driver);
	}

	// METHOD FOR JOINING FREE TRIAL FROM HOMEPAGE ALERT
	public FunnelNavigation user_JoinsFreeTrial() throws Exception {

		try {
			explicitWait(trialFirstName, 20, driver);

			trialFirstName.sendKeys(TestData.fNameFunnel);
			log.debug(" First name = " + TestData.fNameFunnel);

			trialLastName.sendKeys(TestData.lNameFunnel);
			log.debug(" Last name = " + TestData.lNameFunnel);

			trialEmail.sendKeys(TestData.emailFunnel);
			log.debug(" Email = " + TestData.emailFunnel);

			trialPassword.sendKeys(TestData.passwordFunnel);
			log.debug(" Password = " + TestData.passwordFunnel);

			trialCreateButton.click();
			log.debug(" CREATE TRIAL ACCOUNT BUTTON [ CLICKED ]  ");

		} catch (Exception e) {
			log.debug(e.getMessage());
		}

		return this;
	}

	// METHOD FOR USER SELECTING (STAIN REMOVER FROM CLEANING HEADER) 
	public FunnelNavigation user_Selects_Item() throws Exception {

		try {
			// user selects cleaning from header
			explicitWait(cleaning, 15, driver);

			Actions mouse = new Actions(driver);
			mouse.moveToElement(cleaning).build().perform();

			// user selects stain remover from sub menu
			explicitWait(stainRemover, 15, driver);
			stainRemover.click();
			log.debug("STAIN REMOVER FROM SUB MENU [ CLICKED ] ");

		} catch (Exception e) {
			log.debug(e.getMessage());
		}

		return this;
	}

	// METHOD FOR USER SELECTS ( CONCENTRATE 4 OZ BOTTLE , INCREASES QTY TO 4 , CLICKS BUY NOW BUTTON )
	public FunnelNavigation user_Customizes_Item() throws Exception {

		try {
			// user selects from the drop down menu
			explicitWait(dropDownMenu, 15, driver);
			Select drpdown = new Select(dropDownMenu);
			// user chooses concentrate 4 oz refill bottle
			drpdown.selectByVisibleText(Elements.drpDownItemName);

			// user increases the quantity of the item in the cart TO [4 bottles]
			int count = 1;
			while (count < 4) {
				increaseQty.click();
				count++;
			}
			log.debug("Increased Qty By : " + count);

			// user clicks the Buy Now Button
			explicitWait(buyNowFunnel, 15, driver);
			buyNowFunnel.click();
			log.debug(" BUY NOW BUTTON [ CLICKED ] ");

		} catch (Exception e) {
			log.debug(e.getMessage());
		}

		return this;
	}

	// METHOD FOR USER (CLICKING CHECK OUT AND VERIFY SELECTED ITEM NAME/PRICE)
	public FunnelNavigation user_ChecksOut() throws Exception {

		try {
			// user waits for check out box to drop down from cart
			explicitWait(checkOutDropDown, 10, driver);
			checkOutDropDown.click();
			log.debug(" CHECK OUT DROP DOWN BUTTON [ CLICKED ] ");

			// verify item name and price

			String expectedItemName = "Stain Remover";
			String expectedItemPrice = "$23.80";

			String actualItemName = driver.findElement(By.xpath(Elements.checkOutItemName)).getText();
			String actualItemPrice = driver.findElement(By.xpath(Elements.checkOutItemTotalPrice)).getText();

			if (actualItemName.contains(expectedItemName)) {
				if (actualItemPrice.contains(expectedItemPrice))
					log.debug(" ITEM NAME / PRICE VERIFICATION [ PASSED ] ");
			} else {
				log.debug(" ITEM NAME / PRICE VERIFICATION [ FAILED ] ");
			}

			// user clicks proceed to checkout
			explicitWait(proceedCheckout, 15, driver);
			proceedCheckout.click();
			log.debug(" PROCEED TO CHECKOUT BUTTON [ CLICKED ] ");

		} catch (Exception e) {
			log.debug(e.getMessage());
		}

		return this;
	}

	// METHOD FOR USER ( ENTERING SHIPPING INFORMATION AND CLICK SAVE AND CONTINUE BUTTON )
	public FunnelNavigation user_EntersInformation() throws Exception {

		try {
			explicitWait(shipFirstName, 10, driver);

			// user fills out the check out form
			shipFirstName.sendKeys(TestData.fNameShipping);
			log.debug("Entered First name : " + TestData.fNameShipping);

			shipLastName.sendKeys(TestData.lNameShipping);
			log.debug("Entered Last name : " + TestData.lNameShipping);

			shipStreet.sendKeys(TestData.streetShipping);
			log.debug("Entered Street address : " + TestData.streetShipping);

			Select country = new Select(countryDrpDown);
			country.selectByVisibleText(Elements.country);
			log.debug("Selected country name : " + Elements.country);

			shipCity.sendKeys(TestData.cityShipping);
			log.debug("Entered City name : " + TestData.cityShipping);

			Select state = new Select(stateDrpDown);
			state.selectByVisibleText(Elements.state);
			log.debug("Selected State name : " + Elements.state);

			shipZipCode.sendKeys(TestData.zipShipping);
			log.debug("Entered Zip Code : " + TestData.zipShipping);

			shipPhoneNumber.sendKeys(TestData.phoneShipping);
			log.debug("Entered Phone number : " + TestData.phoneShipping);

			// user clicks save and continue button
			explicitWait(saveAndContinueBtn, 15, driver);
			saveAndContinueBtn.click();
			log.debug("Save and Continue Button [ CLICKED ] ");

		} catch (Exception e) {
			log.debug(e.getMessage());
		}

		return this;
	}
}
