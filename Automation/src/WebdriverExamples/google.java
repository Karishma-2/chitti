package WebdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	public static void main(String[] args) {
		String applicationurladdress="https://www.google.com/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(applicationurladdress);
		//WebElement signin=driver.findElement(By.id("Sign in"));
			//sign.sendKeys("");
		WebElement email=driver.findElement(By.xpath("//a[text()='Sign in']"));
		email.click();
		//WebElement email=driver.findElement(By.linkText(""));
		//email.click();
		WebElement EmailIdTxtBox=driver.findElement(By.xpath("//input[@id='identifierId']"));
		EmailIdTxtBox.sendKeys("karishma@gmail.com");
}}
