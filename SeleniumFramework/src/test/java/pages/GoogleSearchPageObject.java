package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	
	WebDriver driver = null;
	
	By textBox_search  = By.id("APjFqb");
	
	By buttoon_search = By.name("btnK");
	
	public GoogleSearchPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textBox_search).sendKeys(text);
	}
	
	public void  clickSearchButton() {
		driver.findElement(buttoon_search).sendKeys(Keys.RETURN);
	}

}
