package automatuon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenUrl {
public WebDriver driver;
	@Test
	@BeforeTest
	
		
		
		public void add()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\velpu\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		}
		@AfterTest
		public void close()
		
		{
			driver.close();
		}
		
		@Test
		public void search()
		
		{
			By seachl=By.xpath("//input[@type=\"text\"]");
			
			WebElement seachboxl=driver.findElement(seachl);
			seachboxl.sendKeys("one plus Mobiles");
			seachboxl.click();
			
		}
		
	}




