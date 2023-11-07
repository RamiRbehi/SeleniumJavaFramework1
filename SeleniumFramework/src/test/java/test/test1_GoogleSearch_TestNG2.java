package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class test1_GoogleSearch_TestNG2 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch2() {
		//go to google.com
		
		driver.get("https://google.com");
		
		//enter text into textBox
		
		WebElement m = driver.findElement(By.id("APjFqb"));
		m.sendKeys("Automation step by step");
		
		//Click on Search button
		
//		driver.findElement(By.name("btnK")).click();
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		m.sendKeys(Keys.RETURN);
	}
	
	@Test
	public void googleSearch3() {
		//go to google.com
		
		driver.get("https://google.com");
		
		//enter text into textBox
		
		WebElement m = driver.findElement(By.id("APjFqb"));
		m.sendKeys("Automation step by step");
		
		//Click on Search button
		
//		driver.findElement(By.name("btnK")).click();
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		m.sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public void tearDownTest() {
		//Close browser
//		driver.quit();
		driver.close();
		System.out.println("Test Completed Successfully");
	}

}
