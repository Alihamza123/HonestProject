package framework.pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.config.TestCore;
import framework.properties.Elements;

public class Press extends TestCore {

	// MAIN CONSTRUCTOR
	public Press(WebDriver driver) {
		TestCore.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Elements.press)
	WebElement press;
	@FindBy(xpath = Elements.pressImage)
	WebElement pressImage;

	// METHOD FOR PRESS NAVIGATION TEST
	public Press pressNavigation_Test() throws Exception {

		try {
			user_ClicksPressFooter();
			user_Selects_2ndImage();
		} catch (Exception e) {
			log.debug(e.getMessage());
		}

		return new Press(driver);
	}

	// METHOD FOR USER ( CLICKS PRESS FOOTER )
	public Press user_ClicksPressFooter() throws Exception {

		explicitWait(press, 20, driver);

		// USER CLICKS PRESS ON FOOTER
		press.click();

		return this;
	}

	// METHOD FOR USER ( SELECTS 2ND IMAGE 100 MOST CREATIVE PEOPLE, AND CAPTURE SCREENSHOT OF THE IMAGE LOADED )
	public Press user_Selects_2ndImage() throws Exception {

		explicitWait(pressImage, 20, driver);

		// USER SELECTS THE 2ND ( THE 100 MOST CREATIVE PEOPLE ) IMAGE
		pressImage.click();
		
		Thread.sleep(3000L);
		
		// SYSTEM CAPTURES SCREENSHOT 2ND IMAGE POPPING UP
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File(
				"C:\\Users\\Ali Hamza\\Desktop\\EclipseWorkspace\\Project Honest.com\\src\\libraries\\screenshots\\100mostCreative.jpg"));

		return this;
	}
}
