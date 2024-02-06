package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManagePaymentPage {
	GeneralUtilities gu = new GeneralUtilities();
	WebDriver driver;

	public ManagePaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='nav-icon fas fa-credit-card']")
	WebElement managePayment;

	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr[1]//td[3]//span[@class='badge bg-success']")
	WebElement active;

	@FindBy(xpath = "//h1[@class='m-0 text-dark']")
	WebElement heading;

	@FindBy(xpath = "//button[@data-dismiss='alert']")
	WebElement alert;

	public void clickManagePaymentMethods() {
		gu.clickButton(managePayment);
	}

	public boolean VerifyDebitCardStatusIsActive() {
		return gu.isElementDisplayed(active);
	}

	public String getHeadingOfManagePaymentMethodsPage() {
		return gu.getElementText(heading);
	}

}
