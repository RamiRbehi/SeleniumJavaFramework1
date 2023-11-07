//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//public class DesiredCapabilities_Demo {
//
//	public static void main(String[] args) {
//		String projectPath = System.getProperty("user.dir");
//		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("ignoreProtectedModeSettings", true);
//		
//		System.out.println("projectPath : "+projectPath);
//
//		System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver(caps);
//		
//		driver.get("https://google.com");
//		WebElement m = driver.findElement(By.name("q"));
//		m.sendKeys("ABC");
//		m.sendKeys(Keys.RETURN);
//		driver.close();
//		
//		
//		
//	}
//
//}
