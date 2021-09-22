package com.javacodegeeks.examples.junitmavenexample;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LaunchFirefox {

	 @Test
	 public void launch() {
		System.out.println("launch browser");
		System.setProperty("webdriver.chrome.driver", ".\\Exefiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/SunilSaxena/Desktop/selenium.html"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("fname")).sendKeys("Sunil");
		driver.findElement(By.id("lname")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Kamal");
		
		//code of select class
		WebElement ele = driver.findElement(By.xpath("//select[@id='degree']"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
		}
}