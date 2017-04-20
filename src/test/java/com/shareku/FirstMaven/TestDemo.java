package com.shareku.FirstMaven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class TestDemo 

{
	/*WebDriver driver = new ChromeDriver();
SeleniumBaseLib  sl =  new SeleniumBaseLib();
	@BeforeClass
	public static void setUpBeforeClass() {		
		SeleniumBaseLib.newClassStart("JnuitDemo");			
	}


	
	@Test	
	public void testLogin1() {		
		//wl.login(driver,sl);		
		//Assert.assertEquals(sl.getTitle(driver), "联宠采购商城-一站式动物医院采购平台");
		driver.get("http://www.baidu.com");		
		sl.newAssertEquals("测试2", "aa", "aa","testLogin()2", "tttt");
	}*/
	@Test
	public void testaa(){
		assertEquals("aa","aa");
	}
	
	
	
}

