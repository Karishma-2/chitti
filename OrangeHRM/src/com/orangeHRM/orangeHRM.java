package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class orangeHRM {
public WebDriver driver;
	
	public  orangeHRM(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickonusername()
	{
		By username_L=By.xpath("//input[@id='txtUsername']");
		WebElement username=driver.findElement(username_L);
		username.sendKeys("karishma");
	}
	public void clickonpassword()
	{
		By password_L=By.id("txtPassword");
		WebElement password=driver.findElement(password_L);
		password.sendKeys("Chitti$12");
	}
	public void clickonloginbutton()
	{
		By loginbutton_L=By.id("btnLogin") ;
		WebElement button=driver.findElement(loginbutton_L);
		button.click();
		
	}
	
	}

