package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
           driver.findElement(By.linkText("Leads")).click();
           driver.findElement(By.linkText("Create Lead")).click();
	       driver.findElement(By.linkText("Find Leads")).click();
	       driver.findElement(By.xpath("//span[text()='Phone']")).click();
	       driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("vellore");//phonenumber
	       driver.findElement(By.xpath("//button[@type='submit']")).click();//findleads button
	       
	}

}
