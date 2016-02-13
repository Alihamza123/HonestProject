package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
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


	// METHOD FOR JOINING FREE TRIAL FROM HOMEPAGE ALERT
	public FunnelNavigation user_JoinsFreeTrial() throws Exception {

		try {
			
			explicitWait(trialFirstName, 20, driver);

			trialFirstName.sendKeys(TestData.fNameFunnel);

			trialLastName.sendKeys(TestData.lNameFunnel);

			trialEmail.sendKeys(TestData.emailFunnel);

			trialPassword.sendKeys(TestData.passwordFunnel);

			trialCreateButton.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
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

		} catch (Exception e) {
			System.out.println(e.getMessage());
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

			// user clicks the Buy Now Button
			explicitWait(buyNowFunnel, 15, driver);
			buyNowFunnel.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return this;
	}

	// METHOD FOR USER (CLICKING CHECK OUT AND VERIFY SELECTED ITEM NAME/PRICE)
	public FunnelNavigation user_ChecksOut() throws Exception {

		try {
			// user waits for check out box to drop down from cart
			explicitWait(checkOutDropDown, 10, driver);
			checkOutDropDown.click();
			// verify item name and price

			String expectedItemName = "Stain Remover";
			String expectedItemPrice = "$23.80";

			String actualItemName = driver.findElement(By.xpath(Elements.checkOutItemName)).getText();
			String actualItemPrice = driver.findElement(By.xpath(Elements.checkOutItemTotalPrice)).getText();

			if (actualItemName.contains(expectedItemName)) {
				if (actualItemPrice.contains(expectedItemPrice))
					System.out.println(" ITEM NAME / PRICE VERIFICATION [ PASSED ] ");
			} else {
				System.out.println(" ITEM NAME / PRICE VERIFICATION [ FAILED ] ");
			}

			// user clicks proceed to checkout
			explicitWait(proceedCheckout, 15, driver);
			proceedCheckout.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return this;
	}

	// METHOD FOR USER ( ENTERING SHIPPING INFORMATION AND CLICK SAVE AND CONTINUE BUTTON )
	public FunnelNavigation user_EntersInformation() throws Exception {

		try {
			explicitWait(shipFirstName, 10, driver);

			// user fills out the check out form
			shipFirstName.sendKeys(TestData.fNameShipping); 

			shipLastName.sendKeys(TestData.lNameShipping); 

			shipStreet.sendKeys(TestData.streetShipping); 

			Select country = new Select(countryDrpDown);
			country.selectByVisibleText(Elements.country); 

			shipCity.sendKeys(TestData.cityShipping); 

			Select state = new Select(stateDrpDown);
			state.selectByVisibleText(Elements.state); 

			shipZipCode.sendKeys(TestData.zipShipping); 

			shipPhoneNumber.sendKeys(TestData.phoneShipping); 

			// user clicks save and continue button
			explicitWait(saveAndContinueBtn, 15, driver);
			saveAndContinueBtn.click(); 

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return this;
	}
	
	@CacheLookup@FindBy(xpath = Elements.closeTrialAlert)WebElement closeTrial;
	@CacheLookup@FindBy(xpath = Elements.trialFirstName)WebElement trialFirstName;
	@CacheLookup@FindBy(xpath = Elements.trialLastName)WebElement trialLastName;
	@CacheLookup@FindBy(xpath = Elements.trialEmail)WebElement trialEmail;
	@CacheLookup@FindBy(xpath = Elements.trialPassword)WebElement trialPassword;
	@CacheLookup@FindBy(xpath = Elements.trialCreateButton)WebElement trialCreateButton;
	@CacheLookup@FindBy(xpath = Elements.cleaning)WebElement cleaning;
	@CacheLookup@FindBy(xpath = Elements.stainRemover)WebElement stainRemover;
	@CacheLookup@FindBy(xpath = Elements.dropDownMenu)WebElement dropDownMenu;
	@CacheLookup@FindBy(xpath = Elements.concentrateBottle)WebElement concentrateBottle;
	@CacheLookup@FindBy(xpath = Elements.increaseQty)WebElement increaseQty;
	@CacheLookup@FindBy(xpath = Elements.buyNowFunnel)WebElement buyNowFunnel;
	@CacheLookup@FindBy(xpath = Elements.checkOutDropDown)WebElement checkOutDropDown;
	@CacheLookup@FindBy(xpath = Elements.shipFirstName)WebElement shipFirstName;
	@CacheLookup@FindBy(xpath = Elements.shipLastName)WebElement shipLastName;
	@CacheLookup@FindBy(xpath = Elements.shipStreet)WebElement shipStreet;
	@CacheLookup@FindBy(xpath = Elements.countryDrpDown)WebElement countryDrpDown;
	@CacheLookup@FindBy(xpath = Elements.shipCity)WebElement shipCity;
	@CacheLookup@FindBy(xpath = Elements.stateDrpDown)WebElement stateDrpDown;
	@CacheLookup@FindBy(xpath = Elements.shipZipCode)WebElement shipZipCode;
	@CacheLookup@FindBy(xpath = Elements.shipPhoneNumber)WebElement shipPhoneNumber;
	@CacheLookup@FindBy(xpath = Elements.saveAndContinueBtn)WebElement saveAndContinueBtn;
	@CacheLookup@FindBy(xpath = Elements.proceedCheckOut)WebElement proceedCheckout;
}
