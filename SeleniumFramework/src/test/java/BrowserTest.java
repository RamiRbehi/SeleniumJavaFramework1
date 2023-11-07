import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
//		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");	
//		WebDriver driver = new  FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation step by step");
		
		List<WebElement> listOfTextaraElements = driver.findElements(By.xpath("//textarea"));
		
		int count = listOfTextaraElements.size();
		
		System.out.println("count of textarea elements " +count);
		
//		WebElement textBox  = driver.findElement(By.id("APjFqb"));
//		
//		textBox.sendKeys("Automation step by step");
		
		try {
			Thread.sleep(4000, 0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
//		driver.quit();
	}

}
