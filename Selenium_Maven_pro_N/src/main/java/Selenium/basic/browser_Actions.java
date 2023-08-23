package Selenium.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser_Actions {

	public static void main(String[] args) throws Exception {
		
	
		
		  WebDriverManager.chromedriver().setup(); 
		  WebDriver driver=new ChromeDriver();
		 
		
		/*ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option); */
		
		/*
		 * System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		 * FirefoxDriver driver = new FirefoxDriver();
		 */
		/* ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option); */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement dragoslo = driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
		
		WebElement dragNorway = driver.findElement(By.xpath("//div[text()='Norway']"));
		
		act.dragAndDrop(dragoslo, dragNorway).perform();
		
	}

}
