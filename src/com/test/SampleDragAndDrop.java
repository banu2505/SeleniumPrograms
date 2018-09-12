package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.test.Base;

public class SampleDragAndDrop extends Base {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = getDriver("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement from=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement to=driver.findElement(By.id("bank"));
		
		WebElement from1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement to1 = driver.findElement(By.id("amt7"));
		
		
		Actions acc=new Actions(driver);
		acc.dragAndDrop(from, to).perform();
		acc.dragAndDrop(from1, to1).perform();
		
		WebElement from2 = driver.findElement(By.id("credit1"));
		WebElement to2 = driver.findElement(By.id("loan"));
		
		WebElement from3 = driver.findElement(By.id("credit0"));
		WebElement to3 = driver.findElement(By.id("amt8"));
	
		acc.dragAndDrop(from2, to2).perform();
		acc.dragAndDrop(from3, to3).perform();
		
		Thread.sleep(3000);
		
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("D:\\Banupriya\\SeleniumScreenshots\\draganddrop.png");
		FileUtils.copyFile(srcFile, destFile);
		
		quitBrowser(driver);
		
		
	}
}
