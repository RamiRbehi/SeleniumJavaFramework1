package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
	
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "this is a test to validate google search functionality");
	
        String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting test case");
		
		driver.get("https://google.com");
		
		test1.pass("Navigated to google.com");
		
		WebElement m = driver.findElement(By.name("q"));
		m.sendKeys("abc");
		
		test1.pass("Enetered text in searchBox");
		
		m.sendKeys(Keys.RETURN);
		
		test1.pass("Pressed keyboard enter key");
		
		driver.close();	
		
		test1.pass("Closed the browser");
		
		test1.info("test completed");
		
		
		
		
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google Search Test Two", "this is a test to validate google search functionality");
		
        System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
        
		test2.log(Status.INFO, "Starting test case");
		
		driver.get("https://google.com");
		
		test2.pass("Navigated to google.com");
		
		WebElement m2 = driver.findElement(By.name("q"));
		m2.sendKeys("abc");
		
		test2.pass("Enetered text in searchBox");
		
		m2.sendKeys(Keys.RETURN);
		
		test2.fail("Pressed keyboard enter key");
		
		driver.close();	
		
		test2.pass("Closed the browser");
		
		test2.info("test completed");
		
		// calling flush writes everything to the log file
        extent.flush();
	}

}
