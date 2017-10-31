package pageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChooseNumberPage {

	WebDriver driver;
	
	By getNewNumber = By.xpath(".//*[@id='number-select-container']/div[2]/div/div/div/div/div[1]/div[2]/div/div/center");
    By selectGoldenNumber = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div/div[2]/div[3]/div/div[2]/div[3]/div[2]/button");
    By getThisNumber = By.xpath(".//*[@id='number-select-container']/footer/div/div/div/a");
    
    public ChooseNumberPage(WebDriver driver) {
    	this.driver = driver;
    }
    
    public void getAGoldenNumber() {
    	driver.findElement(getNewNumber).click();
    	driver.findElement(selectGoldenNumber).click();
    	driver.findElement(getThisNumber).click();
    }
    
}
