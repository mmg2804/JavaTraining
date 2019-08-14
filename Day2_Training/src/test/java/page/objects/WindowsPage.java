package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowsPage {

	@FindBy(xpath = "//a[contains(text(),'Click Here')]")
	public WebElement clickHereLink;

	@FindBy(xpath = "//h3[contains(text(),'New Window')]")
	public WebElement newWindowText;

	public WindowsPage(WebDriver driver) {

		// This initElements constructor will create all WebElements
		PageFactory.initElements(driver, this);
	}

} 
 
