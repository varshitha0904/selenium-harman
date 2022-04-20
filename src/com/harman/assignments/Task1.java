package com.harman.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CORE JAVA\\testing\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		driver.findElement(By.name("UserTitle")).sendKeys("IT Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("xyz");
		driver.findElement(By.name("CompanyEmployees")).sendKeys("101-500 employees");
		
		String actualError=driver.findElement(By.xpath("[@name='UserPhone']")).getTagName();
		System.out.println(actualError);
		
		driver.findElement(By.name("CompanyCountry")).sendKeys("United Kingdom");
		driver.findElement(By.id("SubscriptionAgreement-ztad-cbxLbl")).click();
		driver.findElement(By.name("start my free trail")).click();
		
		

	}

}
