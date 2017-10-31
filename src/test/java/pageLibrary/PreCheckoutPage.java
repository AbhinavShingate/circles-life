package pageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreCheckoutPage {

	WebDriver driver;
	
	By secureCheckout = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/footer/div/div/div/a");
	
	public PreCheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnSecureCheckout() {
		
		driver.findElement(secureCheckout).click();
	}
	
	
}
