package com.javacodegeeks.examples.junitmavenexample;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchFirefox {

	 @Test
	 public void launch() {
		System.out.println("launch browser");
		System.setProperty("webdriver.chrome.driver", ".\\Exefiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/"); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Codes work fine");
		 
		}
}