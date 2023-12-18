package com.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupsHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//system .set Property("Webdriver.chrome.driver",".//utilities//chromedriver.exe");
		//ChromeDriver driver =new ChromeDriver();
		System.setProperty("Webdriver.gecko.driver",".//utilities//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Thread.sleep(3000);
		//Alert a=driver.switchTo().alert();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Durga");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(7000);
		driver.close();
		
	

	}

}
