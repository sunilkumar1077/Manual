package com.javacodegeeks.examples.junitmavenexample;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LaunchFirefox {

	 @Test
	 public void launch() {
		System.out.println("launch browser");
		System.setProperty("webdriver.chrome.driver", ".\\Exefiles\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-gpu");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/"); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Codes work fine");
		 
		}
}