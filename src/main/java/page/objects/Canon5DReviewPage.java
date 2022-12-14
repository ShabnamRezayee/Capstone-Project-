package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Canon5DReviewPage extends Base {

	public Canon5DReviewPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content > div:nth-child(7) > div:nth-child(2) > div > div:nth-child(2) > div.caption > h4 > a")
	private WebElement CanonEOS5DCamera;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[3]/p/a[2]")
	private WebElement Writeareviewlink;

	@FindBy(id = "input-name")
	private WebElement nameInput;

	@FindBy(id = "input-review")
	private WebElement YourreviewInput;

	@FindBy(css = "#form-review > div:nth-child(5) > div > input[type=radio]:nth-child(6)")
	private WebElement RadioButton;

	@FindBy(id = "button-review")
	private WebElement continueButton;

	@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]")
	private WebElement textmessage;

	public void clickOnCanonEOS5DCamera() {
		CanonEOS5DCamera.click();
	}

	public void clickOnWriteareviewlink() {
		Writeareviewlink.click();
	}

	public void enterYourName(String nameValue) {
		nameInput.sendKeys(nameValue);
	}

	public void enterYourreview(String reviewValue) {
		YourreviewInput.sendKeys(reviewValue);
	}

	public void clickOnRadioButton() {
		RadioButton.click();
	}

	public void clickOncontinueButton() {
		continueButton.click();
	}

	public boolean textMessageIsPresent() {
		if (textmessage.isDisplayed())
			return true;
		else
			return false;
	}

}