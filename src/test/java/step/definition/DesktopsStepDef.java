package step.definition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.Canon5DReviewPage;
import page.objects.CanonEOS5DPage;
import page.objects.DesktopsPage;
import page.objects.HPLP3065Page;
import utilities.Util;

public class DesktopsStepDef extends Base {

	DesktopsPage desktopsPage = new DesktopsPage();
	HPLP3065Page hplp3065Page = new HPLP3065Page();
	CanonEOS5DPage canonEOS5page = new CanonEOS5DPage();
	Canon5DReviewPage canon5Dreviewpage = new Canon5DReviewPage();

	private WebElement WebElement;

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(desktopsPage.isLogoDisplayed());
		logger.info("user is on Home Page");
	}

	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		desktopsPage.clickOnDesktopTab();
		logger.info("user clicked on Desktops tab");

	}

	@And("User click on Show all desktops")
	public void user_click_On_Show_all_desktops() {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("user clicked on Show all Desktops");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_Desktops_page() {
		List<WebElement> items = desktopsPage.elements();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("alt") + " is present in this page");
		}
		int size = items.size();
		Assert.assertEquals(size, 14);
		Util.takeScreenShot();

	}

	// Scenario: User add HPLP 3065 from Desktops tab to the cart

	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {

		hplp3065Page.clickOnAddToCartTabOnHPLP3065();
		logger.info("user clicked on Add to Cart Tab");
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String Qty) {
		hplp3065Page.Qty(Qty);
		logger.info("User select quantity");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		hplp3065Page.clickonAddToCartButton();
		logger.info("user clicked on Add to Cart Button");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(hplp3065Page.SuccessTextIsPresent());
		logger.info("user should see a message success:You have added HPLP3065 to Shopping Cart ");
	}
	// Scenario: User add Canon EOS 5D from Desktops tab to the cart

	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		canonEOS5page.clickOnAddToCartTabOnCanonEOS5D();
		logger.info("user clicked on Add to Cart Tab");
	}

	@When("User click on select dropdown")
	public void user_click_on_select_dropdown() {
		canonEOS5page.clickOnSelectDropdown();
		logger.info("user click on select dropdown");
	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		logger.info("user select color from dropdown red");
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		canonEOS5page.Qty("Qty");
		logger.info("User select quantity");
	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		Assert.assertTrue(canonEOS5page.SuccessTextIsPresent());
		logger.info("user should see a message success:You have added canon eos 5d to your Shopping Cart ");
	}

	// Scenario: User add a review to Canon EOS 5D item in Desktops tab

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		canon5Dreviewpage.clickOnCanonEOS5DCamera();
		logger.info("user click on canon eos 5d item");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		canon5Dreviewpage.clickOnWriteareviewlink();
		logger.info("user click on write a review link");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		logger.info("user fill the review information ");
	}

	@When("User enter name {string}  and review {string}")
	public void user_enter_name_and_review(String string, String string2) {
		canon5Dreviewpage.enterYourName(string);
		logger.info("user enter the Name " + string);
		canon5Dreviewpage.enterYourreview(string2);
		logger.info("user enter the review  " + string2);
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		canon5Dreviewpage.clickOncontinueButton();
		logger.info("user click on continue button");
	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		Assert.assertTrue(canon5Dreviewpage.textMessageIsPresent());
		logger.info(
				"user should see a message with Thank you for your review. It has been submitted to the webmaster for approval");
	}

}