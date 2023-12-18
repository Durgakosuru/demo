package com.newupdate;

import org.openqa.selenium.WindowType;

public class WindowHandle extends BaseClass
{

	public static void main(String[] args) throws InterruptedException
	{
	openbrowser();
	//get window handle will get the id of  the new tab opened
	//this id  will be unique and change every time run
	String x =driver.getWindowHandle();
	System.out.println(x);
	//creating new tab
	driver.switchTo().newWindow(WindowType.TAB);
	//open link in new tab
	driver.get("https://www.amazon.com/");
	String y =driver.getWindowHandle();
	System.out.println(y);
	Thread.sleep(3000);
	//close the active window/tab
	//driver.close();
	
	closebrowser();

	}

}
