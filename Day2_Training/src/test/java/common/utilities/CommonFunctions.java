package common.utilities;

import static Selenium.test.Test1.driver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class CommonFunctions {

	public static WebElement waitForElementToBeClickable(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(600, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);

		// Wait For Element
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
} 
 

