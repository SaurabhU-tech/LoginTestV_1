package stepDefinition;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import browserFactory.AllBrowsers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import objectRepository.LoginObjectFileWith_PF;

public class StepDefinitionFile {
	
	AllBrowsers browserobj = new AllBrowsers();
	WebDriver driver = browserobj.initBrowser("Chrome");
	
	LoginObjectFileWith_PF obj = new LoginObjectFileWith_PF(driver);
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		obj.launchApplication("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@When("^user enter \"(.*)\" and \"(.*)\"$")
    public void user_enter_username_and_password(String username, String password) {
		obj.enterUserName(username);
		obj.enterPassword(password);
		obj.clickOnLogin();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		Assert.assertTrue(obj.goToInboxLink());
	}

	@Then("close the browser")
	public void close_the_browser() {
		obj.closeBrowser();
	}
}
