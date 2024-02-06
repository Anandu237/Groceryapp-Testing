package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {


	    
	    public  void explicitWaitForAlert(WebDriver driver,int time) {
	        WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(time));
	        wait.until(ExpectedConditions.alertIsPresent());
	    }
	    public  void explicitWaitForElement(WebDriver driver,int time,String locatorvalue) {
	        WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(time));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
	    } 
	    public  void explicitWaitForFrame(WebDriver driver,int time,String locatorvalue) {
	        WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(time));
	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(locatorvalue)));
	    }
	}


