package com.Selenium_Maven_pro_N;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bank_Reg {

	public static void main(String[] args) throws Exception{
		
		Random r = new Random();
		int RANNUM = r.nextInt(1000);
		
		
		  WebDriverManager.firefoxdriver().setup(); 
		  WebDriver driver = new FirefoxDriver();
		  

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		 
		
		
			/*
			 * ChromeOptions option = new ChromeOptions ();
			 * option.addArguments("--remote-allow-origins=*");
			 * WebDriverManager.chromedriver().setup(); WebDriver driver=new
			 * ChromeDriver(option);
			 */
		 
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		// verify the title 
		String Mtitle = driver.getTitle();
		if(Mtitle.equals("ParaBank | Welcome | Online Banking"))
		{
			System.out.println("TITLE IS MATCHING");
		}
		else
		{
			System.out.println("TITLE IS NOT MATCHING");
		}
		
		
    	
		
    	
		//verify login header 
		WebElement Lheader = driver.findElement(By.xpath("//h2[text()='Customer Login']"));
		String ALHead = Lheader.getText();
		String ALh = "Customer Login";
				if(ALHead.equals(ALh))
		{
			System.out.println("LOGIN HEADER IS MATCHING");
		}
		else
		{
			System.out.println("LOGIN HEADER IS NOT MATCHING");
		}
		//verifying username header 
		WebElement userHeader = driver.findElement(By.xpath("//b[text()='Username']"));
	    String Uhead = userHeader.getText();
	    String UH = "Username";
	    if(Uhead.equals(UH))
	    {
	    	System.out.println("USERNAME HEADER IS MATCHING");
	    }
	    else
	    {
	    	System.out.println("USERNAME HEADER IS NOT MATCHING");
	    }
	    // verifying password header 
	    WebElement passHeader = driver.findElement(By.xpath("//b[text()='Password']"));
	    String Pheader =passHeader.getText();
	    String EPhead = "Password";
	    if(Pheader.equals(EPhead))
	    {
	    	System.out.println("PASSWORD HEADER IS MATCHING");
	    }
	    else
	    {
	    	System.out.println("PASSWORD HEADER IS NOT MATCHING");
	    }
	    //Verifying link displayed 
	    WebElement Fgot = driver.findElement(By.xpath("//a[text()='Forgot login info?']"));
	    if(Fgot.isDisplayed())
	    {
	    	System.out.println("LINK DISPLAYED");
	    }
	    else
	    {
	    	System.out.println("LINK NOT DISPLAYED");
	    }
	    //verifying forgot link displayed 
	    WebElement RegLink = driver.findElement(By.xpath("//a[text()='Register']"));
	    if(RegLink.isDisplayed())
	    {
	    	System.out.println("REGISTER LINK IS DISPLAYED");
	    }
	    else
	    {
	    	System.out.println("REGISTER LINK IS NOT DISPLAYED");
	    }
	    
	    
	    
	    // Verifying Forgot link 
	    WebElement FHlnk = driver.findElement(By.xpath("//a[text()='Forgot login info?']"));
	    String Actlink = FHlnk.getAttribute("href");
	    String Explnkk = "lookup.htm;jsessionid=4C01966F796421BAA035DE2A4C3B31F4";
	    if(Actlink.equals(Explnkk))
	    {
	    	System.out.println("HYPERLINK WORKED");
	    }
	    else
	    {
	    	System.out.println("HYPERLINK NOT WORKED");
	    }
	    
	    
	    //verifying solution module header 
	    WebElement Sollink = driver.findElement(By.xpath("//li[text()='Solutions']"));
	    String SLK = Sollink.getText();
	    if(Sollink.isDisplayed()&& SLK.equals("Solutions"))
	    {
	    	System.out.println("SOLUTION MODULE IS DISPLAYED AND TEXT MATCHING");
	    }
	    else
	    {
	    	System.out.println("SOLUTION MODULE IS NOT DISPLAYED AND TEXT ARE NOT MATCHING");
	    }
	    
	  //verifying aboutus module header 
	    WebElement Abtus = driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
	    String Abt = Abtus.getText();
	    if(Abtus.isDisplayed()&& Abt.equals("About Us"))
	    {
	    	System.out.println("ABOUTUS MODULE IS DISPLAYED AND TEXT MATCHING");
	    }
	    else
	    {
	    	System.out.println("ABOUTUS MODULE IS NOT DISPLAYED AND TEXT ARE NOT MATCHING");
	    }
	  //verifying services module header 
	    WebElement Service = driver.findElement(By.xpath("(//a[text()='Services'])[1]"));
	    String Srv = Service.getText();
	    if(Service.isDisplayed()&& Srv.equals("Services"))
	    {
	    	System.out.println("SERVICES MODULE IS NOT DISPLAYED AND TEXT MATCHING");
	    }
	    else
	    {
	    	System.out.println("SERVICES MODULE IS NOT DISPLAYED AND TEXT ARE NOT MATCHING");
	    }
	    // verifying products module header 
	    WebElement Products = driver.findElement(By.xpath("(//a[text()='Products'])[1]"));
	    String prdt = Products.getText();
	    if(Products.isDisplayed()&& prdt.equals("Products"))
	    {
	    	System.out.println("PRODUCTS MODULE IS DISPLAYED AND TEXT MATCHING");
	    }
	    else
	    {
	    	System.out.println("PRODUCTS MODULE NOT IS DISPLAYED AND TEXT ARE NOT MATCHING");
	    }
	    // verifying the location module header 
	    WebElement Loc = driver.findElement(By.xpath("(//a[text()='Locations'])[1]"));
	    String locat = Loc.getText();
	    if(Loc.isDisplayed()&& locat.equals("Locations"))
	    {
	    	System.out.println("LOCATION MODULE IS DISPLAYED AND TEXT MATCHING");
	    }
	    else
	    {
	    	System.out.println("LOCATION MODULE NOT IS DISPLAYED AND TEXT ARE NOT MATCHING");
	    }
	    //verifying the admin module header 
	    WebElement Admin = driver.findElement(By.xpath("//a[text()='Admin Page']"));
	    String Adm = Admin.getText();
	    if(Admin.isDisplayed() && Adm.equals("Admin Page"))
	    {
	    	System.out.println("ADMIN PAGE MODULE IS DISPLAYED AND TEXT MATCHING");
	    }
	    else
	    	{
	    		System.out.println("ADMIN PAGE MODULE NOT IS DISPLAYED AND TEXT ARE NOT MATCHING");
	    	}
	    
	    // Verifying bg 
	    WebElement BG = driver.findElement(By.xpath("//div[@id='headerPanel']"));
	    if(BG.isDisplayed())
	    {
	    	System.out.println("BG IS DISPLAYED");
	    }
	    else
	    {
	    	System.out.println("BG IS NOT DISPLAYED");
	    }
	    //verifying home icon
	    WebElement Hicon = driver.findElement(By.xpath("//a[text()='home']"));
	    if(Hicon.isDisplayed())
	    {
	    	System.out.println("HOME ICON IS DISPLAYED");
	    }
	    else
	    {
	    	System.out.println("HOME ICON IS NOT DISPLAYED");
	    }
	    //verifying about icon
	    WebElement ABicon = driver.findElement(By.xpath("//a[text()='about']"));
	    if(ABicon.isDisplayed())
	    {
	    	System.out.println("ABOUT ICON IS DISPLAYED");
	    }
	    else
	    {
	    	System.out.println("ABOUT ICON IS NOT DISPLAYED");
	    }
	    //
	    WebElement COicon = driver.findElement(By.xpath("//a[text()='contact']"));
	    if(COicon.isDisplayed())
	    {
	    	System.out.println("CONTACT ICON IS DISPLAYED");
	    }
	    else
	    {
	    	System.out.println("CONTACT ICON IS NOT DISPLAYED");
	    }
	    // CLICK ON REGISTER
	    WebElement RegButton = driver.findElement(By.xpath("//a[text()='Register']"));
	    RegButton.click();
	    // register to ac
	    WebElement Fname = driver.findElement(By.xpath("//input[@name='customer.firstName']"));
	    Fname.sendKeys("G");
	    
	    WebElement Lname = driver.findElement(By.xpath("//input[@name='customer.lastName']"));
	    Lname.sendKeys("Manohar");
	    
	    WebElement Address = driver.findElement(By.xpath("//input[@name='customer.address.street']"));
	    Address.sendKeys("Widia Colony Miyapur");
	   
	    WebElement City= driver.findElement(By.xpath("//input[@name='customer.address.city']"));
	    City.sendKeys("Hyderabad");
	  
	    WebElement State= driver.findElement(By.xpath("//input[@name='customer.address.state']"));
	    State.sendKeys("Telangana");
	
	    WebElement Zip= driver.findElement(By.xpath("//input[@name='customer.address.zipCode']"));
	    Zip.sendKeys("500049");
	 
	    WebElement Mobile= driver.findElement(By.xpath("//input[@name='customer.phoneNumber']"));
	    Mobile.sendKeys("9009845985");
	
	    WebElement Ssin= driver.findElement(By.xpath("//input[@name='customer.ssn']"));
	    Ssin.sendKeys("245487");
	 
	    WebElement UnameR= driver.findElement(By.xpath("//input[@name='customer.username']"));
	    UnameR.sendKeys("manu");
	    
	 
	    WebElement UpassR= driver.findElement(By.xpath("//input[@name='customer.password']"));
	    UpassR.sendKeys("manu");
	 
	    WebElement Cpass= driver.findElement(By.xpath("//input[@name='repeatedPassword']"));
	    Cpass.sendKeys("manu");
	    WebElement ClcReg= driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
	   
	    ClcReg.click();
	    
	    WebElement ConfMsg = driver.findElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']"));
	    String MSG = ConfMsg.getText();
	    if(MSG.equals("Your account was created successfully. You are now logged in."))
	    {
	    	System.out.println("ACCOUNT CREATED SUCCESFULLY  --THANK YOU--");
	    }
	    else
	    {
	    	System.out.println("ACCOUNT NOT CREATED SUCCESFULLY");
	    }
	    
	    // go to home 
	    //WebElement CHome = driver.findElement(By.xpath("(//a[@href='/parabank/index.htm'])[2]"));
	    //CHome.click();
	    WebElement Aov = driver.findElement(By.xpath("//a[@href='/parabank/overview.htm']"));
	    Aov.click();
	    Thread.sleep(3000);
	    WebElement OverV = driver.findElement(By.xpath("//div[@ng-if='showOverview']"));
	    if(OverV.isDisplayed())
	    {
	    	System.out.println("ACCOUNT OVER VIEW IS DISPLAYED");
	    }
	    else
	    {
	    	System.out.println("ACCOUNTS OVER VIEW IS NOT DISPLAYED");
	    }
	    WebElement Bal = driver.findElement(By.xpath(" //b[text()='Total']/../following-sibling::td[1]/b"));
	    if(Bal.isDisplayed())
	    {
	    	System.out.println("ACCOUNT BALANCE IS PRINTING SUCCESFULLY");
	    }
	    else
	    {
	    	System.out.println("PROBLEM IN PRINTING ACCOUNT BALANCE");
	    }
	    Thread.sleep(5000);
	    WebElement TFD = driver.findElement(By.xpath("//a[@href='/parabank/transfer.htm']"));
	    TFD.click();
	    Thread.sleep(5000);
	    WebElement Amount = driver.findElement(By.xpath("//input[@name='input']"));
	    Amount.sendKeys("1000");
	    WebElement Transf = driver.findElement(By.xpath("//input[@type='submit']"));
	    Transf.click();
	    Thread.sleep(5000);
	    WebElement TrnCmp = driver.findElement(By.xpath("//h1[text()='Transfer Complete!']"));
	    String Transfer = TrnCmp.getText();
	    if(Transfer.equals("Transfer Complete!"))
	    {
	    	System.out.println("AMOUNT TRANSFER SUCCESFULLY");
	    }
	    else
	    {
	    	System.out.println("AMOUNT IS NOT TRANFORMED");
	    }
	    WebElement Update = driver.findElement(By.xpath("//a[text()='Update Contact Info']"));
	    Update.click();
	    WebElement UpdatePH = driver.findElement(By.xpath("//input[@name='customer.address.city']"));
	    UpdatePH.clear();
	    UpdatePH.sendKeys("Mumbai");
	    WebElement CUpdt = driver.findElement(By.xpath("//input[@type='submit']"));
	    CUpdt.clear();
	    WebElement PuMsg = driver.findElement(By.xpath("//p[text()='Your updated address and phone number have been added to the system. ']"));
	    String Profileup = PuMsg.getText();
	    if(PuMsg.isDisplayed()&& Profileup.equals("Your updated address and phone number have been added to the system. "))
	    {
	    	System.out.println("UPDATE MESSAGE DISPLAYED AND PROFILE UPDATE SUCCESFULLY");
	    }
	    else
	    {
	    	System.out.println("NOT UPDATED ");
	    }
	    	
	    
	    	
			
	    	
	    	    	
	    	
	    }
	    	

	}


