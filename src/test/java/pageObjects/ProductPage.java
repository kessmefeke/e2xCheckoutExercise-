package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaiterHelper;
import utilities.WaiterHelper;

public class ProductPage {
	
	Actions action;
	
	public WebDriver ldriver;
	WaiterHelper waiterhelper;
	
	public ProductPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}

	
	@FindBy(xpath ="//button[@id='quick-search-expand']")
	@CacheLookup
	WebElement btnSearch;
	
	
	@FindBy(xpath ="//input[@id='nav-quick-search']")
	@CacheLookup
	WebElement txtProduct;
	
	
	@FindBy(xpath ="//header/nav[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/article[1]/div[1]/h3[1]/a[1]")
	@CacheLookup
	WebElement itemImage;
	
	
	@FindBy(xpath ="//input[@id='form-action-addToCart']")
	@CacheLookup
	WebElement btnAddtocart;
	
	
	@FindBy(xpath ="//*[@id=\"consent-manager\"]/div/div/div/div[2]/button[2]")
	@CacheLookup
	WebElement btnConsent;
	
	
	@FindBy(xpath ="//a[contains(text(),'Check out')]")
	@CacheLookup
	WebElement btnCheckout;
	
	
	@FindBy(xpath ="//a[contains(text(),'Proceed to checkout')]")
	@CacheLookup
	WebElement btnProceed;
	
	@FindBy(xpath ="//h2[contains(text(),'Customer')]")
	@CacheLookup
	WebElement h2custtitle;
	
	

	
	public void rejectConsent()
	{
		btnConsent.click();
	}
	
	public String pageTitle()
	{
		return ldriver.getTitle();
	}
	
	
	
	public void clickSearch()
	{
		btnSearch.click();
	}
	
	
	public void setProdSearch(String product)
	{
		txtProduct.clear();
		txtProduct.sendKeys(product);
	}
	
	
	
	/*
	public void performMouseHover(WebElement element,WebDriver rdriver)
	{
		action = new Actions(rdriver);
		action.moveToElement(element).build().perform();
	}
	
	*/
	
	public void ItemImage()
	{
		itemImage.click();
	}
	
	
	public void addtocart()
	{
		btnAddtocart.click();
		
		
	}
	
	public void proceedTocheckout()
	{
		btnProceed.click();
		
		
	}
	
	public void checkout()
	{
		btnCheckout.click();
	}
	
	
	
	
	
	
	
	
}
