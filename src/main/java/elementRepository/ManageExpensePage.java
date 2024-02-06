package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageExpensePage {

	GeneralUtilities gu = new GeneralUtilities();
	WebDriver driver;

	public ManageExpensePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@ class='nav-icon fas fa-money-bill-alt']")
	WebElement expense;

	@FindBy(xpath = "/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[4]/ul[1]/li/a/p")
	WebElement expenseCategory;

	@FindBy(xpath = "//h1[@class='m-0 text-dark']")
	WebElement expenseHead;

	public void clickManageExpense() {
		gu.clickButton(expense);

	}

	public void selectExpenseCategory() {
		gu.clickButton(expenseCategory);

	}

	public String getHeadingOfExpenseCategoryPage() {
		return gu.getElementText(expenseHead);
	}
}
