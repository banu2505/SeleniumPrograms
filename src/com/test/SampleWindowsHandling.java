package com.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.test.Base;

public class SampleWindowsHandling extends Base {

	public static void main(String[] args) {
	
	WebDriver driver = getDriver("https://www.flipkart.com/");
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	String pWin = driver.getWindowHandle();
	Set<String> cWins = driver.getWindowHandles();

	System.out.println(pWin);
	System.out.println(cWins);
	for (String s:cWins) {
		if(!pWin.equals(s)) {
			driver.switchTo().window(s);
		}
	}
	
	WebElement btnClose = driver.findElement(By.xpath("//button[text()='✕']"));
	btnClick(btnClose);
	
	driver.switchTo().window(pWin);
	
	WebElement txtSearch = driver.findElement(By.className("LM6RPg"));
	insertText(txtSearch, "iphones 10");
	
	WebElement btnSearch = driver.findElement(By.className("vh79eN"));
	btnClick(btnSearch);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement iconPhone = driver.findElement(By.xpath("(//div[@class=\"_3wU53n\"])[1]"));
	btnClick(iconPhone);
	
	String pWin1 = driver.getWindowHandle();
	Set<String> cWins1 = driver.getWindowHandles();

	System.out.println(pWin1);
	System.out.println(cWins1);
	
	for (String s:cWins1) {
		if(!pWin1.equals(s)) {
			driver.switchTo().window(s);
		}
	}
	
	WebElement labelPara = driver.findElement(By.xpath("//div[contains(text(), 'Meet the')]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", labelPara);
	System.out.println(labelPara.getText());
	
	WebElement btnAddToCart = driver.findElement(By.xpath("//button[contains(@class,\"_2MWPVK\")]"));
	btnClick(btnAddToCart);
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement btnPlaceOrder = driver.findElement(By.xpath("//span[text()='Place Order']"));
	btnClick(btnPlaceOrder);
	
	System.out.println(driver.getTitle());
	driver.switchTo().window(pWin1);
	
	System.out.println(driver.getTitle());
	
	quitBrowser(driver);
	
	}
	
}
