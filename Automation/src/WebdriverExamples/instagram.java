package WebdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
		String applicationurladdress="https://www.google.com/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationurladdress);
		WebElement instagram=driver.findElement(By.xpath("//a[text()='Sign in']"));
		instagram.click();
	}

}
