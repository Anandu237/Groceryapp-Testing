package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageOrdersPage {
	GeneralUtilities gu = new GeneralUtilities();

	public ManageOrdersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	@FindBy(xpath = "//i[@class='nav-icon fas fa-shopping-basket']")
	WebElement manageOrder;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchOrder;

	public void clickManageOrders() {
		gu.clickButton(manageOrder);
	}

	public String getTextOfSearchButtonOfManageOrders() {
		return gu.getElementText(searchOrder);
	}
}
