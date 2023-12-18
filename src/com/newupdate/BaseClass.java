package com.newupdate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass extends CaptureScreenshot 
{

	public static WebDriver driver;
public static void openbrowser() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver",".//Utilities//chromedriver.exe");
 driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
Thread.sleep(3000);
}
public static void closebrowser()
{
	driver.quit();
}

}
