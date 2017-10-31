package pageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;

public class PlanPage {

	
	WebDriver driver;
	
	//By keepOldNumber = By.xpath(".//*[@id='st-container']/div/div/div[2]/span/div/div/div[3]/div/div[1]/div/a/div/div/div[2]/div");
	By keepOldNumber = By.cssSelector(".col-lg-6:nth-child(1) .small-card-height .pocket-button");
	By buyThisPlan = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div/footer/div/div/div/a");
	
	public PlanPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnKeepOldNumber() {
		driver.findElement(keepOldNumber).click();
		
	}
	
	public void clickOnBuyThisPlan() {
		driver.findElement(buyThisPlan).click();
		
		
			
		
	}
}
