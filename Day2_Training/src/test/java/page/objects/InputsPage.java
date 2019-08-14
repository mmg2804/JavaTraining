 package page.objects;

import static Selenium.test.Test1.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputsPage {
	
	public static WebElement numberInput() {
		return driver.findElement(By.xpath("//div[@class='example']//input"));
	}
	
	public static WebElement inputFieldLabel() {
		return driver.findElement(By.xpath("//*[contains(text(),'Number')]"));
	}

} 
 
