package com.harman.actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CORE JAVA\\testing\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		driver.get("https://google.com/");
		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).pause(1000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ENTER)
		.build().perform();

	}

}
