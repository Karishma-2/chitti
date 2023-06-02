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

public class DropDown1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\velpu\\OneDrive\\Desktop\\Karishma\\OrangeHRM\\driverfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

		
	WebElement amazonsearchbox=driver.findElement(By.id("searchDropdownBox"));
	
	
	List<WebElement>alloptions=amazonsearchbox.findElements(By.tagName("option"));
	
	/*System.out.println(alloptions.size());
	for(int i=0;i<alloptions.size();i++)
	{
	String data=alloptions.get(i).getText();
		System.out.println(data);
	}*/
Select select=new Select(amazonsearchbox);
	
	int length=alloptions.size();
	for(int i=0;i<length;i++)
	{
		String optionName=alloptions.get(i).getText();
		select.selectByIndex(i);
		
		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot,new File(".//screeshots"+optionName+".png"));
	}
	driver.close();

	
		 
	}

}
