package com.crm.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class FreeCRMTest {
	WebDriver driver;
	
	@Test
	public void Setup() throws MalformedURLException{

	/*
	DesiredCapabilities capability = DesiredCapabilities.firefox();
	capability.setBrowserName("firefox");
	capability.setPlatform(Platform.XP);
	driver = new RemoteWebDriver(new URL("node url"),capability);*/
	
	
	System.setProperty("webdriver.ie.driver", "C:/Selenium/BrowserDrivers/IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.freecrm.com/index.html");

}
	
	@Test
	public void Setup1(){

	System.setProperty("webdriver.chrome.driver", "C:/Selenium/BrowserDrivers/chromedriver.exe");
	driver = new ChromeDriver();
	
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.freecrm.com/index.html");

}
	
	@Test
	public void Setup2(){

	System.setProperty("webdriver.gecko.driver", "C:/Selenium/BrowserDrivers/geckodriver.exe");
	driver = new FirefoxDriver();
	
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.freecrm.com/index.html");

}
	
	
	@Test
	public void tearDown(){
		//driver.quit();
	}
}