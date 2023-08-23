package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Confirmation_Alert {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		WebElement butn = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		butn.click();
		Alert att = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(att.getText());
		att.accept();
		
		
		
		
		

	}

}
