package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1_GoogleSearch {
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//go to google.com
		
		driver.get("https://google.com");
		
		//enter text into textBox
		
		WebElement m = driver.findElement(By.id("APjFqb"));
		m.sendKeys("Automation step by step");
		
		//Click on Search button
		
//		driver.findElement(By.name("btnK")).click();
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		m.sendKeys(Keys.RETURN);
		
		//Close browser
		
		driver.close();
		
		System.out.println("Test Completed Successfully");
	}

}
