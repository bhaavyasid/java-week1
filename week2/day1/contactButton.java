package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class contactButton {
             
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
	   WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
           driver.findElement(By.id("password")).sendKeys("crmsfa");
           //input[@class='inputlogin' and @id='password' and @id='username']
           driver.findElement(By.className("decorativeSubmit")).click();
           driver.findElement(By.linkText("CRM/SFA")).click();
           //a[text()='CRM/SFA']
          driver.findElement(By.linkText("Contacts")).click();
          //a[text()='contacts']
          driver.findElement(By.linkText("Create Contact")).click();
          //[contains(@
          driver.findElement(By.id("firstNameField")).sendKeys("bhavya");
          driver.findElement(By.id("lastNameField")).sendKeys("r");
          driver.findElement(By.name("submitButton")).click();
  		driver.close();
  		        
	}

}
