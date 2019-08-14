package Selenium.test;

import static page.objects.HomePage.inputsLink;
import static page.objects.InputsPage.inputFieldLabel;
import static page.objects.InputsPage.numberInput;
import static Selenium.test.Test1.driver;
import static common.utilities.CommonConstants.INPUT_VALUE;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Test2 {

	@Test(priority = 1)
	public static void commonWebElementCommands() throws InterruptedException {

		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(inputsLink()));

		// WebElement Click
		inputsLink().click();

		// Send Text Into Input Text Field
		numberInput().sendKeys(INPUT_VALUE);

		// Element Clear
		numberInput().clear();

		// Send Text Into Input Text Field
		numberInput().sendKeys("67890");

		// Get Element Text
		System.out.println(inputFieldLabel().getText());

		// Get Element Attribute
		System.out.println(numberInput().getAttribute("type"));

	}

	@AfterSuite
	public static void afterSuite() throws InterruptedException {
		driver.quit();
	}
} 
 
