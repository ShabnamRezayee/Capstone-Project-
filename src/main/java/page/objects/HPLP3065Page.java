package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HPLP3065Page extends Base {

	public HPLP3065Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "button-cart")
	private WebElement AddToCartButton;

	@FindBy(id = "input-quantity")
	private WebElement Qty;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement AddToCartButton2;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement Successtext;

	public void clickOnAddToCartTabOnHPLP3065() {
		AddToCartButton2.click();
	}

	public void Qty(String q) {
		Qty.clear();
		Qty.sendKeys(q);
	}

	public void clickonAddToCartButton() {
		AddToCartButton.click();
	}

	public boolean SuccessTextIsPresent() {
		if (Successtext.isDisplayed())
			return true;
		else
			return false;

	}

}