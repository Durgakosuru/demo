package com.newupdate;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases extends BaseClass
{
	
	
	/*
	 * Date:08/11/2023
	 * Author:Saag Technologies
	 * feture:Sar-6500
	 * Description:TC1 validates with correct user name and correct password
	 */
@Test
	public static void TC1() throws InterruptedException, IOException
	{

		/*System.setProperty("webdriver.chrome.driver",".//Utilities//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.manage().window().maximize();
		Thread.sleep(3000);*/
		//System.out.println("Website opened");
		openbrowser();
        WebElement y=driver.findElement(By.xpath("//input[@name='username']"));
        y.click();
        y.sendKeys("Admin");
        Thread.sleep(3000);
        WebElement x=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        x.sendKeys("admin123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        Screenshots("TC1 123456");
        WebElement MTisPresent=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        if(MTisPresent.isDisplayed()) 
        {
        	System.out.println("TC1 PASS");  
        	Screenshots("TC1 PASS");
        }
        else 
        {
        	System.out.println("TC1 FAIL");                    
        	Screenshots("TC1 FAIL");
        }
        driver.quit();
	}
	
	/*
	 * Date:08/11/2023
	 * Author:Saag Technologies
	 * feture:Sar-6500
	 * Description:TC2 validates with correct user name and Wrong password
	 */
@Test
	public static void TC2() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver",".//Utilities//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Website opened");
        WebElement y=driver.findElement(By.xpath("//input[@name='username']"));
        y.click();
        y.sendKeys("Admin");
        Thread.sleep(3000);
        WebElement x=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        x.sendKeys("admin1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        try {
        driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
        	System.out.println("TC2 FAIL");
        }
        catch(Exception e) 
        {
        	System.out.println("TC2 pass");
        	
        }
        driver.quit();
        }
	/*
	 * Date:08/11/2023
	 * Author:Saag Technologies
	 * feture:Sar-6500
	 * Description:TC3 validates with correct user name and Wrong password
	 */
@Test
	public static void TC3() throws InterruptedException
	{
		/*
		 * Date:08/11/2023
		 * Author:Saag Technologies
		 * feture:Sar-6500
		 * Description:TC3 validates with correct user name and Empty password
		 */
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	System.out.println("Website opened");
    WebElement y=driver.findElement(By.xpath("//input[@name='username']"));
    y.click();
    y.sendKeys("Admin");
    Thread.sleep(3000);
    WebElement x=driver.findElement(By.xpath("//input[@placeholder='Password']"));
    x.sendKeys("");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    try {
        driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
        	System.out.println("TC3 FAIL");
        }
        catch(Exception e) 
        {
        	//e.printStackTrace();
        	System.out.println("TC3 pass");
        	
        }
        driver.quit();
        }
@Test
	public static void TC4() throws InterruptedException
	{
		/*
		 * Date:08/11/2023
		 * Author:Saag Technologies
		 * feture:Sar-6500
		 * Description:TC3 validates with correct Empty name and Correct password
		 */
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	System.out.println("Website opened");
    WebElement y=driver.findElement(By.xpath("//input[@name='username']"));
    y.click();
    y.sendKeys("");
    Thread.sleep(3000);
    WebElement x=driver.findElement(By.xpath("//input[@placeholder='Password']"));
    x.sendKeys("admin123");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    try {
        driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
        	System.out.println("TC4 FAIL");
        }
        catch(Exception e) 
        {
        	//e.printStackTrace();
        	System.out.println("TC4 pass");
        	
        }
        driver.quit();
        }
@Test
	public static void TC5() throws InterruptedException
	{
		/*
		 * Date:08/11/2023
		 * Author:Saag Technologies
		 * feture:Sar-6500
		 * Description:TC3 validates with correct Empty name and Empty password
		 */
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	System.out.println("Website opened");
    WebElement y=driver.findElement(By.xpath("//input[@name='username']"));
    y.click();
    y.sendKeys("");
    Thread.sleep(3000);
    WebElement x=driver.findElement(By.xpath("//input[@placeholder='Password']"));
    x.sendKeys("");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    try {
        driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
        	System.out.println("TC5 FAIL");
        }
        catch(Exception e) 
        {
        	//e.printStackTrace();
        	System.out.println("TC5 pass");
        	
        }
        driver.quit();
        }
@Test
	public static void TC6() throws InterruptedException
	{
		/*
		 * Date:08/11/2023
		 * Author:Saag Technologies
		 * feture:Sar-6500
		 * Description:TC3 validates with correct Empty name and Wrong password
		 */
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	System.out.println("Website opened");
    WebElement y=driver.findElement(By.xpath("//input[@name='username']"));
    y.click();
    y.sendKeys("");
    Thread.sleep(3000);
    WebElement x=driver.findElement(By.xpath("//input[@placeholder='Password']"));
    x.sendKeys("admin123@");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    try {
        driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
        	System.out.println("TC6 FAIL");
        }
        catch(Exception e) 
        {
        	//e.printStackTrace();
        	System.out.println("TC6 pass");
        	
        }
        driver.quit();
        }
    }

        
	
