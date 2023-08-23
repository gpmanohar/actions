package com.Selenium_Maven_pro_N;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar_selectDDMMYY {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		
		Select sMonth = new Select(month);
		Select syear = new Select(year);
		
		sMonth.selectByVisibleText("August");
		syear.selectByVisibleText("1994");
	
		
		WebElement Ddate = driver.findElement(selectDate("August","2"));
		Ddate.click();
		
		

	}
	static By selectDate (String month, String date) {
		By locator = By.xpath("//div[contains(@aria-label,'Choose Tuesday, "+month+" 2nd, 1994') and text()='"+date+"']");
		return locator;
	}
	{
		
	}

}
