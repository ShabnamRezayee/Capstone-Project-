package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;
import page.objects.LaptopAndNoteBooks;

public class LaptopAndNoteBooksStepDef extends Base {

	DesktopsPage desktopsPage = new DesktopsPage();
	LaptopAndNoteBooks laptopandnotebooks = new LaptopAndNoteBooks();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopandnotebooks.clickOnlaptopNotebooksTab();
		logger.info("user click on laptop notebook tab");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopandnotebooks.clickshowAllLaptopNotebook();
		logger.info("user click on show all laptop notebook option");
	}
	// Scenario: Add and Remove a Mac book from Cart

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopandnotebooks.clickOnMacBookButton();
		logger.info("user click on macbook Button");
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		Assert.assertTrue(laptopandnotebooks.SuccessTextIsPresent());
		logger.info("user should see a message success you have added macbook to your shopping cart");
	}

	@Then("User should see ‘{int} tem\\(s){double}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
		Assert.assertTrue(laptopandnotebooks.cartitemIsPresent());
		logger.info("user should see items showed to the cart ‘1 item(s)-602.00’  ");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopandnotebooks.clickOnCartoption();
		logger.info("user click on cart button");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopandnotebooks.clickonRedXButton();
		logger.info("user click on red x button to remove the item from cart");
	}

	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		Assert.assertTrue(laptopandnotebooks.cartitemIsPresent());
		logger.info("item should be removed and cart should show item ‘0 item(s)’");
	}
	// Scenario: Product Comparison

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopandnotebooks.clickOncomparisoniconOnMacBook();
		logger.info("user click on product comparison icon on MacBook");
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopandnotebooks.clickOncomparisoniconOnMacBookAir();
		logger.info("user click on product comparison icon on MacBook Air");
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		Assert.assertTrue(laptopandnotebooks.SuccessText2IsPresent());
		logger.info("user should see a message success:you have added MacBook Air to your product comparison!");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopandnotebooks.clickOnproductcomparisonlink();
		logger.info("user click on product comparison link");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(laptopandnotebooks.productComparisonChartIsPresent());
		logger.info("user should see product comparison chart");
	}
	// Scenario: Adding an item to Wish list

	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopandnotebooks.clickOnhearticon();
		logger.info("user click on heart icon to add Sony VaIO laptop to wish list");
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		Assert.assertTrue(laptopandnotebooks.productComparisonChartIsPresent());
		logger.info(
				"user should get a message you must login or create an account to save Sony VAIO to your wish list!");
	}
	// Scenario: Validate the price of MacBook Pro is 2000

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopandnotebooks.clickOnmacBookproitem();
		logger.info("user click on MacBook Pro item");
	}

	@Then("User should see ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		Assert.assertTrue(laptopandnotebooks.priceTagIsPresent());
		logger.info("user should see ${double} price tag is present on UI");
	}
}