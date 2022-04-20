package com.harman.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CORE JAVA\\testing\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.className("appClose")).click();
		driver.findElement(By.id("loginId")).click();
		driver.findElement(By.xpath("[@title='Forgot ID / Password']")).click();

	}

}
