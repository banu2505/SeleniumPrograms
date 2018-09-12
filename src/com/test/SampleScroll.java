package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.test.Base;

public class SampleScroll extends Base {

	public static void main(String[] args) {
		WebDriver driver = getDriver("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement paraText = driver.findElement(By.xpath("//p[contains(text(),'This selenium')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", paraText);
		
		System.out.println(paraText.getText());
		
		quitBrowser(driver);
		
		
	}

}
