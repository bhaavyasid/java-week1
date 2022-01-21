package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnalert{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //launch webdriver
		WebDriverManager.chromedriver().setup();
		
		//launch chrome driver
		ChromeDriver driver= new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//load url
		driver.get("http://www.leafground.com/pages/Alert.html");
//click on alert box
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(3000);
		//accept alert
Alert ele = driver.switchTo().alert();
	       //to get text
	       String text = ele.getText();
	       //print text
	       System.out.println(text);
	       //click the alert as ok        
	       ele.accept();
//click on confirm box
	       driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	       org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
	       //to get text                 
	       String text1 = alert1.getText();
	       //print text
	       System.out.println(text1);
	       //click the alert as ok
	       alert1.accept();
//click on prompt box
	       driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	   Alert ale = driver.switchTo().alert();
	       //to get text                 
	       String text2 = alert1.getText();
	       //print text
	       System.out.println(text2);
	       //enter text to alert box
	       ale.sendKeys("hellobhavi");
	       //click the alert as ok
	       ale.accept();
//line break
	       
	       driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click(); 
	       org.openqa.selenium.Alert ale2 = driver.switchTo().alert();
	       String text3=alert1.getText();
	       //print text
	       System.out.println(text3);
	       
	       ale2.accept();
//sweet alert
	       driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
	       driver.findElement(By.xpath("//button[text()='OK']")).click();
	       
		
	}

}
