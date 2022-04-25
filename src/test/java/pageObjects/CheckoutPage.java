package pageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	

    public Actions action;
	
	public WebDriver ldriver;
	
	public CheckoutPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	
	@FindBy(xpath ="//input[@id='email']")
	@CacheLookup
	WebElement txtEmail;
	
	
	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement checkboxPrivacy;
	
	@FindBy(xpath ="//button[@id='checkout-customer-continue']")
	@CacheLookup
	WebElement btnContinue;
	
	@FindBy(xpath ="//select[@id='countryCodeInput']")
	@CacheLookup
	WebElement selectCountry;
	
	@FindBy(xpath ="//input[@id='firstNameInput']")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy(xpath ="//input[@id='lastNameInput']")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(xpath ="//input[@id='addressLine1Input']")
	@CacheLookup
	WebElement txtAddress;
	
	
	@FindBy(xpath ="//input[@id='cityInput']")
	@CacheLookup
	WebElement txtCity;
	
	
	@FindBy(xpath ="//input[@id='postCodeInput']")
	@CacheLookup
	WebElement txtPostCode;
	
	@FindBy(xpath ="//input[@id='phoneInput']")
	@CacheLookup
	WebElement txtPhone;
	
	
	@FindBy(xpath ="//input[@name=\"orderComment\"]")
	@CacheLookup
	WebElement txtOrderComm;
	
	@FindBy(xpath ="//button[@id='checkout-shipping-continue']")
	@CacheLookup
	WebElement btnBillinCont;
	
	@FindBy(xpath ="//body/div[@id='checkout-app']/div[1]/div[1]/div[1]/div[1]/ol[1]/li[2]/div[2]/div[1]/div[2]/div[1]/form[1]/fieldset[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]")
	@CacheLookup
	WebElement shippingMeth;
	
	
	@FindBy(xpath ="//input[@id='ccNumber']")
	@CacheLookup
	WebElement txtCardNumber;
	
	
	
	@FindBy(xpath ="//input[@id='ccName']")
	@CacheLookup
	WebElement txtCardName;
	
	@FindBy(xpath ="//input[@id='ccExpiry']")
	@CacheLookup
	WebElement txtCardExpiry;
	
	
	@FindBy(xpath ="//input[@id='ccCvv']")
	@CacheLookup
	WebElement txtCardCvv;
	
	@FindBy(xpath ="//button[@id='checkout-payment-continue']")
	@CacheLookup
	WebElement btnPlaceOrder;
	
	
	public void setEmail(String email)
	{
		//txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	
	public void privacyPolicy()
	{
		checkboxPrivacy.click();
	}
	
	
	public void proceed()
	{
		btnContinue.click();
	}
	
	public void country()
	{
		
		Select sel = new Select(selectCountry);
		sel.selectByVisibleText("United Kingdom");
	}
	
	
	
	public void setFirstName(String firstname)
	{
		txtFirstName.clear();
		txtFirstName.sendKeys(firstname);
	}
	
	
	
	public void setLastName(String lastname) throws InterruptedException
	{
		txtLastName.clear();
		txtLastName.sendKeys(lastname);
	}
	
	
	
	public void setAddres(String address)
	{
		txtAddress.clear();
		txtAddress.sendKeys(address);
	}
	
	
	
	public void setCity(String city)
	{
		txtCity.clear();
		txtCity.sendKeys(city);
	}
	
	
	
	public void setpostCode(String postcode)
	{
		txtPostCode.clear();
		txtPostCode.sendKeys(postcode);
	}
	
	
	

	public void setPhone(String phone)
	{
		txtPhone.clear();
		txtPhone.sendKeys(phone);
	}
	
	
	
	public void setComment(String addComment) throws InterruptedException
	{
		
		WebElement myElement = new WebDriverWait(ldriver,Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(shippingMeth));
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView();", myElement);
		
		txtOrderComm.sendKeys(addComment);
		Thread.sleep(6);
		
	}
	
	public void billingCont() throws InterruptedException
	{
		
		
		//ldriver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      //Javascript executor
	      ((JavascriptExecutor) ldriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//btnBillinCont.click();
		WebDriverWait wait = new WebDriverWait(ldriver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(btnBillinCont)).click();
		
		
	
		//Actions actions = new Actions(ldriver);
		//actions.moveToElement(btnBillinCont).build().perform();
		//WebElement myElement2 = new WebDriverWait(ldriver,Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(btnBillinCont));
		//((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView()", myElement2);
		
		
		//myElement2.click();
		//Thread.sleep(6);
		//btnBillinCont.click();
	
	}
	
	
	
	//payment details
	
	
	public void setcardNum(String cardnumber)
	{
		txtCardNumber.clear();
		txtCardNumber.sendKeys(cardnumber);
	}
	
	
	
	public void setcardName(String cardname)
	{
		txtCardName.clear();
		txtCardName.sendKeys(cardname);
	}
	
	
	
	public void setcardExpiry(String cardexpiry)
	{
		txtCardExpiry.clear();
		txtCardExpiry.sendKeys(cardexpiry);
	}
	
	
	
	
	public void setcardCvv(String cardcvv)
	{
		txtCardCvv.clear();
		txtCardCvv.sendKeys(cardcvv);
	}
	
	
	
	
	public void placeOrder()
	{
		btnPlaceOrder.click();
	}
	
	
	
	

}
