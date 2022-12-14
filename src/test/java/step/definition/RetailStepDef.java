package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailScenarioPage;
import utilities.Util;

public class RetailStepDef extends Base {

	RetailScenarioPage retail = new RetailScenarioPage();

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retail.clickonRegisterLink();
		logger.info("User Clicked on Register for an Affiliate Account Link ");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> Affiliateinformation = dataTable.asMaps(String.class, String.class);
		retail.enterCompanyName(Affiliateinformation.get(0).get("company"));
		retail.enterWebsideName(Affiliateinformation.get(0).get("website"));
		retail.enterTaxID(Affiliateinformation.get(0).get("taxID"));
		retail.selectPaymentMethod(Affiliateinformation.get(0).get("paymentMethod"));
		retail.enterPayeeName(Affiliateinformation.get(0).get("payeeName"));
		logger.info("user filled affiliate form with required information");
		Util.takeScreenShot();
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retail.clickOnAboutUs();
		logger.info("user check on About us Check box");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retail.clickOnContinueButton();
		logger.info("user clicked on Continue Button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		Assert.assertTrue(retail.successMessageVerification());
		logger.info("Success message verified");
		Util.takeScreenShot();
	}

	@When("User click on Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retail.editAffiliateInformation();
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.selectPaymentMethod("bankTransfer");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> bankinformation = dataTable.asMaps(String.class, String.class);
		retail.enterBankName(bankinformation.get(0).get("bankName"));
		retail.enterABABranchName(bankinformation.get(0).get("abaNumber"));
		retail.enterSwiftCode(bankinformation.get(0).get("swiftCode"));
		retail.enterAccountName(bankinformation.get(0).get("accountName"));
		retail.enterAccountNumber(bankinformation.get(0).get("accountNumber"));
		logger.info("User Filled Bank Information");
		Util.takeScreenShot();
	}

	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retail.clickOnEditPersonalInformation();
	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> personalInformation = dataTable.asMaps(String.class, String.class);
		retail.enterFistName(personalInformation.get(0).get("firstName"));
		retail.enterLastName(personalInformation.get(0).get("lastName"));
		retail.enterEmail(personalInformation.get(0).get("Email"));
		retail.enterTelephone(personalInformation.get(0).get("Telephone"));
		Util.takeScreenShot();
	}

	@Then("User should see a message")
	public void user_should_see_a_message_Your_account_has_been_successfully_updated(String expectedMessage) {
		Assert.assertEquals(expectedMessage, retail.actualSucessMessage());
		logger.info("Your account has been successfully updated");
	}
}