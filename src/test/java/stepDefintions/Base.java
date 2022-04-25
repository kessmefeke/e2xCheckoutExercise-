package stepDefintions;


import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.CheckoutPage;
import pageObjects.ProductPage;
public class Base {
	
	
	public WebDriver driver;
	public ProductPage pp;
	public CheckoutPage cp;
	public Properties configProp;
	
	//Created for generating random string for unique email ids
	  public static String randomstring() {
		  
		  String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		  return(generatedString1);

}
	  
}	  
