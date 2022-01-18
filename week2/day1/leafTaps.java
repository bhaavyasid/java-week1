package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafTaps {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
   WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("DemoSalesManager");
       driver.findElement(By.id("password")).sendKeys("crmsfa");
       driver.findElement(By.className("decorativeSubmit")).click();
       driver.findElement(By.linkText("CRM/SFA")).click();
      driver.findElement(By.linkText("Leads")).click();
      driver.findElement(By.linkText("Create Lead")).click();
      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("bhavya");
      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sid");
		
		// Select Source from dropdown
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd = new Select(source);
		
		dd.selectByVisibleText("Conference");
		// Click on Create LEad button
  		WebElement Marketing =driver.findElement(By.id("createLeadForm_marketingCampaignId"));
  		Select dd1 = new Select(Marketing);
  		dd1.selectByVisibleText("Road and Track");
  		
  		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("bhavi");
  		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("sid");
  		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("testing");
  		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3l");

  		WebElement PreferredCurrency =driver.findElement(By.id("createLeadForm_currencyUomId"));
  		Select dd2= new Select( PreferredCurrency);
  		dd2.selectByVisibleText("TMM - Turkmenistani Manat");
  		
  		WebElement Industry =driver.findElement(By.id("createLeadForm_industryEnumId"));
  		Select dd3= new Select( Industry);
  		dd3.selectByVisibleText("Computer Hardware");
  		
  		WebElement Ownership =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
  		Select dd4= new Select( Ownership);
  		dd4.selectByVisibleText("LLC/LLP");
  		
  		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("sree");
  		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
  		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
  		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("heartin");
  		driver.findElement(By.id("createLeadForm_description")).sendKeys("some discription");
  		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("important things to be noted");
  		//contact information
  		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("578483");
  		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9785345232");
  		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+87");
  	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Jijin");
  	    //driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bhavya@gmail.com");
  	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
  	    //primary address
  	    
  	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("buddu");
  	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("vrishu");
  	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("tpt");
  	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("ctr");
  	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("andhra");
  	   driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("632001");
  	  driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("vellore");
	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("64543");
	    WebElement State =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd5= new Select( State);
		dd5.selectByVisibleText("Arizona");
  	    WebElement Country =driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd6= new Select( Country);
		dd6.selectByVisibleText("Afghanistan");
  	    
  		driver.findElement(By.name("submitButton")).click();
  		// Close the BRowser
  		driver.close();
  		        
	}

}




