package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class PushNotificationsPage {
	GeneralUtilities gu = new GeneralUtilities();

	public PushNotificationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	@FindBy(xpath = "//i[@ class='nav-icon fas fa-fas fa-bell']")
	WebElement push;

	@FindBy(xpath = "//li [@class='breadcrumb-item active']")
	WebElement pushNotification;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement send;

	@FindBy(xpath = "//a[@class='btn btn-default btn-fix']")
	WebElement reset;

	@FindBy(xpath = "//input[@name='titlep']")
	WebElement title;

	@FindBy(xpath = "//input[@name='description']")
	WebElement description;

	@FindBy(xpath = "//button[@data-dismiss='alert']")
	WebElement alert;

	public void clickPushNotification() {
		gu.clickButton(push);

	}

	public String getTextOfHeadingOfPushNotificationPage() {
		return gu.getElementText(pushNotification);
	}

	public String getTextOfSendButton() {
		return gu.getElementText(send);
	}

	public String verifyBackGroundColorOfReset() {
		return gu.backgroundColor(reset);
	}

	public void enterTitle(String v) {
		gu.enterValue(title, v);
	}

	public void enterDescription(String v) {
		gu.enterValue(description, v);
	}

	public void clickSendButton() {
		gu.clickButton(send);
	}

	public Boolean isAlertPresent() {
		return gu.isElementDisplayed(alert);
	}

}
