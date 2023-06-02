package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRMExample {

	public static void main(String[] args) {
		String Application = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\velpu\\OneDrive\\Desktop\\Karishma\\OrangeHRM\\driverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Application);

		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("karishma");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Chitti$12");

		WebElement Button = driver.findElement(By.id("btnLogin"));
		Button.click();
	}
}
//http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login
//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login