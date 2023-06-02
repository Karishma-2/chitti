
package WebdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonMethods {
	
public static WebDriver driver;

public static WebDriver launchBrowser(String Browsername,String drivename,String drivepath)
{
	System.setProperty(drivename, drivepath);
	if(Browsername.equals("chrome"))
	 driver=new ChromeDriver();
	return driver;

}

public static void openurl(String url) {
	driver.get(url);
}
public static void closeBrowser()
{
	driver.close();
}
}
