package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CherFrame {

	public static void main(String[] args) {
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
				driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("topic is");
				driver.switchTo().frame("frame3");
				driver.findElement(By.xpath("//input[@id='a']")).click();
				driver.switchTo().defaultContent();
				driver.switchTo().frame("frame2"); 
				WebElement dpd = driver.findElement(By.xpath("//select[@id='animals']"));
				Select dd1=new Select(dpd);
				dd1.selectByValue("avatar");
				
	}

}