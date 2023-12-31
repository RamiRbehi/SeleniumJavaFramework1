package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Demo.Log4jDemo;
import config.PropertiesFile;


public class test1_GoogleSearch_TestNG {
	
	WebDriver driver = null;
	public static String browserName = null;
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");	
			driver = new  FirefoxDriver();
		}
		
		logger.info("Browser started");
	}
	
	@Test
	public void googleSearch() {
		//go to google.com
		
		driver.get("https://google.com");
		logger.info("Navigated to google.com");
		
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
		PropertiesFile.setProperties();
	}

}
