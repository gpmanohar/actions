package Pracitse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Price {
	public static void main(String []args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/s?k=iphone+14&ref=nb_sb_noss");
		List<WebElement> prd = driver.findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
		for(WebElement all:prd)
		{
			String Pdata = all.getText();
			System.out.println(Pdata);
		}
		
		for(WebElement all1:prd)
		{
			String pdata1 = all1.getText();
			System.out.println(pdata1);
		}
	}

}
