package com.Circles.circlesAutomation.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Circles.circlesAutomation.pageLibrary.ChooseNumberPage;
import com.Circles.circlesAutomation.pageLibrary.Login;
import com.Circles.circlesAutomation.pageLibrary.PlanPage;

@Test
public class TS002_NewOrderwithoutAddOn {

	Login logIn;
	PlanPage planPage;
	WebDriver driver;
	ChooseNumberPage chooseNumberPage;
	
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
    void newOrderWithoutAddOn() {
    	planPage = new PlanPage(driver);
    	chooseNumberPage = new ChooseNumberPage(driver);
    	planPage.clickOnKeepOldNumber();
    	
        chooseNumberPage.getAGoldenNumber();
		
    }
	
}
