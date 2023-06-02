
package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AlertsExamples{
	
	public WebDriver driver;
	
	public AlertsExamples(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickonAlertWithTextBox()
	{
		By AlertwithtextboxL= By.xpath("//a[text()='Alert with Textbox ']");
		WebElement Alertwithtextbox= driver.findElement(AlertwithtextboxL);
		Alertwithtextbox.click();
	}
	
	public void clickondemonstratepromptbox_Button()
	{
		By demonstratepromptbox_ButtonL= By.xpath("//*[text()='click the button to demonstrate the prompt box ']");
		WebElement demonstratepromptbox_Button= driver.findElement(demonstratepromptbox_ButtonL);
		demonstratepromptbox_Button.click();
	}
	
	public Alert shiftcontrolonAlertbox()
	{
		Alert alert= driver.switchTo().alert();
		//String alertMsg =alert.getText();
		//System.out.println(alertMsg);
		//alert.sendKeys("I am LivetechStudent");
		//alert.accept();
		
		return alert;
	}
	
	public void entertextonAlertBox(Alert alert, String sendmsg)
	{
		String alertMsg =alert.getText();
		System.out.println(alertMsg);
		alert.sendKeys(sendmsg);
	}
	
	public void clickonOk(Alert alert)
	{
		alert.accept();
	}
	

	public void VerifyAlertWithTextBox(Alert alert,String enterdtext)
	{
		this.clickonAlertWithTextBox();
		this.clickondemonstratepromptbox_Button();
	    alert=this.shiftcontrolonAlertbox();
		this.entertextonAlertBox(alert,enterdtext);
		this.clickonOk(alert);
	}
}
