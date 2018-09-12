package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	static WebDriver driver;

	public static WebDriver getDriver(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CHANDRASEKAR\\eclipse-workspace\\BP\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();	
		
	}
	
	public static void insertText(WebElement element, String text) {
		element.sendKeys(text);

	}
	
	public static void btnClick(WebElement element) {
		element.click();
		
	}
	
	public static String getValueByAttribute(WebElement element) {
		String text = element.getAttribute("value");
		return text;
		
	}

}
