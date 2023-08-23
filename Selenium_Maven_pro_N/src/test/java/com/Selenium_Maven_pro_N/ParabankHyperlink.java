package com.Selenium_Maven_pro_N;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParabankHyperlink {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/links");
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		// verifying hyperlink 
		WebElement Hlink = driver.findElement(By.xpath("//a[@id='simpleLink']"));
		String Hl = Hlink.getAttribute("href");
		String Hlk = "https://demoqa.com/";
		if(Hl.equals(Hlk))
			System.out.println("HYPER LINK WORKING");
		else
			System.out.println("HYPER LINK NOT ACTIVATED");
		

	}

}
