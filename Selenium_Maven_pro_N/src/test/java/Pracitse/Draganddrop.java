package Pracitse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		
		

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		Thread.sleep(6000);
		WebElement dragoslo = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		Thread.sleep(6000);
		WebElement dragNorway = driver.findElement(By.xpath("//div[@id='trash']"));
		Thread.sleep(6000);
		act.dragAndDrop(dragoslo, dragNorway).perform();
	
		
		
		
		
		
		
		
		
		/* driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(6000);
		WebElement dragoslo = driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
		Thread.sleep(6000);
		WebElement dragNorway = driver.findElement(By.xpath("//div[text()='Norway']"));
		Thread.sleep(6000);
		act.dragAndDrop(dragoslo, dragNorway).perform();*/
		
	}

}
