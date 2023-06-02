package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import WebdriverExamples.CommonMethods;

public class AlertsExample2Test {

	private static  Alert alert;
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		
		driver=CommonMethods.launchBrowser("chrome","webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		CommonMethods.openurl("https://demo.automationtesting.in/Alerts.html");
		
		AlertsExample2 obj = new AlertsExample2(driver);
       obj.VerifyAlertwithOKCancel(alert, "I am student");
	}

}
