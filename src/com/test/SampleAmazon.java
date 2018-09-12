package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SampleAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\CHANDRASEKAR\\eclipse-workspace\\BP\\Selenium\\driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}
}
