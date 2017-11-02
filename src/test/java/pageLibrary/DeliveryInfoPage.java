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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


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
	By deliveryTime = By.cssSelector(".row .delivery-slots-time:nth-child(1)");
	//By deliveryTime = By.xpath("html/body/div[3]/div/div/div[1]/div/div/div[2]/span/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/div/div[1]/div/span/span[3]");
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
	
	public void uploadFrontAndBackImage() throws InterruptedException, AWTException {
		WebElement backimg = driver.findElement(backImage);
		WebElement frontimg = driver.findElement(frontImage);
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		Actions series = builder
				.moveToElement(frontimg)
				.click();
		        series.perform();
		Thread.sleep(5000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);
	    r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
								
		Actions builder1 = new Actions(driver);
		Actions series1 = builder1
						.moveToElement(backimg)
						.click();
						series1.perform();
	    Thread.sleep(5000);	
						
						
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
							        
	    Thread.sleep(5000);
		
	}
	
public void readDeliveryExcel(String filePath, String fileName, String sheetName) throws IOException{
		
		File file = new File(filePath+"//"+fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook readWorkbook = null;
		
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		
		if(fileExtensionName.equals(".xlsx")){

		     readWorkbook = new XSSFWorkbook(inputStream);

		    }
		
		else if(fileExtensionName.equals(".xls")){

	         readWorkbook = new HSSFWorkbook(inputStream);
	    }
		
		Sheet readSheet = readWorkbook.getSheet(sheetName);
		
			
		String fullName1 = readSheet.getRow(1).getCell(0).getStringCellValue();
		Double contactNumber1 = readSheet.getRow(1).getCell(1).getNumericCellValue();
		Double postalCode1 = readSheet.getRow(1).getCell(2).getNumericCellValue();
		String houseNo1 = readSheet.getRow(1).getCell(3).getStringCellValue();
		String streetName1 = readSheet.getRow(1).getCell(4).getStringCellValue();
		String nirc1 = readSheet.getRow(1).getCell(5).getStringCellValue();
		driver.findElement(fullName).sendKeys(fullName1);
		driver.findElement(contactNmber).sendKeys(contactNumber1.toString());
		selectDob();
		driver.findElement(postalCode).sendKeys(postalCode1.toString());
		driver.findElement(houseNo).sendKeys(houseNo1);
		driver.findElement(streetName).sendKeys(streetName1);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement id = driver.findElement(idType);
		Select dropdownIdType = new Select(id);
		dropdownIdType.selectByIndex(1);
		driver.findElement(nic).sendKeys(nirc1);
		
		//driver.findElement(emailAddress).sendKeys(userName);
		//driver.findElement(password).sendKeys(password1);
		
				
	}
	
	public void enterDeliveryInfo() throws InterruptedException, AWTException, IOException {
		String filePath = System.getProperty("user.dir")+"//src//test//resources";
		readDeliveryExcel(filePath, "ReadExcel.xlsx", "DeliverySheet");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(delivaryDay).click();
		Thread.sleep(3000);
		driver.findElement(deliveryTime).click();
	    uploadFrontAndBackImage();
				 
	    driver.findElement(sceureCheckOut).click();    
	}
	
}
