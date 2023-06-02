package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import WebdriverExamples.CommonMethods;

public class AlertsExamplesTest {
	
	private static  Alert alert;
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		
		driver=CommonMethods.launchBrowser("chrome", "webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		CommonMethods.openurl("https://demo.automationtesting.in/Alerts.html");
		
		AlertsExamples obj = new AlertsExamples(driver);
		//private
		obj.VerifyAlertWithTextBox( alert, "I am Student" );
		//obj.clickonAlertWithTextBox();  //public
		//Thread.sleep(3000);
		//obj.clickondemonstratepromptbox_Button();
		//Thread.sleep(3000);
		//obj.shiftcontrolonAlertbox();
		
		//obj.entertextonAlertBox(alert);
		//Thread.sleep(3000);
		//obj.clickonOk(alert);
		//Thread.sleep(3000);
		//CommonMethods.closeBrowser();

	}

}

