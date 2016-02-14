package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import framework.properties.Elements;
import framework.utils.Wait;

public class StainRemoverPage {

	WebDriver driver;

	public StainRemoverPage(WebDriver driver) {
		this.driver = driver;
	}

	public CartPage editTheItem() throws Exception {

		/*
		 * This method waits for drop down menu to be visible
		 * Then chooses 4 oz refill bottle from the drop down of Size
		 * Then it increases the quantity to 4 bottles 
		 * Then it clicks the Buy Now Button
		 */

		Wait.elementToBeVisible(dropDownMenu, 15, driver);

		Select drpdown = new Select(dropDownMenu);

		drpdown.selectByVisibleText(Elements.drpDownItemName);

		int count = 1;
		while (count < 4) {
			increaseQty.click();
			count++;
		}

		buyNowFunnel.click();

		return PageFactory.initElements(driver, CartPage.class);
	}

	public CartPage goToCart() throws Exception {

		/*
		 * This method waits for checkout drop down to be visible
		 * Then clicks the checkout link which drops down
		 * immediately after clicking the buy now button
		 */

		Wait.elementToBeClickable(checkOutDropDown, 10, driver);

		checkOutDropDown.click();

		return PageFactory.initElements(driver, CartPage.class);

	}

	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-container-main']/div[3]/div[2]/div[1]/div[3]/div[2]/div[2]/div/div/div/div/div/select")
	WebElement dropDownMenu;
	@CacheLookup
	@FindBy(xpath = ".//*[@id='js-container-main']/div[3]/div[2]/div[1]/div[3]/div[1]/div[3]/div[2]/div/div/a[2]/span")
	WebElement increaseQty;
	@CacheLookup
	@FindBy(xpath = "//button[@data-ng-disabled='submitDisabled()']")
	WebElement buyNowFunnel;
	@CacheLookup
	@FindBy(xpath = "//a[@data-ga-event-action-on-click='Click_Checkout_Button']")
	WebElement checkOutDropDown;
}
