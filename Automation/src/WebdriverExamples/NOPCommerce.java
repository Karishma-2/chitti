package WebdriverExamples;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NOPCommerce
{
 public WebDriver driver;
 
 public NOPCommerce(WebDriver driver)
 {
	 this.driver=driver;
 }

 public void getEmailTextBox()
{
	By emailTextBoxL=By.xpath("//input[@type='text']");
	//System.out.println(emailTextBoxL);
	WebElement emailTextBox=driver.findElement(emailTextBoxL);
	//Actions action = new Actions(driver);
	emailTextBox.sendKeys("admin@gmail.com");
	//return emailTextBox;
}
private void getpasswordTextBox()
{
	By passwordTextBoxL=By.id("Password");
	WebElement passwordTextBox=driver.findElement(passwordTextBoxL);
	passwordTextBox.sendKeys("admin");
	
}

private void clickonloginBtn()	
{
	By loginBtnL=By.xpath("//input[@value='Log in']");
	WebElement loginBtn=driver.findElement(loginBtnL);
	 loginBtn.click();
}
public String getErrorMsg()
{
	By ErrorMsgL=By.xpath("//*[text()='Login was unsuccessful. Please correct the errors and try again.']");
	WebElement ErrorMsg=driver.findElement(ErrorMsgL);
	return ErrorMsg.getText();
}

public void verifyLoginButtonFunctionalityBykeepingEmail_Password() throws Exception
{
	Thread.sleep(3000);
	this.getEmailTextBox();
	this.getpasswordTextBox();
	this.clickonloginBtn();
	Thread.sleep(3000);
}


}









