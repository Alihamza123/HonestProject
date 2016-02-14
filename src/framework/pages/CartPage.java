package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.properties.Elements;
import framework.utils.Wait;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public void validateItemDetails() {

		/*
		 * This method verifies and validates : Item name Item Total Price
		 */

		String expectedItemName = "Stain Remover";
		String expectedItemPrice = "$23.80";

		String actualItemName = driver.findElement(By.xpath(Elements.checkOutItemName)).getText();
		String actualItemPrice = driver.findElement(By.xpath(Elements.checkOutItemTotalPrice)).getText();

		Assert.assertTrue(expectedItemName.contains(actualItemName));
		Assert.assertTrue(expectedItemPrice.contains(actualItemPrice));

	}

	public ShippingPage proceedToCheckout() throws Exception {

		/*
		 * This method waits for Proceed to checkout Button to be visible
		 * Then clicks Proceed To Checkout Button after verifying and
		 * validating the item details Takes the user to shipping page
		 */

		Wait.elementToBeVisible(proceedCheckout, 15, driver);

		proceedCheckout.click();

		return PageFactory.initElements(driver, ShippingPage.class);

	}

	@CacheLookup
	@FindBy(xpath = "html/body/div[1]/div/div[3]/div[6]/div[2]/div[6]/div[1]/form/div/input[1]")
	WebElement proceedCheckout;
}
