package WebdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.chromedriver","C:\\Users\\velpu\\OneDrive\\Desktop\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String CurrentTitlepage=driver.getTitle();
		System.out.println(CurrentTitlepage);
		String getCurrentUrl=driver.getCurrentUrl();
		System.out.println(getCurrentUrl);
	}
     

}
