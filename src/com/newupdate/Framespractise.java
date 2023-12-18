package com.newupdate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Framespractise extends BaseClass
{

	public static void main(String[] args) throws InterruptedException
	{
		openbrowser();
		//driver.get("");
		Thread.sleep(2000);
		//Switching to another ftame using index
		//driver.switchTo().frame(1);
		
		//Switching to another frame using name or id of a frame
		//driver.switchTo().frame("iframeResult");
		
		WebElement x=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		//Switch to another frame using Xpath of the ftrame
		driver.switchTo().frame(x);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		
		
		
		closebrowser();
		

	}

}
