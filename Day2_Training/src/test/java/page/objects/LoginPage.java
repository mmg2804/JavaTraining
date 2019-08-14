package page.objects;

import static Selenium.test.Test1.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebElement usernameInput() {
		return driver.findElement(By.xpath("//input[@id='username']"));
	}
	
	public static WebElement passwordInput() {
		return driver.findElement(By.xpath("//input[@id='password']"));
	}
	
	public static WebElement loginButton() {
		return driver.findElement(By.xpath("//button[contains(@type, 'submit')]/i"));
	}
	
	public static WebElement successMessage() {
		return driver.findElement(By.xpath("//div[@class='flash success']"));
	}

} 
 
