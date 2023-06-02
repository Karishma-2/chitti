package WebdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\velpu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
       String applicationurladdress="https://mail.google.com//";
       driver.get(applicationurladdress);
      String applicationurladdress1="https://www.google.com//maps";
      driver.get(applicationurladdress1);
       String applicationurladdress2="https://drive.google.com/drive/my-drive";
       driver.get(applicationurladdress2);
       driver.close();

	}

}
