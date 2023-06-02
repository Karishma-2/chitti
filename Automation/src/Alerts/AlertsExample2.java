package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsExample2 {
	public WebDriver driver;
	
	public  AlertsExample2(WebDriver driver)
	{
		this.driver=driver;
	}
	private void clickonAlertwithOKCancel()
	{
		By clickonAlertwithOKCancelL= By.xpath("//*[text()='Alert with OK & Cancel '] ");
		WebElement clickonAlertwithOKCancel= driver.findElement(clickonAlertwithOKCancelL);
		clickonAlertwithOKCancel.click();
	}
	private  void clickondisplayconformbox_Button()
	{
	By displayalertbox_ButtonL= By.xpath("//*[text()='click the button to display a confirm box '] ");
	WebElement displayalertbox_Button= driver.findElement(displayalertbox_ButtonL);
	displayalertbox_Button.click();
	}
	private Alert shiftcontrolonconformbox()
	{
		Alert alert= driver.switchTo().alert();
	    return alert;
	}

	public void clickonOk(Alert alert)
	{
		alert.accept();
	}
	public void VerifyAlertwithOKCancel(Alert alert,String enterdtext)
	{
		this.clickonAlertwithOKCancel();
		this.clickondisplayconformbox_Button();
		Alert alert1=this.shiftcontrolonconformbox();
		

		this.clickonOk(alert1);
	}
}
