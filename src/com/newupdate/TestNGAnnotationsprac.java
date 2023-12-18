package com.newupdate;

import org.testng.annotations.*;

public class TestNGAnnotationsprac
{
	@BeforeMethod
public static void tec1()
{
		
	System.out.println("@BeforeMethod");
	}
	@AfterSuite
public static void tec2()
{
	System.out.println("@AfterSuite");
	}
	@Test
public static void tec3()
{
	System.out.println("@Test");
	}
	@BeforeTest
public static void tec4()
{
	System.out.println("@BeforeTest");
	}
	@AfterTest
public static void tec5()
{
	System.out.println("@AfterTest");
	}
	@BeforeSuite
public static void tec7()
{
	System.out.println("@BeforeSuite");
	}
@AfterMethod
public static void tec8()
{
	System.out.println("@AfterMetho");
	}
@AfterClass
public static void tec9()
{
	System.out.println("@AfterClass");
	}
@Test(priority=5)
public static void tec10()
{
	System.out.println("Tc10");
	}
@Parameters({"username","password"})
@Test(priority=3)
public static void tec11()
{
	System.out.println("Tc11");
	}
@Test(priority=1)
public static void tec12()
{
	System.out.println("Tc12");
	}
@Test(priority=2,alwaysRun=true)
public static void tec13()
{
	System.out.println("Tc13");
	}

}


