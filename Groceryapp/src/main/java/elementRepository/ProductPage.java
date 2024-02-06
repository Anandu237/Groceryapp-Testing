package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;
import utilities.WaitUtility;

public class ProductPage {
	
	WebDriver driver;
	WaitUtility wu= new WaitUtility();
	GeneralUtilities gu = new GeneralUtilities();

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i [@class='nav-icon fas fa-tasks']")
	WebElement product;

	@FindBy(xpath = "//h1[@class='m-0 text-dark']")
	WebElement listPoducts;

	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr[1]//td[9]//a[@class='btn btn-sm btn btn-danger btncss']")
	WebElement delete;

	@FindBy(xpath = "//div [@class='alert alert-success alert-dismissible']")
	WebElement success;

	@FindBy(xpath = "//button[@data-dismiss='alert']")
	WebElement alert;

	public void clickManageProduct() {
		gu.clickButton(product);
	}

	public void clickDeleteOption() {
		gu.clickButton(delete);
	}

	public void acceptAlert() {
		wu.explicitWaitForAlert(driver,10000);
		gu.alert(driver);
	}

	public Boolean isAlertMessageDisplayed() {
		return gu.isElementDisplayed(alert);
	}

	public String getTextOfHeadingOfProductPage() {
		return gu.getElementText(listPoducts);
	}

}
