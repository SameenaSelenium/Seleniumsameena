package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {

	public static void main(String[] args) 
	{
		//String expTitle="Gmail";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.className("gb_P")).click();
		driver.findElement(By.linkText("Gmail")).click();
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());*/
		/*String actTitle=driver.getTitle();
		if (expTitle.equals(actTitle)) 
		{
		System.out.println("Pass");	
		}else
		{
			System.out.println("Fail");
		}*/
		if (driver.findElement(By.id("next")).isDisplayed()) 
		{
			System.out.println("pass");
		}else
		{
			System.out.println("Fail");
		}
		
	}

}
