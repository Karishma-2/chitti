package rightClick;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\velpu\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");

		List<WebElement> menuElements = new ArrayList<WebElement>();
		
		By mobile = By.xpath("//a[text()='Mobiles']");
		WebElement element = driver.findElement(mobile);
		menuElements.add(element);

		Actions action = new Actions(driver);
		//action.contextClick(element).build().perform();

		By Electronics = By.xpath("//a[text()=' Electronics ']");
		WebElement element1 = driver.findElement(Electronics);
		menuElements.add(element1);

		Actions action1 = new Actions(driver);
		//action.contextClick(element1).build().perform();
		
		Robot robo = new Robot();
		for (int i = 0; i <2; i++) {
			
			action.contextClick(menuElements.get(i)).build().perform();
			
			robo.keyRelease(KeyEvent.VK_DOWN);
			robo.keyPress(KeyEvent.VK_DOWN);

			robo.keyRelease(KeyEvent.VK_ENTER);
			robo.keyPress(KeyEvent.VK_ENTER);
		}
	}

}




