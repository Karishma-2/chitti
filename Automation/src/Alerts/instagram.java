package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("chitti0937");
		
		
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Karishma@2001");
		
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.xpath("//div[text()='Log in']"));
		login.click();
		
		Thread.sleep(3000);
		WebElement Homepage=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div[1]/div"));
		Homepage.click();
}
}




