package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeandDate {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\velpu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");

		// /html/body/div[5]/section[1]/div/section/div[1]
		WebElement table = driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]"));
		System.out.print(table);

		for (int i = 1; i <= 36; i++) {
			WebElement data = driver.findElement(
					By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[" + i + "]/td[1]/a"));
			String outputdata = data.getText();
			System.out.println(outputdata);

		}
	}

}
