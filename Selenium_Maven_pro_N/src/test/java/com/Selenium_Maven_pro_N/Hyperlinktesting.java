package com.Selenium_Maven_pro_N;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinktesting {
	public static void main(String[] args) throws Exception {
 
		WebDriverManager.firefoxdriver().setup(); 
		  WebDriver driver = new FirefoxDriver();
		  
		  // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.get("https://demo.automationtesting.in/Register.html");
		  WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		  Select s =  new Select(Skills);
		  s.selectByVisibleText("Java");
		  
		  
		  
}
}