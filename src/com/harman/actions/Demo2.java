package com.harman.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CORE JAVA\\testing\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		driver.get("https://nasscom.in/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Become a member']"))).perform();
		//action.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).perform().pause(1000).action.moveToElement(driver.findElement(By.xpath("//a[text()='Become a member']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Membership Benefits']")).click();

	}

}
