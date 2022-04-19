package com.harman.basics;

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
		
		driver.get("https://www.goto.com/meeting/");
		
		driver.findElement(By.id("truste-consent-button")).sendKeys("Accept Recommended Settings");
		driver.findElement(By.linkText("Try Free")).click();
		
		driver.findElement(By.name("FirstName")).sendKeys("John");
		driver.findElement(By.name("LastName")).sendKeys("wick");
		driver.findElement(By.name("Email")).sendKeys("john@gmail.com");
		driver.findElement(By.name("PhoneNumber")).sendKeys("9908123456");
		driver.findElement(By.name("Password")).sendKeys("john@123");
		driver.findElement(By.name("CompanySize")).sendKeys("10-99");
		driver.findElement(By.className("common-button__button")).click();
		

	}

}
