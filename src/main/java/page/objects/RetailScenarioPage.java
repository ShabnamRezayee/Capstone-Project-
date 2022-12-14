package page.objects;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;

public class RetailScenarioPage extends Base {

	public RetailScenarioPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li/a")
	private WebElement registerforanaffiliateaccount;

	@FindBy(id = "input-company")
	private WebElement companyNameInput;

	@FindBy(id = "input-website")
	private WebElement websiteInput;

	@FindBy(id = "input-tax")
	private WebElement taxID;

	@FindBy(xpath = "(//div[@class='radio']/label/input)[1]")
	private WebElement payementMethodCheque;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement aboutUsCheckBox;

	@FindBy(id = "input-cheque")
	private WebElement payeeNameInput;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;

	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement editAffiliateInformation;

	@FindBy(xpath = "(//div[@class='radio']/label/input)[3]")
	private WebElement payementMethodBankTransfer;

	@FindBy(id = "input-bank-name")
	private WebElement bankName;

	@FindBy(id = "input-bank-branch-number")
	private WebElement abaBranchName;

	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCode;

	@FindBy(id = "input-bank-account-name")
	private WebElement accountName;

	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumber;

	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement editYourAccountInformation;

	@FindBy(id = "input-firstname")
	private WebElement firstNameField;

	@FindBy(id = "input-lastname")
	private WebElement lastNameField;

	@FindBy(id = "input-email")
	private WebElement emailField;

	@FindBy(id = "input-telephone")
	private WebElement telephoneField;

	public void clickonRegisterLink() {
		registerforanaffiliateaccount.click();
	}

	public void enterCompanyName(String companyNameValue) {
		companyNameInput.sendKeys(companyNameValue);
	}

	public void enterWebsideName(String webSiteNameValue) {
		websiteInput.sendKeys(webSiteNameValue);
	}

	public void enterTaxID(String TaxIDValue) {
		taxID.sendKeys(TaxIDValue);
	}

	public void selectPaymentMethod(String PaymentType) {
		if (PaymentType.equalsIgnoreCase("cheque"))
			payementMethodCheque.click();
		else if (PaymentType.equalsIgnoreCase("paypal"))
			payementMethodCheque.click();
		else
			payementMethodBankTransfer.click();
	}

	public void enterPayeeName(String payeeNameValue) {
		payeeNameInput.sendKeys(payeeNameValue);
	}

	public void clickOnAboutUs() {
		aboutUsCheckBox.click();
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public boolean successMessageVerification() {
		if (successMessage.isDisplayed())
			return true;
		else
			return false;

	}

	public void enterBankName(String bankNameValue) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-bank-name")));
		bankName.sendKeys(bankNameValue);
	}

	public void enterABABranchName(String abaBranchNameValue) {
		abaBranchName.sendKeys(abaBranchNameValue);
	}

	public void enterSwiftCode(String swiftCodeValue) {
		swiftCode.sendKeys(swiftCodeValue);
	}

	public void enterAccountName(String accountNameValue) {
		accountName.sendKeys(accountNameValue);
	}

	public void enterAccountNumber(String accountNumberValue) {
		accountNumber.sendKeys(accountNumberValue);
	}

	public void editAffiliateInformation() {
		editAffiliateInformation.click();
	}

	public void enterFistName(String firstNameValue) {
		firstNameField.clear();
		firstNameField.sendKeys(firstNameValue);
	}

	public void enterLastName(String lastNameValue) {
		lastNameField.clear();
		lastNameField.sendKeys(lastNameValue);
	}

	public void enterEmail(String emailValue) {
		emailField.clear();
		emailField.sendKeys(emailValue);
	}

	public void enterTelephone(String telephoneValue) {
		telephoneField.clear();
		telephoneField.sendKeys(telephoneValue);
	}

	private void User_click_on_Continue_button() {
		continueButton.click();

	}

	public void clickOnEditPersonalInformation() {
		editYourAccountInformation.click();
	}

	public String actualSucessMessage() {
		return successMessage.getText();

	}
}