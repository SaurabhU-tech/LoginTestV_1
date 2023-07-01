package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginObjectFileWith_PF {

	WebDriver driver;
	
	//Constructor of the page class:
		public LoginObjectFileWith_PF(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
	

	@FindBy(id = "login1")
	@CacheLookup
	WebElement emailId;
	
	@FindBy(how=How.ID, using = "password")
	@CacheLookup
	WebElement password;
	
	@FindBy(how = How.NAME, using = "proceed")
	@CacheLookup
	WebElement signInButton;
	
	@FindBy(linkText = "Skip,Go to Inbox")
	@CacheLookup
	WebElement goToInbox;
	
	
	//page actions: features(behavior) of the page the form of methods:

	public void launchApplication(String url) {
		driver.get(url);
	}
	public void enterUserName(String username) {
		emailId.sendKeys(username);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickOnLogin() {
		signInButton.click();
	}
	
	public boolean goToInboxLink() {
		boolean flag = false; 
		try
		{
		flag = goToInbox.isDisplayed();
		}catch(NoSuchElementException e)
		{
			System.out.println("Element not found");
		}
		return flag;
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
