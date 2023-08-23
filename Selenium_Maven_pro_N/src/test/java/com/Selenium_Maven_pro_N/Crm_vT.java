package com.Selenium_Maven_pro_N;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crm_vT {

	private static final String List = null;

	public static void main(String[] args) throws Exception {
		  WebDriverManager.firefoxdriver().setup(); 
		  WebDriver driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
		   // Verify the title 
		   String TitleM = driver.getTitle();
		   if(TitleM.equals("vtiger CRM 5 - Commercial Open Source CRM"))
		   {
			   System.out.println("TITLE IS VERIFIED");
			   
		   }
		   else
		   {
			   System.out.println("TITLE IS NOT VERIFIED");
		   }
		   //Verify logo 
		   WebElement Logo = driver.findElement(By.xpath("//img[@alt='logo']"));
		   if(Logo.isDisplayed())
			   System.out.println("LOGO IS DISPLAYED");
		   else
			   System.out.println("LOGO IS NOT DISPLAYED");
		   // verifiy the text in left 
		   WebElement Text = driver.findElement(By.xpath("//td[@class='small']"));
		   String AText = Text.getText();
		   String EText = "Get more out of vtiger CRM";
		   if(AText.equals(EText))
			   System.out.println("TEXT MATCHING");
		   else
			   System.out.println("TEXT IS NOT MATCHING");
		   //Verify gpay qr is displayed
		   WebElement GPqr = driver.findElement(By.xpath("(//td[@class='small'])[5]"));
		   if(GPqr.isDisplayed())
			   System.out.println("GOOGLE PAY QR IS ENABLE");
		   else
			   System.out.println("GOOGLE PAY QR IS MISSING");
		   // verify app store qr 
		   WebElement AppS = driver.findElement(By.xpath("(//td[@class='small'])[4]"));
		   if(AppS.isDisplayed())
			   System.out.println("APP STORE QR IS ENABLE");
		   else
			   System.out.println("APP STORE QR IS MISSING");
		// Exchange Connecter logo
		   WebElement EXc = driver.findElement(By.xpath("(//td[@class='small'])[3]"));
		   if(EXc.isDisplayed())
			   System.out.println("EXCHANGE COLLECTOR LOGO IS DISPLAYED");
		   else
			   System.out.println("EXCHANGE COLLECTOR LOGO IS DISPLAYED");
		// output plugin logo
		   WebElement PLo = driver.findElement(By.xpath("(//td[@class='small'])[2]"));
		   if(PLo.isDisplayed())
			   System.out.println("OUTPUT PLUGIN LOGO IS DISPLAYED");
		   else
			   System.out.println("OUTPUT PLUGIN LOGO IS DISPLAYED");
		// verify text 
		   WebElement ToB = driver.findElement(By.xpath("//div[@class='poweredBy']"));
		   String AcToB = ToB.getText();
		   String ExToB = "Powered by vtiger CRM - 5.4.0";
		   if(AcToB.equals(ToB))
			   System.out.println("TEXT MATCHING");
		   else
			   System.out.println("TEXT NOT MATCHING");
		   // verify username header 
		   WebElement UHd = driver.findElement(By.xpath("(//div[@class='label'])[1]"));
		   String UsrH = UHd.getText();
		   if(UsrH.equals("User Name"))
		   System.out.println("USERNAME HEADER IS MATCHING");
		   else
			   System.out.println("USERNAME HEADER IS NOT MATCHING");
		// verify password header 
		   WebElement PHd = driver.findElement(By.xpath("(//div[@class='label'])[2]"));
		   String PsrH = PHd.getText();
		   if(PsrH.equals("Password"))
		   System.out.println("PASSWORD HEADER IS MATCHING");
		   else
			   System.out.println("PASSWORD HEADER IS NOT MATCHING");
		   // Verifying user textbox and password are enable and displayed
		   WebElement UserTB = driver.findElement(By.xpath("//input[@type='text']"));
		   WebElement PassTB = driver.findElement(By.xpath("//input[@type='password']"));
		   if(UserTB.isDisplayed()&& UserTB.isEnabled()&&PassTB.isDisplayed()&&PassTB.isEnabled())
			   System.out.println("USERNAME AND PASSWORD TEXTBOXES ARE ENABLED AND DISPLAYED");
		   else
			   System.out.println("USERNAME AND PASSWORD TEXTBOXES ARE NOT ENABLED AND DISPLAYED");
		   UserTB.sendKeys("admin");
		   PassTB.sendKeys("admin");
		   WebElement Lg = driver.findElement(By.xpath("//input[@type='submit']"));
		   Lg.click();
	    

	}

}
