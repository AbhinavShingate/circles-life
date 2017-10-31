package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageLibrary.ChooseNumberPage;
import pageLibrary.DeliveryInfoPage;
import pageLibrary.Login;
import pageLibrary.PlanPage;
import pageLibrary.PreCheckoutPage;

@Test
public class TS002_NewOrderwithoutAddOn {

	Login logIn;
	PlanPage planPage;
	WebDriver driver;
	ChooseNumberPage chooseNumberPage;
	PreCheckoutPage preCheckoutPage;
	DeliveryInfoPage deliveryInfoPage;
	
    @BeforeClass
    void Setup() {
    	
    	driver = new FirefoxDriver();
    	driver.get("https://circles-admin:123qweAadmin@staging.circles.asia/login");
		driver.get("https://staging.circles.asia/login");
    }
    
    @Test(description ="This TC will verify Successfull login")
    void VerifyLogin() {
    	logIn = new Login(driver);
		logIn.enterEmailAddress();
		logIn.enterPassword();
		logIn.clickOnSignIn();
    	
    }
    
    @Test
    void newOrderWithoutAddOn() throws InterruptedException {
    	planPage = new PlanPage(driver);
    	chooseNumberPage = new ChooseNumberPage(driver);
    	preCheckoutPage = new PreCheckoutPage(driver);
    	deliveryInfoPage = new DeliveryInfoPage(driver);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	planPage.clickOnKeepOldNumber();
    	chooseNumberPage.getAGoldenNumber();
        planPage.clickOnBuyThisPlan();
		preCheckoutPage.clickOnSecureCheckout();
		deliveryInfoPage.enterDeliveryInfo();
    }
	
}
