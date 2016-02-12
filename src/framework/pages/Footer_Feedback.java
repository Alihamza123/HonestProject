package framework.pages;

import org.testng.Assert;

import framework.config.TestCore;

public class Footer_Feedback extends TestCore {

	public void footer_FeedBack() {

		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/about-us/feedback";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);

		String expectedTitle = "Feedback - Let Us Know What You Think - The Honest Company";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

		driver.navigate().back();
	}
}
