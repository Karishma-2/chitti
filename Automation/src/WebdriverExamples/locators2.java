package WebdriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.chromedriver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		By googlelink_L=By.linkText("google");
		List<WebElement> googleLink = driver.findElements(googlelink_L);
		googleLink.clear();
		
	}

}
