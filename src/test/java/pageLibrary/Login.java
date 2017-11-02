package pageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Login {

	WebDriver driver;
	
	By emailAddress = By.name("email");
	By password = By.name("password");
	By signIn = By.xpath(".//*[@id='st-container']/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div[3]/form/div[4]/div/div/button");
	By companyLogo = By.xpath(".//*[@id='st-container']/div/div/div[1]/div/div/div[1]/a/img");
	
	public void readExcel(String filePath, String fileName, String sheetName) throws IOException{
		
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
		
		//int rowCount = readSheet.getLastRowNum()-readSheet.getFirstRowNum();
		
		String userName = readSheet.getRow(1).getCell(0).getStringCellValue();
		String password1 = readSheet.getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(emailAddress).sendKeys(userName);
		driver.findElement(password).sendKeys(password1);
		
		/*for(int i=0; i<rowCount+1; i++) {//System.out.println(System.getProperty("user.dir"));
			
			Row row = readSheet.getRow(i);
			
			for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
			}
			System.out.println();
		}*/
		
		
	}
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterEmailAddress() throws IOException {
		String filePath = System.getProperty("user.dir")+"//src//test//resources";
		readExcel(filePath, "ReadExcel.xlsx", "LoginSheet");
			
	}
    
	public void enterPassword() {
		//driver.findElement(password).sendKeys("arsenal2422232");
	}
	
	public void clickOnSignIn() {
		driver.findElement(signIn).click();
	}
	
	public void logoPresent() {
		driver.findElement(companyLogo);
	}
}
