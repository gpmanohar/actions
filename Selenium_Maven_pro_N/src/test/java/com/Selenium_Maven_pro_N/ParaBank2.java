package com.Selenium_Maven_pro_N;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBank2 {

	public static void main(String[] args) throws Exception {
		Random r = new Random();
		int RAND = r.nextInt(1000);
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		String Matitl = driver.getCurrentUrl();
		System.out.println(Matitl);
		//verify Title 
		String Til = driver.getTitle();
		System.out.println(Til);
		// verify logo
		WebElement logo = driver.findElement(By.xpath("//img[@title='ParaBank']"));
		if(logo.isDisplayed())
			System.out.println("LOGO IS DISPLAYED");
		else
			System.out.println("LOGO IS NOT DISPLAYED");
		//verify logo caption
		WebElement Lcap = driver.findElement(By.xpath("//p[@class='caption']"));
		String Lc = Lcap.getText();
		String ll = "Experience the difference";
		if(Lc.equals(ll))
			System.out.println("CAPTION IS MATCHING");
		else
			System.out.println("CAPTION IS NOT MATCHING");
		// Verify login header 
		WebElement Lhed = driver.findElement(By.xpath("//h2[text()='Customer Login']"));
		String Hed = Lhed.getText();
		String Had = "Customer Login";
		if(Hed.equals(Had))
			System.out.println("HEADER IS MATCHING");
		else
			System.out.println("HEADER IS NOT MATCHING");
		// verify header panel 
		WebElement HPn = driver.findElement(By.xpath("//div[@id='headerPanel']"));
		if(HPn.isDisplayed())
			System.out.println("HEADER PANEL IS DISPLAYED");
		else
			System.out.println("HEADER PANEL IS NOT DISPLAYED");
		// verify bg 
		WebElement bg =driver.findElement(By.xpath("//div[@id='headerPanel']"));
		if(bg.isDisplayed())
			System.out.println("BACKGROUND IMAGE IS DISPLAYED");
		else
			System.out.println("BACKGROUND IMAGE IS NOT DISPLAYED");
		//verify solution label 
		WebElement soL = driver.findElement(By.xpath("//li[@class='Solutions']"));
		String Sl = soL.getText();
		String Sll ="Solutions";
		if(Sl.equals(Sll))
			System.out.println("SOLUTION LABEL IS WORKING ");
		else
			System.out.println("SOLUTION LABEL IS NOT WORKING ");
		//verify Aboutus label 
				WebElement Aus = driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
				String Au = Aus.getText();
				String EAu ="About Us";
				if(Au.equals(EAu))
					System.out.println("ABOUTUS LABEL IS WORKING ");
				else
					System.out.println("ABOUTUS LABEL IS NOT WORKING ");
				//verify Services label 
				WebElement sRV = driver.findElement(By.xpath("(//a[text()='Services'])[1]"));
				String aSV = sRV.getText();
				String ESv ="Services";
				if(aSV.equals(ESv))
					System.out.println("SERVICES LABEL IS WORKING ");
				else
					System.out.println("SERVICES LABEL IS NOT WORKING ");
				//verify products label 
				WebElement Prd = driver.findElement(By.xpath("(//a[text()='Products'])[1]"));
				String Apr = Prd.getText();
				String Epr ="Products";
				if(Apr.equals(Epr))
					System.out.println("PRODUCTS LABEL IS WORKING ");
				else
					System.out.println("PRODUCTS LABEL IS NOT WORKING "); 
				//verify Locations label 
				WebElement Loc = driver.findElement(By.xpath("(//a[text()='Locations'])[1]"));
				String Alc = Loc.getText();
				String Elc ="Locations";
				if(Apr.equals(Epr))
					System.out.println("PRODUCTS LABEL IS WORKING ");
				else
					System.out.println("PRODUCTS LABEL IS NOT WORKING ");
				// verify username header 
		        WebElement Uhd = driver.findElement(By.xpath("//b[text()='Username']"));
		        String Auhd = Uhd.getText();
		        String Ehd ="Username";
		        if(Auhd.equals(Ehd))
		        	System.out.println("USERNAME HEADER IS WORKING");
		        else
		        	System.out.println("USERNAME HEADER IS NOT WORKING");
		     // verify password header 
		        WebElement Phd = driver.findElement(By.xpath("//b[text()='Password']"));
		        String Puhd = Phd.getText();
		        String PhdD ="Password";
		        if(Puhd.equals(PhdD))
		        	System.out.println("PASSWORD HEADER IS WORKING");
		        else
		        	System.out.println("PASSWORD HEADER IS NOT WORKING");
		        //verify user textbox and password textbox
		        WebElement Usertextbox = driver.findElement(By.xpath("//input[@type='text']"));
		        WebElement Passtextbox = driver.findElement(By.xpath("//input[@type='password']"));
		        if(Usertextbox.isDisplayed() && Usertextbox.isEnabled() && Passtextbox.isDisplayed() && Passtextbox.isEnabled())
		        	System.out.println("USERNAME AND PASSWORD TEXT BOXES ARE ENABLED AND DISPLAYED ");
		        else
		        	System.out.println("USERNAME AND PASSWORD TEXT BOXES ARE NOT ENABLED AND DISPLAYED ");
		        // create user 
		        WebElement Crt = driver.findElement(By.xpath("//a[text()='Register']"));
		        Crt.click();
		        // Enter details 
		        WebElement Fname = driver.findElement(By.xpath("//input[@id='customer.firstName']"));
		        Fname.sendKeys("Ch");
		        WebElement Lname = driver.findElement(By.xpath("//input[@id='customer.lastName']"));
		        Lname.sendKeys("Rahul");
		        WebElement Addres = driver.findElement(By.xpath("//input[@id='customer.address.street']"));
		        Addres.sendKeys("Chakripuram ECIL");
		        WebElement City = driver.findElement(By.xpath("//input[@id='customer.address.city']"));
		        City.sendKeys("Hyderabad");
		        WebElement Stt = driver.findElement(By.xpath("//input[@id='customer.address.state']"));
		        Stt.sendKeys("Telangana");
		        WebElement Ztt = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
		        Ztt.sendKeys("500062");
		        WebElement Phn = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
		        Phn.sendKeys("9123456780");
		        WebElement Ssn = driver.findElement(By.xpath("//input[@id='customer.ssn']"));
		        Ssn.sendKeys("1234");
		        WebElement Usr = driver.findElement(By.xpath("//input[@id='customer.username']"));
		        Usr.sendKeys("rahul"+RAND);
		        WebElement Psd = driver.findElement(By.xpath("//input[@id='customer.password']"));
		        Psd.sendKeys("rahul");
		        WebElement CPsd = driver.findElement(By.xpath("//input[@id='repeatedPassword']"));
		        CPsd.sendKeys("rahul");
		        WebElement Reg = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		        Reg.click();
		        // Account overview title 
		        WebElement AAov = driver.findElement(By.xpath("//h1[@class='title']"));
		        if(AAov.isDisplayed())
		        
		        //String Ao = AAov.getText();
		        //String Eo = "Accounts Overview";
		        
		        	System.out.println("ACCOUNTS OVRVIEW IS DISPLAYED ");
		        else
		        	System.out.println("ACCOUNTS OVRVIEW IS NOT DISPLAYED");
		        
		        WebElement OAc = driver.findElement(By.xpath("//a[text()='Open New Account']"));
		        OAc.click();
		        WebElement Sd = driver.findElement(By.xpath("//select[@id='type']"));
		        Sd.click();
		        Select s = new Select(Sd);
		        s.selectByVisibleText("SAVINGS");
		        WebElement An = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
		        An.click();
		        WebElement Sub = driver.findElement(By.xpath("//input[@type='submit' and @class='button']"));
		        Sub.click();
		        //confirm 
		        WebElement CCms = driver.findElement(By.xpath("//h1[@class='title']"));
		       
		        
		        if(CCms.isDisplayed())
		        	System.out.println("CONGRATULATIONS, YOUR ACCOUNT IS OPEN MESSAGE DISPLAYED");
		        else
		        	System.out.println("CONGRATULATIONS, YOUR ACCOUNT IS OPEN NOT MESSAGE DISPLAYED");
		        //verify account number
		        /*WebElement Nac = driver.findElement(By.xpath("//b[text()='Your new account number:']"));
		        if(Nac.isDisplayed())
		        	System.out.println("YOUR NEW ACCOUNT NUMBER IS DISPLAYED");
		        else
		        	System.out.println("YOUR NEW ACCOUNT NUMBER IS NOT DISPLAYED");*/
		        // ac num
		        //WebElement PAn = driver.findElement(By.xpath("//a[@id='newAccountId']"));
		        //Thread.sleep(8000);
		        List<WebElement> PAn = driver.findElements(By.xpath("//a[@id='newAccountId']"));
		        for(WebElement all:PAn)
		        {
		        	String PNData = all.getText();
		        	System.out.println("YOUR NEW ACCOUNT NUMBER IS: -"+PNData);
		        }
		        //click Fund transfer
		        WebElement Ftr = driver.findElement(By.xpath("//a[text()='Transfer Funds']"));
		        Ftr.click();
		        //enter fund details
		        WebElement FHad = driver.findElement(By.xpath("//b[text()='Amount:']"));
		        if(FHad.isDisplayed())
		        	System.out.println("AMOUNT HEADER IS DISPLAYED");
		        else
		        	System.out.println("AMOUNT HEADER IS NOT DISPLAYED");
		        //Enter amount
		        WebElement EAt = driver.findElement(By.xpath("//input[@id='amount']"));
		        EAt.sendKeys("5000");
		        /* select from account
		        WebElement Fac = driver.findElement(By.xpath("//select[@ng-init='getAccounts()']"));
		        Fac.click();
		        
		        Select f = new Select(Fac);
		        f.selectByVisibleText("13788"); */
		        // click on submit 
		        Thread.sleep(5000);
		        WebElement Suub = driver.findElement(By.xpath("//input[@class='button']"));
		        Suub.click();
		        // bill pay 
		        WebElement Bpl = driver.findElement(By.xpath("//a[text()='Bill Pay']"));
		        Bpl.click();
		        WebElement VHBpl = driver.findElement(By.xpath("//h1[text()='Bill Payment Service']"));
		        if(VHBpl.isDisplayed())
		        	System.out.println("HEADER IS DISPLAYED");
		        else
		        	System.out.println("HEADER IS NOT DISPLAYED");
		        WebElement Hepe = driver.findElement(By.xpath("//p[text()='Enter payee information']"));
		        if(Hepe.isDisplayed())
		        	System.out.println("PAYEE INFORMATION DISPLAYED");
		        else
		        	System.out.println("PAYEE INFORMATION NOT DISPLAYED");
		        // Enter payee details 
		        WebElement EFp = driver.findElement(By.xpath("//input[@name='payee.name']"));
		        EFp.sendKeys("MANOHAR G");
		        WebElement aFp = driver.findElement(By.xpath("//input[@name='payee.address.street']"));
		        aFp.sendKeys("Miyapur");
		        WebElement cFp = driver.findElement(By.xpath("//input[@name='payee.address.city']"));
		        cFp.sendKeys("Hyderabad");
		        WebElement sFp = driver.findElement(By.xpath("//input[@name='payee.address.state']"));
		        sFp.sendKeys("Hyderabad");
		        WebElement zFp = driver.findElement(By.xpath("//input[@name='payee.address.zipCode']"));
		        zFp.sendKeys("500049");
		        WebElement PFp = driver.findElement(By.xpath("//input[@name='payee.phoneNumber']"));
		        PFp.sendKeys("985500");
		        WebElement anFp = driver.findElement(By.xpath("//input[@name='payee.accountNumber']"));
		        anFp.sendKeys("68564565");
		        WebElement vnFp = driver.findElement(By.xpath("//input[@name='verifyAccount']"));
		        vnFp.sendKeys("68564565");
		        WebElement AMtFp = driver.findElement(By.xpath("//input[@name='amount']"));
		        AMtFp.sendKeys("5000");
		        WebElement FaDD = driver.findElement(By.xpath("//input[@type='submit']"));
		        FaDD.click();
		        // bill payment complete header 
		        WebElement BpH = driver.findElement(By.xpath("(//h1[@class='title'])[1]"));
		        if(BpH.isDisplayed())
		        	System.out.println("BILL PAYMENT HEADER IS DISPLAYED");
		        else
		        	System.out.println("BILL PAYMENT HEADER IS NOT DISPLAYED");
		        //list of details 
		        Thread.sleep(3000);
		        List<WebElement> naA =driver.findElements(By.xpath("//span[@class='ng-binding']"));
		        for(WebElement nAwe : naA )
		        {
		        	String NAData = nAwe.getText();
		        	System.out.println("BILL PAID TO , AMOUNT , FROM ACCOUNT "+NAData);
		        }
		        // verify Message 
		        WebElement Msg = driver.findElement(By.xpath("//p[text()='See Account Activity for more details.']"));
		        if(Msg.isDisplayed())
		        	System.out.println("ACCOUNT DETAILS MESSAGE DISPLAYED");
		        else
		        	System.out.println("ACCOUNT DETAILS MESSAGE NOT DISPLAYED");
		        // Click update contact info
		        WebElement Cinf = driver.findElement(By.xpath("//a[text()='Update Contact Info']"));
		        Cinf.click();
		        // Enter details
		        WebElement En = driver.findElement(By.xpath("//input[@name='customer.firstName']"));
		        En.sendKeys("User");
		        WebElement LEn = driver.findElement(By.xpath("//input[@name='customer.lastName']"));
		        LEn.sendKeys("Test");
		        WebElement Ald= driver.findElement(By.xpath("//input[@name='customer.address.street']"));
		        Ald.sendKeys("Vasanth Vihar");
		        WebElement Ccld= driver.findElement(By.xpath("//input[@name='customer.address.city']"));
		        Ccld.sendKeys("Delhi");
		        WebElement Sld= driver.findElement(By.xpath("//input[@name='customer.address.state']"));
		        Sld.sendKeys("Delhi");
		        WebElement Zld= driver.findElement(By.xpath("//input[@name='customer.address.zipCode']"));
		        Zld.sendKeys("400085");
		        WebElement pld= driver.findElement(By.xpath("//input[@name='customer.phoneNumber']"));
		        pld.sendKeys("958572");
		        Thread.sleep(3000);
		        WebElement Cupd = driver.findElement(By.xpath("//input[@type='submit']"));
		        Cupd.click();
		        WebElement MHdss = driver.findElement(By.xpath("//h1[@class='title']"));
		        if(MHdss.isDisplayed())
		        	System.out.println("PROFILE UPDATED SUCCESSFULLY");
		        else
		        	System.out.println("PROFILE NOT UPDATED SUCCESSFULLY");
		        
		       // list of update headers
		        
		       /* List<WebElement> Lnams = driver.findElements(By.xpath("//td[@align='right']"));
		        for(WebElement Nw :Lnams)
		        {
		        	String Ldata = Nw.getText();
		        	System.out.println(Ldata);  
		        			
		        	
		        }
		        
		        List<WebElement> Rnams = driver.findElements(By.xpath("//td[@width='20%']"));
		        for(WebElement Rw :Rnams)
		        {
		        	String Ldata = Rw.getText();
		        	System.out.println(Ldata); 
		        			
		        	
		        } */
		      // click on loan
		        WebElement Loan = driver.findElement(By.xpath("//a[text()='Request Loan']"));
		        Loan.click();
		        // enter details of loan 
		        WebElement EdL = driver.findElement(By.xpath("//input[@id='amount']"));
		        EdL.sendKeys("25000");
		        
		        WebElement DdL = driver.findElement(By.xpath("//input[@id='downPayment']"));
		        DdL.sendKeys("5000");
		        WebElement EdLd = driver.findElement(By.xpath("//input[@type='submit']"));
		        EdLd.click();
		        
		        WebElement Lrp = driver.findElement(By.xpath("//h1[@class='title']"));
		        if(Lrp.isDisplayed())
		        	System.out.println("LOAN REQUEST PROCESSED HEADER DISPLAYED");
		        else
		        	System.out.println("LOAN REQUEST PROCESSED HEADER NOT DISPLAYED");
		        
		        List<WebElement> Ddeta =driver.findElements(By.xpath("//div[@class='ng-scope']"));
		        for(WebElement llrp :Ddeta)
		        {
		        	String LrpDate = llrp.getText();
		        	System.out.println(LrpDate);
		        }
		        
		        List<WebElement> Newdeta =driver.findElements(By.xpath("//a[@id='newAccountId']"));
		        for(WebElement lelrp :Newdeta)
		        {
		        	String LepDate = lelrp.getText();
		        	System.out.println(LepDate);
		        }
		        // click on logout
		        WebElement Lgout = driver.findElement(By.xpath("//a[text()='Log Out']"));
		        Lgout.click();
		    
		        		
		        
		        //(//div[@class="ng-scope"])[1]
		        		
		        		
		        
		        
		    
				
				
				
				
				
				
				
				//driver.close();
				
		
		
		
		
		

	}

}
