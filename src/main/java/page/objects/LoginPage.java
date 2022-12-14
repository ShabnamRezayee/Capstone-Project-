package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPage extends Base {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccountElement;

	@FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	private WebElement loginElement;

	@FindBy(id = "input-email")
	private WebElement emailInput;

	@FindBy(id = "input-password")
	private WebElement passwordInput;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountText;

	public void clickMyAccount() {
		myAccountElement.click();
	}

	public void clickLogin() {
		loginElement.click();
	}

	public void enterEmailinput(String emailValue) {
		emailInput.sendKeys(emailValue);

	}

	public void enterPasswordinput(String passwordValue) {
		passwordInput.sendKeys(passwordValue);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public boolean myAccountTextIsPresent() {
		if (myAccountText.isDisplayed())
			return true;
		else
			return false;
	}
}