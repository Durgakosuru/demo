package com.newupdate;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshot
{
public static WebDriver driver;

public static void Screenshots(String name) throws InterruptedException, IOException 
{
	/*System.setProperty("webdriver.chrome.driver","./Utilities/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);*/
TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File trg=new File("./Screenshots/"+name+".png");
Files.copy(src, trg);
driver.close();
	
}

}
