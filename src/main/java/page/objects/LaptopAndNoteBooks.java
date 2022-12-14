package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopAndNoteBooks extends Base {

	public LaptopAndNoteBooks() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;

	@FindBy(xpath = "/html/body/div[1]/nav/div[2]/ul/li[2]/a")
	private WebElement laptopNotebooksTab;

	@FindBy(xpath = "/html/body/div[1]/nav/div[2]/ul/li[2]/div/a")
	private WebElement showAllLaptopNotebook;

	@FindBy(css = ("#content > div:nth-child(7) > div:nth-child(2) > div > div:nth-child(2) > div.caption > h4 > a"))
	private WebElement macBookButton;

	@FindBy(id = "button-cart")
	private WebElement AddToCartButton;

	@FindBy(xpath = "/html/body/div[2]/div[1]")
	private WebElement SuccessText;

	@FindBy(id = "cart-total")
	private WebElement cartitem;

	@FindBy(xpath = "/html/body/header/div/div/div[3]/div/button")
	private WebElement cartoption;

	@FindBy(xpath = "//button[@title=\"Remove\"]")
	private WebElement RedXButton;

	@FindBy(xpath = "/html/body/header/div/div/div[3]/div/button/span")
	private WebElement cartitem2;

	// Scenario: Product Comparison

	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[2]/div/div[2]/div[2]/button[3]")
	private WebElement comparisoniconOnMacBook;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement comparisoniconOnMacBookAir;

	@FindBy(xpath = "/html/body/div[2]/div[1]")
	private WebElement SuccessText2;

	@FindBy(id = "compare-total")
	private WebElement productcomparisonlink;

	@FindBy(xpath = "/html/body/div[2]/div/div")
	private WebElement productComparisonChart;

	// Scenario: Adding an item to Wish list

	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement hearticon;

	@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
	private WebElement message;

	// Scenario: Validate the price of MacBook Pro is 2000

	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[4]/div/div[2]/div[1]/h4/a")
	private WebElement macBookproitem;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/ul[2]/li[1]/h2")
	private WebElement priceTag;

	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnlaptopNotebooksTab() {
		laptopNotebooksTab.click();
	}

	public void clickshowAllLaptopNotebook() {
		showAllLaptopNotebook.click();
	}

	public void clickOnMacBookButton() {
		macBookButton.click();
	}

	public void clickOnAddToCartButton() {
		AddToCartButton.click();
	}

	public boolean SuccessTextIsPresent() {
		if (SuccessText.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean cartitemIsPresent() {
		if (cartitem.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnCartoption() {
		cartoption.click();
	}

	public void clickonRedXButton() {
		RedXButton.click();
	}

	public void showcartitem2() {
		cartitem2.isDisplayed();
	}
	// Scenario: Product Comparison

	public void clickOncomparisoniconOnMacBook() {
		comparisoniconOnMacBook.click();
	}

	public void clickOncomparisoniconOnMacBookAir() {
		comparisoniconOnMacBookAir.click();
	}

	public boolean SuccessText2IsPresent() {
		if (SuccessText2.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnproductcomparisonlink() {
		productcomparisonlink.click();
	}

	public boolean productComparisonChartIsPresent() {
		if (productComparisonChart.isDisplayed())
			return true;
		else
			return false;
	}

	// Scenario: Adding an item to Wish list

	public void clickOnhearticon() {
		hearticon.click();
	}

	public void getmessage(String String) {
		message.getText();
	}

	// Scenario: Validate the price of MacBook Pro is 2000

	public void clickOnmacBookproitem() {
		macBookproitem.click();
	}

	public boolean priceTagIsPresent() {
		if (priceTag.isDisplayed())
			return true;
		else
			return false;
	}

}