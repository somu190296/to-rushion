package org.test2.Test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadrivrn {
	WebDriver driver;
	Cell cell;
	Cell cell1;
	
			
		
		
	
	@Test(dataProvider="value")
	private void tco() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\New folder\\first-Time-Login\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		
		driver.get("https://www.facebook.com/");
		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Test2\\excel\\junitandbasicclassand.xls");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		Cell cell1 = row.getCell(1);
		
		
		
		WebElement element1 = driver.findElement(By.id("email"));
		element1.sendKeys(cell1);
		
		
		
	
	}	
			

			
		
			
		
		
		
		
		
		
	}

