package com.Selenium_Maven_pro_N;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox_Test {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/Register.html");
		//List<WebElement> Fl = driver.findElements(By.xpath("//div[@class='form-group']"));	
		List<WebElement> Fl = driver.findElements(By.xpath("(//div[@class='form-group'])[11]"));
		for(WebElement all:Fl)
		{
			String Data = all.getText();
			System.out.println(Data);
		}
		
		driver.close();
		/*
		 * WebElement List =
		 * driver.findElement(By.xpath("//select[@placeholder='Month']")); Select sq =
		 * new Select(List); sq.selectByVisibleText("February");
		 * 
		 * 
		 * 
		 * WebElement NList =
		 * driver.findElement(By.xpath("//select[@placeholder='Day']")); Select Nsq =
		 * new Select(List); Nsq.selectByIndex(2);
		 */
	     
		
		 
		 
		
			/*
			 * WebElement List =
			 * driver.findElement(By.xpath("//input[@class='select2-search__field']"));
			 * List.click(); Select s = new Select(List); s.selectByVisibleText("Japan");
			 */
		
		
		
		
		
	}
}
	


		
	


