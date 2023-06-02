package WebdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		String applicationaddress="https://www.google.com";
		driver.get(applicationaddress);
		driver.manage().window().maximize();
		By googlesearchbox_L=By.name("q");
		WebElement googlesearchbox = driver.findElement(googlesearchbox_L);
		googlesearchbox.sendKeys("selenium");
     WebElement gmail_L=  driver.findElement(By.linkText("Gmail"));
    gmail_L.click();
		driver.navigate().back();		
		WebElement images_L= driver.findElement(By.linkText("Images"));
		 images_L.click();
	}
}