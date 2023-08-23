package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Promt_Alert {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		WebElement butn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		butn.click();
		Thread.sleep(4000);
		Alert at = driver.switchTo().alert();
		System.out.println(at.getText());
		at.sendKeys("GP MANOHAR");
		Thread.sleep(2000);
		at.accept();
		
		
	}

}
