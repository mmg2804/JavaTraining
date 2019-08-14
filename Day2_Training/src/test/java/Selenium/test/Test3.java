package Selenium.test;

import static page.objects.DropdownPage.dropDownList;
import static page.objects.HomePage.dropDownLink;
import static Selenium.test.Test1.driver;
import static common.utilities.CommonFunctions.waitForElementToBeClickable;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class Test3 {

	@Test(priority = 2)
	public static void selectOperations() throws InterruptedException {

		// Navigate Back On Browser
		driver.navigate().back();

		// Initialize Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(600, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);

		// Wait For Element
		wait.until(ExpectedConditions.elementToBeClickable(dropDownLink()));

		// Click Drop-down Page Link
		dropDownLink().click();

		// Create Object Of Select Class
		Select selectObj = new Select(dropDownList()); 
		
		// Select Drop-down Value By Text
				selectObj.selectByVisibleText("Option 2");

				// Select Drop-down Value By Index
				selectObj.selectByIndex(1);

				// Print All Options
				for (WebElement dropDownItem : selectObj.getOptions()) {
					System.out.println(dropDownItem.getText());
				}
			}
		} 
		 

 
