package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaiterHelper {
	
	public WebDriver driver;
	 
	 public WaiterHelper(WebDriver driver){
		 this.driver = driver;
	 }

	 
	 // making sure element is present in webpage
	 public void WaitForElement(WebElement element,long timeOutInSeconds){
		 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		wait.until(ExpectedConditions.visibilityOf(element));
		 
		
	 }

}
