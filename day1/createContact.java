package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createContact {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver= new ChromeDriver();
			 driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
		   WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("DemoSalesManager");
	           driver.findElement(By.id("password")).sendKeys("crmsfa");
	           driver.findElement(By.className("decorativeSubmit")).click();
	           driver.findElement(By.linkText("CRM/SFA")).click();
	          driver.findElement(By.linkText("Contacts")).click();
	          driver.findElement(By.linkText("Create Contact")).click();
	          
	          driver.findElement(By.id("firstNameField")).sendKeys("bhavya");
	          driver.findElement(By.id("lastNameField")).sendKeys("r");
	          driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sid");
	          driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("sree");
	          driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
	          driver.findElement(By.id("createContactForm_description")).sendKeys("some discription");
	          driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("bhavyashree2894@gmail.com");
	          WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	  		   Select dd = new Select(state);
	  		  dd.selectByVisibleText("New York");
	  		  
	  		
	  		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	  		
	  		driver.findElement(By.xpath("//a[text()='Edit']"));
	  		
	  		 //String Value = Description.getAttribute("attribute name");
	  	   // System.out.println(Value);
	  	   // Description.clear();
	  	    //Description.sendKeys(Value);
	  		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("new files added");
	  		
	  		// Close the BRowser
	  		//
	  		driver.close();
	  		        
		}

	}

