package com.harman.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBRegister {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CORE JAVA\\testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Varshi");
		driver.findElement(By.name("lastname")).sendKeys("Tetali");
		driver.findElement(By.name("reg_email__")).sendKeys("welcomeharman@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("welcomeharman@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("welcome@123");
		
		Select selectDay = new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("29");
		
		Select selectMonth = new Select(driver.findElement(By.name("birthday_month")));
		//selectMonth.selectByVisibleText("Dec");
		selectMonth.selectByValue("12");
		
		Select selectYear = new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		Select selectPronoun = new Select(driver.findElement(By.name("preferred_pronoun")));
		selectPronoun.selectByIndex(3);
		
		driver.findElement(By.name("websubmit")).click();

	}

}
