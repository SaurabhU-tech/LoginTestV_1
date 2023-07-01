package browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AllBrowsers {
	
 public WebDriver driver;
	
	public WebDriver initBrowser(String browserName)
	{
		if(browserName == "Chrome")
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		if(browserName == "IE")
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\asus\\Desktop\\SelJar\\iedriver.exe");
			driver = new InternetExplorerDriver();	
		}
		if(browserName == "Safari")
		{
			System.setProperty("webdriver.safari.driver", "C:\\Users\\asus\\Desktop\\SelJar\\selenium-safari-driver.jar");
			driver = new SafariDriver();	
		}
		if(browserName == "firefox")
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\asus\\Desktop\\SelJar\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		return driver;
	}
}
