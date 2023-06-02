package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsExample1 {

	public WebDriver driver;
	
	public  AlertsExample1(WebDriver driver)
	{
		this.driver=driver;
	}
	private void clickonAlertWithOk()
	{
		By AlertWithOkL= By.xpath("//*[text()='Alert with OK ']");
		WebElement AlertWithOk= driver.findElement(AlertWithOkL);
		AlertWithOk.click();
	}
	
	private  void clickondisplayalertbox_Button()
	{
	By displayalertbox_ButtonL= By.xpath("//button[@class='btn btn-danger']");
	WebElement displayalertbox_Button= driver.findElement(displayalertbox_ButtonL);
	displayalertbox_Button.click();
	}
	private Alert shiftcontrolonAlertWithOk()
	{
		Alert alert= driver.switchTo().alert();
	    return alert;
	}
	private void clickonOk(Alert alert)
	{
		alert.accept();
	}
	public void VerifyAlertWithOk(Alert alert, Alert alert2)
	{
		this.clickonAlertWithOk();
		this.clickondisplayalertbox_Button();
		this.shiftcontrolonAlertWithOk();
		this.clickonOk(alert2);
}
	
	
	}

