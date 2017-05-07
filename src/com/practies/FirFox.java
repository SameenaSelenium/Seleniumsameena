package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirFox {

	public static void main(String[] args)
	{
		
           FirefoxDriver driver=new FirefoxDriver();
           driver.get("Http://gmail.com");
           driver.findElement(By.id("Email")).sendKeys("vasu.vypu");
           driver.findElement(By.id("next")).click();
           
	}

}
