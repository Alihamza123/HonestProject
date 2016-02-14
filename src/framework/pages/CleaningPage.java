package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import framework.utils.Wait;

public class CleaningPage {

	WebDriver driver;

	public CleaningPage(WebDriver driver) {
		this.driver = driver;
	}

	public CleaningPage clickDishSoap() throws Exception {

		/*
		 * This method waits for dish soap item to be visible 
		 * Then clicks on Dish Soap
		 */

		Wait.elementToBeVisible(dishSoap, 20, driver);

		dishSoap.click();
		
		return PageFactory.initElements(driver, CleaningPage.class);

	}

	public CleaningPage clickScentList() throws Exception {

		/*
		 * This method waits for scent list drop down to be visible 
		 * Then selects Lemon Verbana from the drop down menu
		 */

		Wait.elementToBeVisible(scentList, 20, driver);

		Select scent = new Select(scentList);

		scent.selectByIndex(1);
		
		return PageFactory.initElements(driver, CleaningPage.class);

	}

	public CleaningPage increaseQuantity() throws Exception {

		/*
		 * This method waits for increase button to be visible 
		 * Then increases it to 5 by using a while loop
		 */

		Wait.elementToBeVisible(increase, 20, driver);

		increase.click();
		increase.click();
		increase.click();
		increase.click();
	
		
		return PageFactory.initElements(driver, CleaningPage.class);

	}

	public CleaningPage verifyImage() throws Exception {

		/*
		 * This method waits for Lemon verbana item image to be visible 
		 * Then validates if the Item image is displayed
		 */

		Wait.elementToBeVisible(itemImage, 20, driver);

		Assert.assertEquals(itemImage.isDisplayed(), true);
		
		return PageFactory.initElements(driver, CleaningPage.class);

	}

	@CacheLookup
	@FindBy(xpath = ".//*[@id='grid_product_25']//*[contains(@src, '10058/Product-25')]")
	WebElement dishSoap;
	@CacheLookup
	@FindBy(xpath = ".//select[@class='test-select-variant-selector form-control variant-text-select ng-pristine ng-valid']")
	WebElement scentList;
	@CacheLookup
	@FindBy(xpath = "//a[@class='incrementer']//span[@class='icon-large icon icon-plus-sign hover-pointer']")
	WebElement increase;
	@CacheLookup
	@FindBy(xpath = "//img[@src='https://img.honest.com/uploads/managed_assets/file/10050/OptionValue-255-slide_with_zoom-e66f6455-aca0-4377-ad13-8e7e70759d21_normal_slide.jpg']")
	WebElement itemImage;

}
