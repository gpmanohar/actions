package com.Selenium_Maven_pro_N;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("https://ispselfcare.hathway.net/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src='/static/media/logo.1409bdaec8ebfe1b27e8.png']"));
		driver.getTitle();
		driver.close();
		
		
	}

}
