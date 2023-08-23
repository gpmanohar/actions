package com.Selenium_Maven_pro_N;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check {

	public static void main(String[] args)  {
		WebDriverManager.firefoxdriver().setup(); 
		  WebDriver driver = new FirefoxDriver();
		  
		  
		  
			// ChromeOptions option = new ChromeOptions ();
			 //Option.addArguments("--remote-allow-origins=*");
			 //WebDriverManager.chromedriver().setup(); 
			 //WebDriver driver=new ChromeDriver(option);
			 
		  driver.get("https://demoqa.com/links");
			
			  //WebElement CHK = driver.findElement(By.xpath("//span[@class='text']"));
			 
			  List<WebElement> Lp =
			  driver.findElements(By.xpath("//span[@class='text']")); 
			  for(WebElement all:Lp) 
			  { 
				  String Pd = all.getText(); 
			  System.out.println(Pd); 
			  }
				/*
				 * driver.get("https://demoqa.com/frames"); List<WebElement> L1 =
				 * driver.findElements(By.xpath("//div[@class='element-group']"));
				 * for(WebElement LL: L1) { String Pdata = LL.getText();
				 * System.out.println(Pdata); }
				 */
			 
			 // verify the hyperlink
			 WebElement HLin = driver.findElement(By.xpath("//a[@id='dynamicLink']"));
			 
			 String ActL = HLin.getAttribute("href");
			 String EctL = "https://demoqa.com/";
			 if(ActL.equals(EctL))
				 System.out.println("Hyperlink ok ");
			 else
				 System.out.println("not ok Hyperlink");

	}

}
