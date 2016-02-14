package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.FooterPage;

public class Footer_Navigation_Click extends TestCore {


	@Test(description = "All Footer Navigation ")
	public void footer_Navigation_Click() throws Exception {

		try {
			
			FooterPage foot = PageFactory.initElements(driver, FooterPage.class);
			
			// user clicks FAQ FOOTER
			foot.click_Footer_faq();
			
			// user clicks FEEDBACK FOOTER
			foot.click_footer_feedBack();
			
			// user clicks HONEST TESTIMONIALS FOOTER
			foot.click_Footer_Testimonials();
			
			// user clicks WHATS INSIDE FOOTER
			foot.click_Footer_WhatsInside();
			
			// user clicks WHO WE ARE FOOTER
			foot.click_Footer_WhoWeAre();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
