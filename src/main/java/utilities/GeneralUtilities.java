package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {

	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public void clickButton(WebElement element) {
		element.click();
	}

	public void enterValue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public String backgroundColor(WebElement element) {
		return element.getCssValue("background-color");
	}

	public void alert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public Boolean isElementDisplayed(WebElement element) {
		Boolean status = element.isDisplayed();
		return status;
	}

	public String selectFromDropDown(WebElement element, int value) {

		Select s = new Select(element);
		s.selectByIndex(value);

		WebElement selectedValue = s.getFirstSelectedOption();
		return selectedValue.getText();

	}
}