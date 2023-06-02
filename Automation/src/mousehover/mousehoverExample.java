package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoverExample {

	public static void main(String[] args) {
		String Applicationurl="https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get(Applicationurl);
        
        
        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.click();
        searchbox.sendKeys("Gift Cards");
        
        
        WebElement Fashion=driver.findElement(By.xpath("//a[text()='Fashion']"));
        
        Actions action=new Actions(driver);
  	    action.click(Fashion).build().perform();
  	   
       
        
        
    
        
        
	}

}
