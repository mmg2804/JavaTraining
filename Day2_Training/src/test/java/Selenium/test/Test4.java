package Selenium.test;

import static page.objects.HomePage.formAuthenticationLink;
import static page.objects.LoginPage.loginButton;
import static page.objects.LoginPage.passwordInput;
import static page.objects.LoginPage.successMessage;
import static page.objects.LoginPage.usernameInput;
import static Selenium.test.Test1.driver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test4 {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;

	@Test(priority = 3)
	public static void excelOperations() throws InterruptedException, IOException {

		// Access Required Test Data
		ExcelWBook = new XSSFWorkbook(
				new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx"));
		ExcelWSheet = ExcelWBook.getSheet("sheet1");

		// Save Credentials
		String Username = ExcelWSheet.getRow(0).getCell(1).getStringCellValue();
		String Password = ExcelWSheet.getRow(1).getCell(1).getStringCellValue();

		// Load Home Page URL
		driver.get("ht_tp:/_/the-internet.herokuapp.com");

		// Navigate to Login Page
		formAuthenticationLink().click();

		// Provide Credentials & Login
		usernameInput().sendKeys(Username);
		passwordInput().sendKeys(Password);
		loginButton().click();
	}

	@Test(priority = 4)
	public static void testNGAsserts() {

		// TestNG Soft Assert
		new SoftAssert().assertTrue(successMessage().getText().contains("You logged into a secure area!"));
		System.out.println("Statement printed after Soft Assert");

		// TestNG Hard Assert
		Assert.assertTrue(successMessage().getText().contains("You logged into a secure area!"));
		System.out.println("Statement printed after Hard Assert");

	}

} 
 

