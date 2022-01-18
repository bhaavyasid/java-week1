package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class emailTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		         
		driver.manage().window().maximize();
	   WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
           driver.findElement(By.id("password")).sendKeys("crmsfa");
           driver.findElement(By.className("decorativeSubmit")).click();
           driver.findElement(By.linkText("CRM/SFA")).click();
           driver.findElement(By.linkText("Contacts")).click();
          driver.findElement(By.linkText("Find Contacts")).click();
          driver.findElement(By.xpath("//span[text()='Email']")).click();
          driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("babu@testleaf.com");
         driver.findElement(By.tagName("Button")).click();//need to corrected
         //driver.findElement(By.id("password")).sendKeys("crmsfa");
  		 driver.close();
  		        
	}
	
	
}

