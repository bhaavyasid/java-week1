package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowFrames {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		//Step1: Load ServiceNow application URL 
		driver.get("https://dev77959.service-now.com/navpage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("gsft_main");
		//Step2: Enter username (Check for frame before entering the username)
			driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		//Step3: Enter password 
			driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("DP537D$YD2jzXJ*");
		//Step4: Click Login
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
			//Step5: Search “incident “ Filter Navigator  
			driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");
		//Step6: Click “All”
			driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();     
			driver.switchTo().frame("gsft_main");
		//Step7: Click New button
			driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("gsft_main");
		//Step8: Select a value for Caller and Enter value for short_description
			driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']/span")).click();
			driver.switchTo().defaultContent();
			Set<String> w = driver.getWindowHandles();
			List<String>list=new ArrayList<String>(w);
			driver.switchTo().window(list.get(1));
		//Step9: Read the incident number and save it a variable
			driver.findElement(By.linkText("Abel Tuter")).click();
			driver.switchTo().window(list.get(0));
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("//a[@id='lookup.incident.short_description']")).click();
			driver.switchTo().defaultContent();
			//driver.switchTo().parentFrame();
			Set<String> w1 = driver.getWindowHandles();
			List<String>list1=new ArrayList<String>(w1);
			driver.switchTo().window(list1.get(1));
			driver.findElement(By.linkText("Issue with email")).click();
			driver.switchTo().window(list1.get(0));
			Thread.sleep(5000);
//Step10: Click on Submit button
			//Read the incident number and save it a variable
			driver.switchTo().frame("gsft_main");
			WebElement f = driver.findElement(By.id("incident.number"));
			String text = f.getAttribute("value");
			System.out.println(text);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			driver.switchTo().defaultContent();
//Step 11: Search the same incident number in the next search screen as below		
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the search.']/following::input[1]")).sendKeys(text,Keys.ENTER);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("gsft_main");
			WebElement f1 = driver.findElement(By.id("incident.number"));
			String text1 = f1.getAttribute("value");
			System.out.println(text1);
			driver.switchTo().defaultContent();
//Step12: Verify the incident is created successful and take snapshot of the created incident.
			if(text1.equals(text)) {
				System.out.println("Incident is verified");
				File source = driver.getScreenshotAs(OutputType.FILE);
				File destination=new File("./images/Incident.png");
				FileUtils.copyFile(source, destination);
				
			   
			
			}
			else
				System.out.println("Incident is unverified");
		//Step10: Click on Submit button
		//Step 11: Search the same incident number in the next search screen as below
		//Step12: Verify the incident is created successful and take snapshot of the created incident.

	}

}
