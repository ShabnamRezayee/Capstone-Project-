package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LoginPage;

public class LoginStepDef extends Base {
	LoginPage loginPage = new LoginPage();

	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
		loginPage.clickMyAccount();
		logger.info("User clicked on MyAccount");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		loginPage.clickLogin();
		logger.info("User clicked on Login");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String password) {
		loginPage.enterEmailinput(email);
		logger.info("User Entered username" + email);
		loginPage.enterPasswordinput(password);
		logger.info("User Entered Password" + password);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		loginPage.clickLoginButton();
		logger.info("User Clicked on Login Button");

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(loginPage.myAccountTextIsPresent());
		logger.info("User should be in MyAccount Page");
	}

}