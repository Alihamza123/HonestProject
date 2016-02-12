package framework.pages;

import org.testng.Assert;

import framework.config.TestCore;

public class Footer_Faq extends TestCore {

	public void footer_Faq () {
		
		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/faq";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
		String expectedTitle = "The Honest Company";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.navigate().back();
	}
}
