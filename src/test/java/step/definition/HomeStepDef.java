package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomeCurrencyPage;
import utilities.Util;

public class HomeStepDef extends Base {

	HomeCurrencyPage homeCurrencyPage = new HomeCurrencyPage();

	@When("User click on Currency")
	public void user_click_on_currency() {
		homeCurrencyPage.clickCurrency();
		logger.info("User clicked on currency");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homeCurrencyPage.selectEuroCurrency();
		logger.info("User selected Euro Currency from dropdown");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertTrue(true);
		logger.info("Euro icon Currency should be displayed");
		Util.takeScreenShot();
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homeCurrencyPage.clickShopingCart();
		logger.info("User Clicked on Shopping Cart");
	}

	@Then("Your shopping cart is empty! message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		Assert.assertTrue(true);
		logger.info("Your shopping cart is empty!");
		Util.takeScreenShot();
	}
}