package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIncident extends Assignment3Servicenow{
	@Test
	public void createincident() {
	WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	//Step1: Load ServiceNow application URL 
	driver.get("https://dev77959.service-now.com/navpage.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.switchTo().frame("gsft_main");
	//Step2: Enter username (Check for frame before entering the username)
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
	//Step3: Enter password 
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("DP537D$YD2jzXJ*");
	//Step4: Click Login
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		//Step5: Search “incident “ Filter Navigator  
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");
		//step6:create new
		driver.findElement(By.xpath("//div[text()='Create New'][1]")).click();
}
}