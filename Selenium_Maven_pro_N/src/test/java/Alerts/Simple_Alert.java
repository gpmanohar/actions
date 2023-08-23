package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple_Alert {

	public static void main(String[] args) throws Throwable {
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		WebElement butn = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		butn.click();
		Thread.sleep(4000);
		Alert at = driver.switchTo().alert();
		at.accept();
		
		
		

	}

}
