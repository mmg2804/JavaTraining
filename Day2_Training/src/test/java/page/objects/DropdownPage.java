package page.objects;

import static Selenium.test.Test1.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DropdownPage {
	public static WebElement dropDownList() {
		return driver.findElement(By.xpath("//select[@id='dropdown']"));
	}
} 
 
