 package demo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaiDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void  test() throws Exception {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		WebElement m = driver.findElement(By.name("q"));
		m.sendKeys("abcd");
		m.sendKeys(Keys.RETURN);
		
//		driver.findElement(By.linkText("ABCD: Any Body Can Dance")).click();
		
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(5))
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       WebElement linkElement = driver.findElement(By.xpath("//*[@id=\"arc-srp_120\"]/div/div[12]/div/div/div[1]/div/div/span/a"));
		       
		       if(linkElement.isEnabled()) {
		    	   System.out.println("Element found");
		       }
		       return linkElement;
		     }
		   });
		
		   element.click();
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
