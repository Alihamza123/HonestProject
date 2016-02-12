package framework.pages;

import org.testng.Assert;

import framework.config.TestCore;

public class Footer_WhatsInside extends TestCore {

	public void footer_WhatsInside() {

		// VERIFY ACTUAL/EXPECTED URL & PAGE TITLE
		String expectedUrl = "https://www.honest.com/whats-inside/concentrates";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);

		String expectedTitle = "What's Inside | Spray Refills & Concentrates | The Honest Company";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.navigate().back();
	}
}
