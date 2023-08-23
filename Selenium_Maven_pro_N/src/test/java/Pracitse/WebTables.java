package Pracitse;


import java.awt.Window;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Selenium_Maven_pro_N.Calendar_selectDDMMYY;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		//WebElement cor = driver.findElement(By.xpath("(//span[@class='pr-1'])[5]"));
		//Rectangle rec = cor.getRect();
		//System.out.println(rec.getX());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,2000)","");
		js.executeScript("window.scrollBy(0,5000)","");
	
		/*List<WebElement> row = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
		int totalrows = row.size();
		List<WebElement> column = driver.findElements(By.xpath("//div[@class=\"rt-td\"]"));
		int totalcolums = column.size();
		
		//print column headers 
		for(int i=0; i<=totalcolums;i++)
		{
			System.out.println(i+column.get(i).getText());
		}
		//print all data 
		for(int i=0; i<=totalrows;i++)
		{
			System.out.println(i+row.get(i).getText());
		}*/
		
	

	}

}
