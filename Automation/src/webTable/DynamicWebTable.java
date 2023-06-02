package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.timeanddate.com/worldclock/");
	
	
	WebElement WebTableBlock=driver.findElement(By.className("tb-scroll"));
	
	List<WebElement>WebTableRows=WebTableBlock.findElements(By.tagName("tr"));
	int TotalRows_count=WebTableRows.size();
	
	for(int i=0;i<TotalRows_count;i++) {
		
		List<WebElement>WebTableCells=WebTableRows.get(i).findElements(By.tagName("td"));
		int TotalCells_count=WebTableCells.size();
		
		for(int j=0;j<TotalCells_count;j++) {
			String WebTableData=WebTableCells.get(j).getText();
			System.out.print(WebTableData+" ");
			
		}
		System.out.println();
		
		
	}
	
	
	
	
}
}
