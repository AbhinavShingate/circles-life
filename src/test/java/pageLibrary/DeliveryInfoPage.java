package pageLibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class DeliveryInfoPage {
	
	WebDriver driver;
	By fullName = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/input");
    By contactNmber = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[1]/div[2]/div[4]/div/div/div/div[2]/input");
	By dobDay = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div/div[1]/select");
	By dobMonth = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div/div[2]/select");
	By dobYear = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div/div[3]/select");
	By postalCode = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div[1]/div/div/div/div[2]/input");
	By houseNo = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div/div[2]/input");
	By streetName = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div/div[2]/input");
	By delivaryDay = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div[4]/div");
	By deliveryTime = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/div/div[1]/div/span/span[3]");
	By idType= By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div[1]/div/div/select");
	By frontImage = By.cssSelector("#st-container > div > div > div:nth-child(2) > span > div > div:nth-child(2) > div > div > div > div:nth-child(4) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div");
	By backImage = By.cssSelector("#st-container > div > div > div:nth-child(2) > span > div > div:nth-child(2) > div > div > div > div:nth-child(4) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div");
	By nic = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[4]/div[2]/div[2]/div/div/div/div[2]/input");
	By sceureCheckOut = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/footer/div/div/div/div");
	
	public DeliveryInfoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectDob() {
		WebElement Day = driver.findElement(dobDay);
		Select dropdownDay = new Select(Day);
	    dropdownDay.selectByIndex(10);
		
		WebElement Month = driver.findElement(dobMonth);
		Select dropdownMonth = new Select(Month);
		dropdownMonth.selectByIndex(7);
		
		WebElement Year = driver.findElement(dobYear);
		Select dropdownYear = new Select(Year);
		dropdownYear.selectByIndex(10);

		
	}
	
	public void enterDeliveryInfo() throws InterruptedException, AWTException {
		driver.findElement(fullName).sendKeys("Testing");
		driver.findElement(contactNmber).sendKeys("88378826");
		selectDob();
		driver.findElement(postalCode).sendKeys("555231");;
		driver.findElement(houseNo).sendKeys("34R");
		driver.findElement(streetName).sendKeys("MG Road");
		//driver.findElement(delivaryDay).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(deliveryTime).click();
		WebElement id = driver.findElement(idType);
		Select dropdownIdType = new Select(id);
		dropdownIdType.selectByIndex(1);
		driver.findElement(nic).sendKeys("S1467255I");
		//driver.findElement(frontImage).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebElement img = driver.findElement(frontImage);
		//img.sendKeys("/home/abhinav_shingate/Pictures/velotio.png");
		
		//String workingDir = System.getProperty("user.dir");
		//String filepath = workingDir + "//SeleniumWebdriverUploadFile.html";
		//driver.get(filepath);
		
		Thread.sleep(1000);
		driver.findElement(delivaryDay).click();
		driver.findElement(deliveryTime).click();
	   // driver.findElement(frontImage).click();
		WebElement backimg = driver.findElement(backImage);
		WebElement frontimg = driver.findElement(frontImage);
		//driver.findElement(backImage).sendKeys("//home//abhinav_shingate//eclipse-workspace//Circles.life//velotio.png");
		Thread.sleep(1000);
		Actions builder = new Actions(driver);
		Actions series = builder
				.moveToElement(frontimg)
				.click();
				series.perform();
				
				Robot r = new Robot();
		    	r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				Actions builder1 = new Actions(driver);
				Actions series1 = builder1
						.moveToElement(backimg)
						.click();
						series1.perform();
						
						Robot r1 = new Robot();
				    	r1.keyPress(KeyEvent.VK_ENTER);
						r1.keyRelease(KeyEvent.VK_ENTER);
						r1.keyPress(KeyEvent.VK_ENTER);
				        r1.keyRelease(KeyEvent.VK_ENTER);
				        
				 driver.findElement(sceureCheckOut).click();      
	}
	
}
