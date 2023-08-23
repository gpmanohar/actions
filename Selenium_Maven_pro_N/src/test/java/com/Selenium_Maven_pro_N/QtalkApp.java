package com.Selenium_Maven_pro_N;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QtalkApp {

	public static void main(String[] args) throws Exception {
		 WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.navigate().to("https://www.google.com/");
		 driver.get("https://chat.qspiders.com/");
		 driver.getCurrentUrl();
		 //verfiy title 
		 String qtitle = driver.getTitle();
		 if(qtitle.equals("Qtalk"))
		 {
			 System.out.println("TITLE IS MATCHING");
		 }
		 else 
		 {
			 System.out.println("TITLE IS NOT MATCHING");
		 }
		 
		 //verify logo 
		 WebElement actualqLogo = driver.findElement(By.xpath("//div[@class='_navbar_logoBlock__RIMo6']"));
		 if(actualqLogo.isDisplayed())
		 {
			 System.out.println("Logo is Displayed");
		 }
		 else
		 {
			 System.out.println("Logo is Not Displayed");
		 }
		 // verify header 
		 WebElement TitleHeader = driver.findElement(By.xpath("//h1[text()='Login ']"));
		 String TitleS = TitleHeader.getText();
		 if(TitleS.equals("LOGIN"))
				 {
			 System.out.println("LOGIN HEADER IS MATCHING");
				 }
		 else
		 {
			 System.out.println("LOGIN HEADER IS NOT MATCHING");
		 }
		  // verify phone number
		 WebElement PhoneHeader = driver.findElement(By.xpath("//label[text()='Phone Number']"));
		   String Vphone = PhoneHeader.getText();
		   if(Vphone.equals("Phone Number"))
		   {
			   System.out.println("PHONE NUMBER HEADER IS MATCHING");
		   }
		   else
		   {
			   System.out.println("PHONE NUMBER HEADER IS NOT MATCHING");
		   }
		// verifying password header 
		   WebElement passwordHeader = driver.findElement(By.xpath("//label[text()='password']"));
		   String passH = passwordHeader.getText();
		   if(passH.equals("Password"))
		   {
			   System.out.println("PASSWORD HEADER IS MATCHING");
		   }
		   else
		   {
			   System.out.println("PASSWORD HEADER IS NOT MATCHING");
		   }
		   //verify the phone and password textbox 
		   WebElement phoneTextbox = driver.findElement(By.xpath("//input[@placeholder='Enter Registered Number']"));
		   WebElement passTextbox = driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		   if(phoneTextbox.isDisplayed()&& phoneTextbox.isEnabled()&& passTextbox.isDisplayed()&& passTextbox.isEnabled())
		   {
			   System.out.println("PHONE NUMBER TEXTBOX AND PASSWORD TEXT BOX ARE BOTH WORKING");
		   }
		   else
		   {
			   System.out.println("PHONE NUMBER TEXTBOX AND PASSWORD TEXT BOX ARE NOT WORKING");
		   }
		   // enter the credentials 
		   phoneTextbox.sendKeys("9030207720");
		   passTextbox.sendKeys("9030207720");
		   // Login to application 
		   WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
		   Submit.click();
		 //click on req
		   WebElement Req = driver.findElement(By.xpath("//span[text()='Requirement']"));
		   Req.click();
		// click on group list 
		   WebElement Glist = driver.findElement(By.xpath("//a[@href='/student-dashboard/studentgrouplist']"));
		   Glist.click();
		   // chat with trainer 
		   WebElement ChatT = driver.findElement(By.xpath("//a[@href='/student-dashboard/studentgrouplist/QKP-SJETPD-M1']"));
		   ChatT.click();
		   // click trainer name 
		   WebElement ClikA = driver.findElement(By.xpath("//div[@class='_chat_conversation__wGPeN']"));
		   ClikA.click();
		   // enter text 
		 
		   WebElement Writesom = driver.findElement(By.xpath("//input[@placeholder='write something...']"));
		   Writesom.sendKeys("Hello This is automation program");
		   Writesom.clear();
		   Writesom.sendKeys("This is AUTOMATION PROGRAM");
		   //Logout 
		   
		   WebElement Logout = driver.findElement(By.xpath("//button[@class='btn']"));
		   Logout.click();
		   //confirm logout 
		   //WebElement Clogout = driver.findElement(By.xpath("(//button[@class=\"rs-btn rs-btn-subtle\"])[1]"));
		   //Clogout.click();
	}

}
