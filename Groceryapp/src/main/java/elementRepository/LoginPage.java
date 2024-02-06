
package elementRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelCode;
import utilities.GeneralUtilities;

public class LoginPage {
	GeneralUtilities gu = new GeneralUtilities();
    WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@type='text']")
	WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;

	@FindBy(xpath = "//button[@data-dismiss='alert']")
	WebElement alert;

	public void enterUsername() throws IOException {
		gu.enterValue(username, ExcelCode.readStringData(0, 1));
	}

	public void enterPassword() throws IOException {
		gu.enterValue(password, ExcelCode.readStringData(0, 1));
	}

	public void signinClick() {
		gu.clickButton(signin);
	}

	public void enterInvalidUserNameAndPassword(String data1, String data2) {
		gu.enterValue(username, data1);

		gu.enterValue(password, data2);

	}
	public boolean isAlertMessageDisplayed() {
		return gu.isElementDisplayed(alert);
	}
	

}
