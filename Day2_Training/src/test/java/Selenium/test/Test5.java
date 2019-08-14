package Selenium.test;

import static page.objects.HomePage.multipleWindowsLink;
import static Selenium.test.Test1.driver;

import java.io.IOException;

import org.testng.annotations.Test;

import page.objects.WindowsPage;

public class Test5 {

	WindowsPage windowsPage;

	@Test(priority = 5)
	public void windowSwitchOperations() throws InterruptedException, IOException {

		windowsPage = new WindowsPage(driver);

		// Load Home Page URL
		driver.get("___http:_//the-internet.herokuapp.com");

		// Open New Window Page
		multipleWindowsLink().click();
		windowsPage.clickHereLink.click();

		// Save Current Window Handle
		String firstWinHandle = driver.getWindowHandle();

		// Loop Through All Handles & Switch
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(firstWinHandle)) {
				driver.switchTo().window(handle);
				System.out.println("Text Present In New Window: " + windowsPage.newWindowText.getText());

				// Close Current Window
				driver.close();

			}
		}

		// Switch To Original Window
		driver.switchTo().window(firstWinHandle);
	}
} 
 
