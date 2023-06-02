package WebdriverExamples;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NOPCommerceTest {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver = CommonMethods.launchBrowser("chrome", "webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe\\");
		CommonMethods.openurl("https://www.nopcommerce.com/en/login");
		driver.manage().window().maximize();
		
		NOPCommerce obj = new NOPCommerce(driver);
		obj.verifyLoginButtonFunctionalityBykeepingEmail_Password();
		
		String actualErrorMsg = obj.getErrorMsg();
		System.out.println(actualErrorMsg);
		
		Assert.assertTrue(actualErrorMsg.contains("Login was unsuccessful. Please correct the errors and try again."), "Test Script Failed As Error Msg Not Displayed");
		CommonMethods.closeBrowser();
	}

}
