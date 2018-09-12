package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.test.Base;

public class SampleMouseOver2 extends Base {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = getDriver("http://www.greenstechnologys.com/selenium-course-content.html");
		
		WebElement menuContactUs = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions acc=new Actions(driver);
		acc.contextClick(menuContactUs).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String pWin = driver.getWindowHandle();
		Set<String> cWin = driver.getWindowHandles();
		
		System.out.println(pWin);
		System.out.println(cWin);
		
		for(String s:cWin) {
			if(!pWin.equals(s)) {
				driver.switchTo().window(s);
			}
		}
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement labelTitle = driver.findElement(By.xpath("//h3[contains(@class,'title divider-3')]"));
		System.out.println(labelTitle.getText());
			
		quitBrowser(driver);
			
			
			
		}
	}
	

	
	

