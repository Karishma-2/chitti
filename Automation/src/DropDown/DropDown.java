package DropDown;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
 public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.osmania.ac.in/");
	
	//"gtranslate_selector"
	Thread.sleep(2000);
	WebElement dropdownbutton=driver.findElement(By.id("gtranslate_selector"));
	Thread.sleep(2000);
   List<WebElement>dropdownfeatures=dropdownbutton.findElements(By.tagName("option"));
   
 // System.out.println(dropdownfeatures.size());
	//for(int i=0;i<dropdownfeatures.size();i++)
	//{
	//String data=dropdownfeatures.get(i).getText();
		//System.out.println(data);
	//}
	
	Select select=new Select(dropdownbutton);
	
	int length=dropdownfeatures.size();
	for(int i=0;i<length;i++)
	{
		String optionName=dropdownfeatures.get(i).getText();
		select.selectByIndex(i);
		
		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot,new File(".//ScreenShots"+optionName+".png"));
	}
	driver.close();
	
	
}
}
