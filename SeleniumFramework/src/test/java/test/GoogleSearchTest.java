package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//go to google.com
		
		driver.get("https://google.com");
		
		//enter text into textBox
		
//		WebElement m = driver.findElement(By.id("APjFqb"));
//		m.sendKeys("Automation step by step");
		
		//Click on Search button
		
//		driver.findElement(By.name("btnK")).click();
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
//		m.sendKeys(Keys.RETURN);
		
		GoogleSearchPage.textbox_search(driver).sendKeys("abc");
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		//Close browser
		
		try {
			Thread.sleep(5000, 0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		System.out.println("Test Completed Successfully");
	}

}
