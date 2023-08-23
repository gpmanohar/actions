package Pracitse;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		WebElement slideb = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
		
		Rectangle rect = slideb.getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		act.moveToElement(slideb).perform();
		act.clickAndHold(slideb).perform();
		act.moveByOffset(0,250).perform();
		//act.dragAndDropBy(slideb, 0, -30).perform();
		
		driver.close();
		
//     	act.moveToElement(slideb).perform();
//		act.clickAndHold(slideb).perform();
//		act.moveByOffset(0,100).perform();
//		
		

	}

}
