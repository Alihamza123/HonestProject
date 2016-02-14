package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import framework.utils.Wait;

public class PersonalcarePage  {
	
	WebDriver driver;
	
	public PersonalcarePage(WebDriver driver) {
		this.driver = driver;
	}


	public PersonalcarePage click_feminineCareImage() throws Exception {

		/*
		 *  This method waits for Feminine Image to be visible
		 *  Verify if image is diplayed
		 *  Then click on Feminine image
		 */
		
		Wait.elementToBeVisible(feminineImage, 20, driver);

		Assert.assertTrue(feminineImage.isDisplayed());
		feminineImage.click();

		return new PersonalcarePage(driver);
	}
	
	public void validatePageTitleUrl () {

		/*
		 *  This method verifies and validats page title and url
		 */
		
		String expectedUrl = "https://www.honest.com/feminine-care";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertTrue(actualUrl.contains(expectedUrl));
		
		String expectedTitle = "Feminine Care | Feminine Hygiene | The Honest Company";
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains(expectedTitle));
	}
	
	@CacheLookup
	@FindBy(xpath = "//img[@class='full-width'][@src='//img.honest.com/uploads/managed_assets/file/13174/WidgetMember-92-widget_member/slide_fullscreen/image-3dd8c980-8a5a-4164-aa9f-300013e7e142.jpg']")
	WebElement feminineImage;

}
