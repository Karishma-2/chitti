package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws Exception {
		String Application = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\velpu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Application);

		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("karishma");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Chitti$12");

		WebElement Button = driver.findElement(By.id("btnLogin"));
		Button.click();

		WebElement PIM = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));

		Actions action = new Actions(driver);
		action.moveToElement(PIM).build().perform();
		// PIM.click();

		Thread.sleep(3000);

		WebElement Addemployee = driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']"));
		Addemployee.click();

		WebElement Reports = driver.findElement(By.id("menu_core_viewDefinedPredefinedReports"));
		Reports.click();

	}
}