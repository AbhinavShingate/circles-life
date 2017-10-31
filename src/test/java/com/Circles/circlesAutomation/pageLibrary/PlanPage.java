package com.Circles.circlesAutomation.pageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlanPage {

	
	WebDriver driver;
	
	By keepOldNumber = By.xpath(".//*[@id='st-container']/div/div/div[2]/span/div/div/div[3]/div/div[1]/div/a/div/div/div[2]/div");
	
	public PlanPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnKeepOldNumber() {
		driver.findElement(keepOldNumber).click();
		
	}
}
