package pageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;
	
	By emailAddress = By.name("email");
	By password = By.name("password");
	By signIn = By.xpath(".//*[@id='st-container']/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div[3]/form/div[4]/div/div/button");
	By companyLogo = By.xpath(".//*[@id='st-container']/div/div/div[1]/div/div/div[1]/a/img");
	//WebElement emailAddress = driver.findElement(By.name("email"));
	//WebElement password = driver.findElement(By.name("password"));
	//WebElement signINButton = driver.findElement(By.xpath(".//*[@id='st-container']/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div[3]/form/div[4]/div/div/button"));
    
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterEmailAddress() {
		driver.findElement(emailAddress).sendKeys("abhinavvelotiotestmail@gmail.com");
		
	}
    
	public void enterPassword() {
		driver.findElement(password).sendKeys("arsenal2422232");
	}
	
	public void clickOnSignIn() {
		driver.findElement(signIn).click();
	}
	
	public void logoPresent() {
		driver.findElement(companyLogo);
	}
}
