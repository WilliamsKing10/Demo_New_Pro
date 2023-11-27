package com.lip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		WebElement btnCreate = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		btnCreate.click();
		
		Thread.sleep(3000);
		
		WebElement ddnDay = driver.findElement(By.id("day"));
		Select s = new Select(ddnDay);
		
		//s.selectByVisibleText("5");
		//s.selectByIndex(2);
		s.selectByValue("6");

		
	}

}
