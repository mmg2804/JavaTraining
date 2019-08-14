package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Selenium.test.Test1.driver;

public class HomePage {

	public static WebElement inputsLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Inputs')]"));
	}

	public static WebElement dropDownLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]"));
	}

	public static WebElement formAuthenticationLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]"));
	}

	public static WebElement multipleWindowsLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]"));
	}
} 
 

