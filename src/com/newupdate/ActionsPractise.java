package com.newupdate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractise extends BaseClass 
{

	public static void main(String[] args) throws InterruptedException 
	{
	openbrowser();
	WebElement un=driver.findElement(By.xpath("//input[@name='username']"));
	Actions act=new Actions(driver);
	//sending the data by using actions class
	act.sendKeys(un,"Admin").build().perform();
    Thread.sleep(300);

    //pressing a button is done using keyDown
  //  act.keyDown(Keys.SHIFT).sendKeys(un,"admin").build().perform();
   // Thread.sleep(3000);
    
    //releasing a button is done using keyup
   // act.keyUp(Keys.SHIFT);
   // Thread.sleep(3000);
    
   // act.sendKeys(Keys.SPACE).build().perform();
    //Thread.sleep(3000);
     
    act.sendKeys(Keys.TAB).build().perform();
    Thread.sleep(3000);
    
    act.sendKeys("admin123").build().perform();
    Thread.sleep(3000);
    
    act.sendKeys(Keys.BACK_SPACE).build().perform();
    Thread.sleep(3000);
    
    act.sendKeys(Keys.ENTER).build().perform();
    Thread.sleep(3000);
    
    act.sendKeys(Keys.BACK_SPACE).build().perform();
    Thread.sleep(3000);
    
	closebrowser();
	}

}
