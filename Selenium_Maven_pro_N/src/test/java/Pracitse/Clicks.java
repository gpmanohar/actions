package Pracitse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clicks {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions action = new Actions(driver);
		action.doubleClick(doubleclick).perform();
		
        WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        action.contextClick(rightclick).perform();
		


	}

}
