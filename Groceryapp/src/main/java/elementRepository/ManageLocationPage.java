package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageLocationPage {
	GeneralUtilities gu = new GeneralUtilities();
	WebDriver driver;

	public ManageLocationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class ='nav-icon fas fa-map-marker']")
	WebElement location;

	@FindBy(xpath = "//a [@class='btn btn-rounded btn-warning']")
	WebElement reset;

	public void clickManageOrders() {
		gu.clickButton(location);
	}

	public String verifyBackGroundColorOfReset() {
		return gu.backgroundColor(reset);
	}
}