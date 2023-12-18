package com.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".//Utilities//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/ref=nav_bb_logo");	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Website opened");
		
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span"));
		x.click();
		Thread.sleep(3000);
		

		System.out.println("ALL Options Displayed");
		driver.close();
		
		

	}

}
