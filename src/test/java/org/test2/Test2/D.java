package org.test2.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

public class D {
	
	
	@Test(dataProvider="value")
	private void tc1(String username,String pass) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\Test2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement element1 = driver.findElement(By.id("email"));
		element1.sendKeys(username);
		WebElement element2 = driver.findElement(By.name("pass"));
		element2.sendKeys(pass);
		}
	@DataProvider(name="value")
	private Object[][] getData() {
		return new Object[][] {{"hi","a"},{"cc","b"}};
		

	}

			

	
		

	}


