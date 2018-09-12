package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.test.Base;

public class SampleWebTable extends Base {

	public static void main(String[] args) {

		WebDriver driver = getDriver("http://toolsqa.com/automation-practice-table/");

		//remove if statement and count for printing all values
		// first 2 rows
		System.out.println("First Two Rows");
		int count =1;
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for (WebElement rows : tRows) {
			if (count <=3) {
				List<WebElement> tData = rows.findElements(By.tagName("td"));
				for (WebElement data : tData) {
					System.out.println(data.getText());
				}
				count++;
			}
			
		}
		
		
		// Last 2 rows
		System.out.println("Last 2 rows");
		int maxCount = tRows.size();
		for (int i=(maxCount-1); i>=(maxCount-2); i--) {
				List<WebElement> tData = tRows.get(i).findElements(By.tagName("td"));
				for (WebElement data:tData) {
					System.out.println(data.getText());
				}
		}
		
		//Prints whole line ( the rank of the country) whose name is china 
		System.out.println("China line print");
		for (WebElement rows:tRows) {
			List<WebElement> tHeading = rows.findElements(By.tagName("th"));
			
			
			for (WebElement head:tHeading) {
				System.out.println(head.getText());
				if ((head.getText()).equals("Financial Center")) {
					List<WebElement> tData = rows.findElements(By.tagName("td"));
					for (WebElement data:tData) {
						System.out.println(data.getText());
					}
				}
			}
		}
		
		
		quitBrowser(driver);
		
	}
}
