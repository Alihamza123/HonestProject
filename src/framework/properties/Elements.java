package framework.properties;

public class Elements {
	
	// ================= [ FREE TRIAL ALERT ELEMENTS ] =================

	// FREE TRIAL ALERT CLOSE BUTTON
	public static final String closeTrialAlert = ".//*[@id='js-reg-fullscreen-modal']/div[2]/div[1]/button";
	
	// ELEMENTS FOR JOINING FREE TRIAL
	public static final String trialFirstName = ".//*[@id='user_first_name']";
	public static final String trialLastName = ".//*[@id='user_last_name']";
	public static final String trialEmail = "//input[@placeholder='Email Address']";
	public static final String trialPassword = "//input[@id='user_password'][@minlength='6']";
	public static final String trialCreateButton = ".//*[@id='js-user-registration-form']/div[6]/input";

	// ================= [ SEARCH TEST ELEMENTS ] =================

	// HEADER SEARCH ELEMENTS
	public static final String searchBox = ".//*[@id='q']";
	public static final String searchButton = ".//*[@id='js-navbar-top']/div[1]/div/ul/li[7]/form/div[2]/button";
	public static final String resultDrop = ".//*[contains(@id,'option-2')]";
	public static final String expectedImage = ".//*[@id='js-container-main']/div[3]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div/div/div/div[2]/div[2]/img";

	//  ================= [ HEADER SIGN IN ELEMENTS ] =================
	
	// ELEMENTS FOR TOP MENU SIGN IN
	public static final String myAccount = ".//*[@id='js-navbar-top']/div[1]/div/ul/li[4]/a";
	public static final String create_new = ".//*[@id='new_user']/div[6]/a";
	public static final String input_email = ".//*[@id='js-navbar-top']/div[1]/div/ul/li[4]/div//*[@id='user_email']";
	public static final String input_password = ".//*[@id='js-navbar-top']/div[1]/div/ul/li[4]/div//*[@id='user_password']";
	public static final String signInButton = ".//*[@id='new_user']/div[5]/input";
	
	// ================= [ USER SIGN OUT ELEMENTS ] =================
	
	// ELEMENTS FOR SIGNING OUT OF ACCOUNT ( USER LOGS OUT )
	public static final String signOutAccount = ".//a[contains(@class,'white ng-isolate-scope')]";
	public static final String signOutLink = "//a[contains(.,'Sign Out')]";

	// ================= [ ELEMENTS ( MY ACCOUNT ) CREATING NEW ACCOUNT OR LOGGING IN TO REGISTERED ] =================
	
	// ACCOUNT
	public static final String newFirstName = ".//*[@id='user_first_name']";
	public static final String newLastName = ".//*[@id='user_last_name']";
	public static final String newEmail = ".//div[contains(@id, 'sign-up')]//*[contains(@id, 'user_email')]";
	public static final String newPassword = ".//div[contains(@id, 'sign-up')]//*[contains(@id, 'user_password')]";
	public static final String newAccountButton = ".//input[@value='Create Account']";
	public static final String oldEmail = ".//div[contains(@id, 'sign-in')]//input[@id='user_email']";
	public static final String oldPassword = ".//div[contains(@id, 'sign-in')]//input[@id='user_password']";
	public static final String oldSignInButton = ".//*[@id='new_user_session']/div[4]/input";

	// ================= [ CLEANING PAGE ELEMENTS ] =================

	// DISH SOAP ELEMENT
	public static final String dishSoap = ".//*[@id='grid_product_25']//*[contains(@src, '10058/Product-25')]";
	// INCREASE & DECREASE ELEMENTS
	public static final String increase = "//span[@class='icon-large icon icon-plus-sign hover-pointer']";
	public static final String decrease = "//span[@class='icon-large icon icon-minus-sign hover-pointer']";
	// SCENT DROPDOWN ELEMENT
	public static final String scentList = "//select[@class='test-select-variant-selector form-control variant-text-select ng-pristine ng-valid']";
	// LEMON VERBENA ITEM
	//public static final String lemonVerbena = "//option[contains(.,'Lemon Verbena')]";
	// DISH SOAP LEMON VERBENA IMAGE
	public static final String itemImage = "//img[@src='https://img.honest.com/uploads/managed_assets/file/10050/OptionValue-255-slide_with_zoom-e66f6455-aca0-4377-ad13-8e7e70759d21_normal_slide.jpg']";

	// ================= [ HEADER ELEMENTS ON HOMEPAGE ] =================

	// MAIN MENUS
	public static final String bundles = ".//*[@id='js-navbar-top']/nav/div/ul/li[1]/a";
	public static final String diapering = ".//*[@id='js-navbar-top']/nav/div/ul/li[2]/a";
	public static final String feeding = ".//*[@id='js-navbar-top']/nav/div/ul/li[3]/a";
	public static final String personalCare = ".//*[@id='js-navbar-top']/nav/div/ul/li[4]/a";
	public static final String cleaning = ".//*[@id='js-navbar-top']/nav/div/ul/li[5]/a";
	public static final String vitamins = ".//*[@id='js-navbar-top']/nav/div/ul/li[6]/a";
	public static final String gears = ".//*[@id='js-navbar-top']/nav/div/ul/li[7]/a";
	public static final String gifts = ".//*[@id='js-navbar-top']/nav/div/ul/li[8]/a";

	// ================= [ SUB MENUS ELEMENTS ( BEST DEALS & NEW ITEMS ) ] =================

	// DIAPERING SECTION
	public static final String bestDeal_diaperWipes = ".//*[@id='js-navbar-top']/nav/div/ul/li[2]/div/div[1]/div[1]/ul/li[1]/a";
	public static final String new_honestEverythingTote = ".//*[@id='js-navbar-top']/nav/div/ul/li[2]/div/div[1]/div[3]/ul/li[4]/a";
	public static final String new_honestSwimDiapers = "//a[@class='menu-list-item-link margin-right-sm'][@href='/baby/honest-swim-diapers']";
	public static final String new_mini_DiaperCakes = ".//*[@id='js-navbar-top']/nav/div/ul/li[2]/div/div[1]/div[3]/ul/li[2]/a";
	// PERSONAL CARE SECTION
	public static final String new_orange_handsanitizer = ".//*[@id='js-navbar-top']/nav/div/ul/li[4]/div/div[1]/div[2]/ul/li[3]/a";
	// FEEDING SECTION
	public static final String bestDeal_infantFormula = ".//*[@id='js-navbar-top']/nav/div/ul/li[3]/div/div[1]/div[2]/ul/li[1]/a";
	
	// ================= [ FOOTER ON HOME PAGE ELEMENTS ] =================
	
	// MY ACCOUNT 
	public static final String footerMyAccount = ".//*[@id='footer']/div[1]/div[1]/div[2]/ul/li[1]/a";
	public static final String whoWeAre = ".//*[@href='/about-us/who-we-are']";
	public static final String invites = ".//*[@id='footer']/div[1]/div[1]/div[2]/ul/li[3]/a";	
	// ABOUT US 
	public static final String blog = ".//*[@id='footer']/div[2]/ul/li[1]/a";
	public static final String careers = ".//*[@id='footer']/div[2]/ul/li[6]/a";
	public static final String testimonials = ".//*[@id='footer']/div[3]/ul/li[5]/a";
	public static final String whatsInside = ".//*[@id='footer']/div[1]/div[2]/div[1]/div[1]/ul/li[7]/a";	
	// SUPPORT
	public static final String feedBack = ".//*[@id='footer']/div[1]/div[1]/div[1]/ul/li[3]/a";
	public static final String faq = ".//*[@id='footer']/div[1]/div[1]/div[1]/ul/li[1]/a";
	public static final String press = ".//*[@id='footer']/div[3]/ul/li[4]/a";
	
	// ================= [ GIFTS PAGE ELEMENTS ] =================
	
	// CLICK NEXT 
	public static final String nextArrow = ".//button[@class='slick-next']";	
	// GIFT CARD IMAGE 
	public static final String giftCardImage = "html/body/div[5]/div[1]/div/div/div[4]/a/img";	
	// SELECT AN AMOUNT FROM DROPDOWN
	public static final String selectAnAmount = "//select[@name='amount']";	
	// CUSTOMIZE AMOUNT 
	public static final String customizeAmount = "//input[@id='customize_amount']";
	// BUY NOW BUTTON 
	public static final String buyNowButton = "//button[@class='btn col-lg-12 btn-default btn-block buy-now-btn'][@data-ng-disabled='submitDisabled()']";	
	// SCROLL DOWN ELEMENT
	public static final String scrollDown = ".//span[@class='icon icon-honest-facebook facebook-color']";
	
	// ================= [ PERSONAL CARE ELEMENTS ] =================
	
	// HONEST FEMININE CARE
	public static final String feminineImage = "//img[@class='full-width'][@src='//img.honest.com/uploads/managed_assets/file/13174/WidgetMember-92-widget_member/slide_fullscreen/image-3dd8c980-8a5a-4164-aa9f-300013e7e142.jpg']";
	// [ FEEDING ELEMENTS ]	
	public static final String ourCommitment = "html/body/div[5]/div[1]/div/div/div[5]/a/img";
	public static final String verifyFeedingImage = ".//*[@id='standard']/div/div/div[2]/img";
	
	// ================= [ PRESS ELEMENTS ] =================
	
	// 100 most influential people IMAGE
	public static final String pressImage = ".//*[@id='accordion-1']/dl/dd[2]/div/a";
	
	// ================= [ SIGN IN FUNNEL NAVIGATION ELEMENTS ] =================
	
	// sub menu from CLEANING 
	public static final String stainRemover = ".//*[@id='js-navbar-top']/nav/div/ul/li[5]/div/div[1]/div[2]/ul/li[4]/a";	
	// drop down menu
	public static final String dropDownMenu = ".//*[@id='js-container-main']/div[3]/div[2]/div[1]/div[3]/div[2]/div[2]/div/div/div/div/div/select";
	public static final String drpDownItemName = "Concentrate - 4 oz. Refill";
	// option concentrate
	public static final String concentrateBottle = "//option[@value='1']";
	// increase the quantity 
	public static final String increaseQty = ".//*[@id='js-container-main']/div[3]/div[2]/div[1]/div[3]/div[1]/div[3]/div[2]/div/div/a[2]/span";
	// buy now button
	public static final String buyNowFunnel = "//button[@data-ng-disabled='submitDisabled()']";
	// check out down down 
	public static final String checkOutDropDown = "//a[@data-ga-event-action-on-click='Click_Checkout_Button']";
	// verify checkout page item name
	public static final String checkOutItemName = "html/body/div[1]/div/div[3]/div[5]/div/div/div[2]/div[1]/div[1]/h5";
	// verify checkout page item total 
	public static final String checkOutItemTotalPrice = "html/body/div[1]/div/div[3]/div[6]/div[2]/div[1]/div[2]";
	// proceed to checkout
	public static final String proceedCheckOut = "html/body/div[1]/div/div[3]/div[6]/div[2]/div[6]/div[1]/form/div/input[1]";
	
	// [Shipping information]
	// first name
	public static final String shipFirstName = ".//*[@id='shipping_address_first_name']";
	// last name 
	public static final String shipLastName = ".//*[@id='shipping_address_last_name']";
	// street address
	public static final String shipStreet = ".//*[@id='shipping_address_address1']";
	// country
	public static final String countryDrpDown = ".//*[@id='shipping_address_country']";
	public static final String country = "United States";
	// city
	public static final String shipCity = ".//*[@id='shipping_address_city']";
	// state
	public static final String stateDrpDown = ".//*[@id='shipping_address_state']";
	public static final String state = "California";
	// zip code
	public static final String shipZipCode = ".//*[@id='shipping_address_zip']";
	// phone number
	public static final String shipPhoneNumber = ".//*[@id='shipping_address_telephone_attributes_full_number']";	
	// save and continue 
	public static final String saveAndContinueBtn = ".//*[@id='shipping_cart_checkout']/div[3]/div[1]/input";


}

