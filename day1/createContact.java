package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createContact {

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
	          driver.findElement(By.linkText("Contacts")).click();
	          driver.findElement(By.linkText("Create Contact")).click();
	          
	          driver.findElement(By.id("firstNameField")).sendKeys("bhavya");
	          driver.findElement(By.id("lastNameField")).sendKeys("r");
	          driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sid");
	          driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("sree");
	          driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
	          
	          driver.findElement(By.id("createContactForm_description")).sendKeys("bhavyashree");
	          driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("bhavyashree@gmail.com");
	          WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	  		   Select dd = new Select(state);
	  		  dd.selectByVisibleText("New York");
	  		driver.findElement(By.name("submitButton")).click();
	  		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	  		  driver.findElement(By.id("updateContactForm_description")).clear();
	  		
	  
	  		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("new files added");
	  		
	  		driver.findElement(By.name("submitButton")).click();
	  		
	  		// Close the BRowser createContactForm_description
	  		//
	  		driver.close();
	  		        
		}

	}

