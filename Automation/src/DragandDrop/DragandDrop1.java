package DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement webpageframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(webpageframe);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		WebElement drop=driver.findElement(By.id("droppable"));
	
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
	 WebElement  resizable=driver.findElement(By.linkText("Resizable"));
	 resizable.click();
		
		
		//WebElement resizable=driver.findElement(By.linkText(""));
		//resizable.click();
		
		
		
		
		
		

	}

}
