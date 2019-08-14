package Selenium.test;

import org.testng.annotations.AfterSuite;
import static Selenium.test.Test1.driver;

public class Base {

	public static void main(String[] args) {
	}

	@AfterSuite(alwaysRun = true)
	public static void afterSuite() {
		driver.quit();
	}

} 
 
