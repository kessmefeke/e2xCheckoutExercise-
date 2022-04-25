package stepDefintions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.CheckoutPage;
import pageObjects.ProductPage;


public class Steps extends Base {
	public WebDriver driver;
	
	@Before
	public void setup() throws IOException{
		
		
		
		
		// Reading properties file
		configProp = new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		
		
		String br=configProp.getProperty("browser");
	
 
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
		driver=new ChromeDriver();
		}
		
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
			driver=new FirefoxDriver();
		
		}
		
		
	}
	
	
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		
		pp=new ProductPage(driver);
		
	    
	}

	@When("I go to {string}")
	public void i_go_to(String url) {
	    driver.get("https://cornerstone-light-demo.mybigcommerce.com");
	    driver.manage().window().maximize();
	    

	}

	@When("I Search for a product called {string}")
	public void i_search_for_a_product_called(String item) throws InterruptedException {
		pp.clickSearch();
		pp.setProdSearch("Oak Cheese Grater");
		
		Thread.sleep(3000);
	}
	
	

	@When("I Add the product to cart")
	public void i_add_the_product_to_cart() throws InterruptedException {
		pp.ItemImage();
		pp.rejectConsent();
		Thread.sleep(2000);
		pp.addtocart();
		
		
	    
	}

	@When("I click on checkout")
	public void i_click_on_checkout() throws InterruptedException {
		Thread.sleep(2000);
		pp.proceedTocheckout();
		
		//pp.checkout();
	    
	}
	
	
	@SuppressWarnings("deprecation")
	@Then("Page Title should be {string}")
	public void page_title_should_be(String string)throws InterruptedException {
	   
		Assert.assertEquals("Cornerstone Demo", pp.pageTitle());
			
		
		
			driver.quit();
		}
	

	
	
	
	
	// Checkout step definitions
	

@When("I enter my email\"random email\"")
public void i_enter_my_email_random_email() throws InterruptedException {
	String email=randomstring()+"@gmail.com";
	Thread.sleep(2000);
	cp=new CheckoutPage(driver);
	driver.switchTo().activeElement();
    cp.setEmail(email);
}

@Given("check the checkbox")
public void check_the_checkbox() throws InterruptedException {
	
	//Thread.sleep(3000);
	cp.privacyPolicy();
   
}

@When("I click continue as guest button")
public void i_click_continue_as_guest_button() throws InterruptedException {
	//Thread.sleep(3000);
	cp.proceed();
   
}

@When("enter my details")
public void enter_my_details() throws InterruptedException {
	
	Thread.sleep(2000);
	
    cp.country();
    cp.setFirstName("John");
    cp.setLastName("Doe");
    cp.setAddres("10 Victoria road");
    cp.setCity("Newcastle");
	cp.setpostCode("NE10 0GG");
	Thread.sleep(2000);
	cp.setPhone("07990765544");

	cp.setComment("QATest");
	cp.billingCont();
    
}

@When("enter my payment info")
public void enter_my_payment_info() throws InterruptedException {
	Thread.sleep(3000);
	
	cp.setcardNum("4111 1111 1111 1111");
	cp.setcardName("John Doe");
	cp.setcardExpiry("03/23");
	cp.setcardCvv("737");
   
}

@When("click on place order button")
public void click_on_place_order_button() {
	cp.placeOrder();
   
}

@Then("I see order confirmation page\"Thank you john!\"")
public void i_see_order_confirmation_page_thank_you_john() throws InterruptedException {
	Thread.sleep(7000);
	Assert.assertEquals("Thank you John!",driver.findElement(By.xpath("//h1[@data-test=\"order-confirmation-heading\"]")).getText());
	
	//Assert.assertTrue(driver.getPageSource().contains("Thank you john!"));
	
	System.out.println(driver.findElement(By.xpath("//h1[@data-test=\"order-confirmation-heading\"]")).getText());
	
	/*
	if(driver.getPageSource().contains("Thank you john!")){
		driver.quit();
		 
		Assert.assertTrue(true);

		
	}else{
		//Assert.assertEquals("Cornerstone Demo", driver.getTitle());
		Assert.assertTrue(false);
	}
	*/
}


	
@And("I close browser")
public void i_close_browser() {
	driver.quit();

}
	
	
	

}
