package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomeCurrencyPage extends Base {

	public HomeCurrencyPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement clickCurrency;

	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement selectEuro;

	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement euroCurrencydisplayed;

	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement clickShopingCart;

	@FindBy(xpath = "//*[@id=\"content\"]/p")
	private WebElement shopingCartMsg;

	public void clickCurrency() {
		clickCurrency.click();
	}

	public void selectEuroCurrency() {
		selectEuro.click();

	}

	public void euroCurrencyIcon(String string) {
		euroCurrencydisplayed.isDisplayed();
	}

	public void clickShopingCart() {
		clickShopingCart.click();
	}

	public void shopingCartMsg(String string) {
		shopingCartMsg.isDisplayed();

	}

}