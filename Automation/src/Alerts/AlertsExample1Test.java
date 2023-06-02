package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import WebdriverExamples.CommonMethods;

public class AlertsExample1Test {
	public static  Alert alert;
	public static WebDriver driver;
   public static void main(String[] args) throws Exception {
		driver=CommonMethods.launchBrowser("chrome", "webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe\\");
		CommonMethods.openurl("https://demo.automationtesting.in/Alerts.html");
		
		AlertsExample1 obj = new AlertsExample1(driver);
      obj.VerifyAlertWithOk(alert,alert);
      
   }
   
}


