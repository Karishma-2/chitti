package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		WebElement SearchBox=driver.findElement(By.name("q"));
		SearchBox.sendKeys("selenium");
		
		Actions action = new Actions(driver);
		
		for(int i=0; i<=5;i--)
		{
			Thread.sleep(3000);
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			
		}
		action.sendKeys(Keys.ENTER).build().perform();
		

		
	   
	}
}
