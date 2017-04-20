package com.shareku.FirstMaven;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo2 {
	
	WebDriver driver = new ChromeDriver();
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
			//sl.newAssertEquals("测试2", "aa", "aa","testLogin()2", "tttt");
		}
		
		
		@Test	
		public void testLogin2() {		
			//wl.login(driver,sl);		
			//Assert.assertEquals(sl.getTitle(driver), "联宠采购商城-一站式动物医院采购平台");
			driver.get("http://www.qq.com");		
			//sl.newAssertEquals("测试2", "aa", "aa","testLogin()2", "tttt");
		}
		
		

}
