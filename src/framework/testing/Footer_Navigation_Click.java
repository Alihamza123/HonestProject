package framework.testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.config.TestCore;
import framework.pages.Footer_Faq;
import framework.pages.Footer_Feedback;
import framework.pages.Footer_Testimonials;
import framework.pages.Footer_WhatsInside;
import framework.pages.Footer_WhoWeAre;
import framework.pages.Homepage;

public class Footer_Navigation_Click extends TestCore {


	@Test(description = "All Footer Navigation ")
	public void footer_Navigation_Click() throws Exception {

		try {
			
			Homepage home = PageFactory.initElements(driver, Homepage.class);
			
			Footer_Faq faq = home.click_Footer_faq();
			faq.footer_Faq();
			
			Footer_Feedback feedback = home.click_footer_feedBack();
			feedback.footer_FeedBack();
			
			Footer_Testimonials testimonials = home.click_Footer_Testimonials();
			testimonials.footer_Testimonials();
			
			Footer_WhatsInside whatsInside = home.click_Footer_WhatsInside();
			whatsInside.footer_WhatsInside();
			
			Footer_WhoWeAre whoWeAre = home.click_Footer_WhoWeAre();
			whoWeAre.footer_WhoWeAre();
			
		} catch (Exception e) {
			log.debug("Footer Navigation Click Exception : " + e);
		}
	}
}
