package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	    
	public static void test() throws Exception {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "\\drivers\\chromedriver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://qu.ax/");
		
		driver.findElement(By.id("upload-btn")).click();
		
		Runtime.getRuntime().exec("E:\\FileUploadScript.exe");
		
		Thread.sleep(8000);
		driver.close();
	}

}
