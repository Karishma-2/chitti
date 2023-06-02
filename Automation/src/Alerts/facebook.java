package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	
	 WebElement emailbox=driver.findElement(By.id("email"));
	 emailbox.sendKeys("krishnadattha");
	 
	 WebElement password=driver.findElement(By.id("pass"));
	 password.sendKeys("Sujatha@123");
	 
	 
	 WebElement loginbutton=driver.findElement(By.xpath("//button[text()='Log in']"));
	 loginbutton.click();
	 
}
}

