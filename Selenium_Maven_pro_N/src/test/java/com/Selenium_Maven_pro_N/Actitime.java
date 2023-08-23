package com.Selenium_Maven_pro_N;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.actitime.com/login.do");
		 //driver.get("https://www.google.com/");
		 //driver.navigate().back();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 // verify title 
		 String Titlevrf = driver.getTitle();
		 if(Titlevrf.equals("actiTIME - Login"))
		 {
			 System.out.println("TITLE IS MATCHING");
		 }
		 else
		 {
			 System.out.println("TITLE IS NOT MATCHING");
		 }
		 //verify header 
		 WebElement LHeader = driver.findElement(By.xpath("//td[text()='Please identify yourself']"));
		 String HeaderM = LHeader.getText();
		 if(HeaderM.equals("Please identify yourself"))
		 {
			 System.out.println("MAIN HEADER MATCHING");
		 }
		 else
		 {
			 System.out.println("MAIN HEADER IS NOT MATCHING");
		 }
		 //tooltip vrfy
		 WebElement ToolTip = driver.findElement(By.xpath("//div[@class='tooltip-content']"));
		 
		 if(ToolTip.isDisplayed())
		 {
			 System.out.println(" TOOL TIP DISPLAYED");
		 }
		 else
		 {
			 System.out.println("TOOL TIP NOT DISPLAYED");
		 }
		 //verifying Textboxes 
		 WebElement usernameTextBox = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		 WebElement passwordTextBox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 if(usernameTextBox.isDisplayed()&& usernameTextBox.isEnabled()&& passwordTextBox.isDisplayed()&& passwordTextBox.isEnabled())
		 {
			 System.out.println("USERNAME AND PASSWORD TEXTBOXES ARE READY");
		 }
		 else
		 {
			 System.out.println("USERNAME AND PASSWORD TEXTBOXES ARE NOT READY");
		 }
		 //Enter credentials 
		 usernameTextBox.sendKeys("admin");
		 passwordTextBox.sendKeys("manager");
		 // login
		 WebElement Loginbutton = driver.findElement(By.xpath("//div[text()='Login ']"));
		 Loginbutton.click();
		 //click on tasks
		 Thread.sleep(8000);
		 WebElement Tasks = driver.findElement(By.xpath("//div[@id='container_tasks']"));
		 Tasks.click();
          
	}

}
