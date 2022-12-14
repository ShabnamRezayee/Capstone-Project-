package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class CanonEOS5DPage extends Base {

	public CanonEOS5DPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement AddToCartButton;

	@FindBy(xpath = "//select[@id=\"input-option226\"]")
	private WebElement SelectDropdown;

	@FindBy(xpath = "//option[@value=\"15\"]")
	private WebElement selectColor;

	@FindBy(xpath = "//input[@name=\"quantity\"]")

	private WebElement Qty;

	@FindBy(id = "button-cart")
	private WebElement AddToCartButton2;

	@FindBy(xpath = "/html/body/div[2]/div[1]")
	private WebElement Successtext;

	public void clickOnAddToCartTabOnCanonEOS5D() {
		AddToCartButton.click();
	}

	public void clickOnSelectDropdown() {
		SelectDropdown.click();
	}

	public void selectvisibleText(WebElement AvailableOptions, String text) {
		Select select = new Select(AvailableOptions);
		select.selectByVisibleText(text);
	}

	public void Qty(String q) {
		Qty.clear();
		Qty.sendKeys(q);
	}

	public void clickonAddToCartButton2() {
		AddToCartButton2.click();
	}

	public boolean SuccessTextIsPresent() {
		if (Successtext.isDisplayed())
			return true;
		else
			return false;

	}

}