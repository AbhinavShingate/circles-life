package testScripts;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageLibrary.AdminLoginPage;
import pageLibrary.AdminPortalHome;

@Test
public class TS003_ProcessOrderOnAdminPortal {
	
	WebDriver driver;
	AdminLoginPage adminLogin;
	AdminPortalHome adminHome;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
    	driver.get("http://borg.circles.asia:6180/");
		
	}
	
	@Test
	public void login() throws InterruptedException, AWTException {
		
		adminLogin = new AdminLoginPage(driver);
		adminHome = new AdminPortalHome(driver);
		adminLogin.enterLoginDetails();
		adminHome.approveProcess();
		Thread.sleep(4000);
		adminHome.deliverProcess();
		adminHome.planSwitchProcess();
						
	}
	
	@Test
	public void approveDocument() throws InterruptedException, AWTException {
		
		
		
		
	}
	

}
