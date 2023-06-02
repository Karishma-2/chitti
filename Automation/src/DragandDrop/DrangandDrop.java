package DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrangandDrop {
public WebDriver driver;
	public void lanchBrowser()
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	}
	public void openUrl(String url)
	{
	driver.navigate().to(url);
	}
	public WebElement  getElement(String element)
	{
	By locater = By.xpath("//*[text()='"+element+"']");  // =====================> Dynamic Xpath;
	return driver.findElement(locater);
	
}
	public void clickOndragdrop(String locater)
	{
		this.getElement(locater).click();
	}
	public WebElement dragLocater(String locater)
	{
		return this.getElement(locater);
		
	}
	
	public WebElement dropLocater(String locater)
	{
		return this.getElement(locater);
	}
	
	public void dragAnddrop(String source , String Target)
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(this.dragLocater(source), this.dropLocater(Target)).build().perform();
		
	
}
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	public void switchtoframe()
	{
		driver.switchTo().frame(0);
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	

		
	
}