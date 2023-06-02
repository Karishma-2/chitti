package com.orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRMTest {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./DriversFiles/chromedriver.exe");
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
		orangeHRM obj=new orangeHRM(driver);
		obj.clickonusername();
		obj.clickonpassword();
		obj.clickonloginbutton();
		
	}

}
