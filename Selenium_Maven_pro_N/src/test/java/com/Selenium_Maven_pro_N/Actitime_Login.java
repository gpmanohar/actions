package com.Selenium_Maven_pro_N;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime_Login {

	public static void main(String[] args) throws Exception {
		
		//Launch the Browser 
		
		
		  WebDriverManager.firefoxdriver().setup();
		  WebDriver driver = new FirefoxDriver();
		 
			/*
			 * ChromeOptions option = new ChromeOptions ();
			 * option.addArguments("--remote-allow-origins=*");
			 * WebDriverManager.chromedriver().setup(); WebDriver driver=new
			 * ChromeDriver(option);
			 */ 
		
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  // Maximize the browser
		  //driver.manage().window().maximize();
		  // Delete all cookies 
		  driver.manage().deleteAllCookies();
		  //Enter url and launch application 
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  // verify the application of title 
		  String actualTitle = driver.getTitle();
		  if(actualTitle.equals("OrangeHRM"))
		  {
			  System.out.println("Title is Matching");
		  }
		  else
		  {
			  System.out.println("Title is not Matching");
		  }
		  
		  // Verify the logo 
		  WebElement actualLogo = driver.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1683010990518']"));
		  if(actualLogo.isDisplayed())
		  {
			  System.out.println("Logo is Displayed");
		  }
		  else
		  {
			  System.out.println("Logo is not Displayed");
		  }
		  // Verify the application header 
		  WebElement header = driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']"));
		  String actualheader = header.getText();
		  if(actualheader.equals("Login"))
		  {
			  System.out.println("Login is Matching");
		  }
		  else
		  {
			  System.out.println("Login is Not Matching");
		  }
		  //Verify the user name and password text boxes 
		  WebElement usernameTextbox = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		  WebElement passwordTextbox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		  if(usernameTextbox.isDisplayed()&& usernameTextbox.isEnabled()&& passwordTextbox.isDisplayed()&& passwordTextbox.isEnabled())
		  {
			  System.out.println("Username and password text box are ok");
		  }
		  else
		  {
			  System.out.println("Username and password text box are Not ok");
		  }
		  //Enter the username and password 
		  usernameTextbox.sendKeys("Admin");
		  passwordTextbox.sendKeys("admin123");
		  // click on login 
		  WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		  loginButton.click();
		  // click on pim page 
		  WebElement pimPage = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]"));
		  pimPage.click();
		  //select all the records 
		  Thread.sleep(8000);
		  WebElement SelectTick = driver.findElement(By.xpath("(//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input'])[1]"));
		  if(!SelectTick.isSelected())
			  SelectTick.click();
		  else 
		  {
			  
		  }
		 //click on my info 
		  WebElement myInfo = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]"));
		  myInfo.click();
		  Thread.sleep(8000);
		  //enter firstname
		  WebElement Firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		  Firstname.clear();
		  Firstname.sendKeys("Neha");
		  // select gender
		  WebElement gendeR = driver.findElement(By.xpath("(//span[@class=\"oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input\"])[2]"));
		  gendeR.click();
	}

}
