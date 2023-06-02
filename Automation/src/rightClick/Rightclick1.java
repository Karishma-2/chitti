package rightClick;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	By FirstnameL=By.id("firstName");
	WebElement Firstname=driver.findElement(FirstnameL);
	Firstname.sendKeys("Karishma");
	
	
	/*Actions action=new Actions(driver);
	action.sendKeys(Keys.TAB).build().perform();
	action.sendKeys("hello001").build().perform();*/
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
