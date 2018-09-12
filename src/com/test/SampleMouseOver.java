package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.test.Base;

public class SampleMouseOver extends Base{
	public static void main(String[] args) throws AWTException {
		
	
	WebDriver driver = getDriver("https://www.gettyimages.in/");
	
	WebElement menuEditorial = driver.findElement(By.xpath("(//a[@data-nav='nav_Editorial_EditorialPhotos'])[2]"));
	
	Actions acc = new Actions(driver);
	acc.moveToElement(menuEditorial).perform();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	WebElement menuEntertainment = driver.findElement(By.xpath("(//a[@data-nav='nav_Editorial_Entertainment'])[2]"));
	btnClick(menuEntertainment);
	
	System.out.println(driver.getCurrentUrl());
	
	quitBrowser(driver);
	
	
	}
}
