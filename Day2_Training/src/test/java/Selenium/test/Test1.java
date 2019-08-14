package Selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 extends Base {
	public static WebDriver driver;

    @Test(priority = 0 ,groups= {"Smoke"})
    public static void browserCommands() throws InterruptedException {

                    WebDriverManager.chromedriver().setup();

                    // Create a new instance of the browser driver
                    driver = new ChromeDriver();

                    // Launch URL
                    driver.get("http://the-internet.herokuapp.com");

                    // Maximize Window
                    driver.manage().window().maximize();

                    // Implicit Wait
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

                    // Print Page Source Length
                    System.out.println("Page Source: " + driver.getPageSource().length());

                    // Print Page Title
                    System.out.println("Page Title: " + driver.getTitle());

                    // Print Page URL
                    System.out.println("Page URL: " + driver.getCurrentUrl());

                    // Refresh Browser
                    driver.navigate().refresh();

                    // Wait for 5 Seconds
                    Thread.sleep(5000);

    }


}
