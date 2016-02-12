package framework.pages;

import org.testng.Assert;

import framework.config.TestCore;

public class Footer_Testimonials extends TestCore {

	public void footer_Testimonials() {

		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/about-us/testimonials";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
		String expectedTitle = "Honest Company Reviews & Customer Testimonials";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

		driver.navigate().back();
	}
}
