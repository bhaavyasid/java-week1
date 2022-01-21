package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https:www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[text()='Try it']")).click();
Alert ale = driver.switchTo().alert();
ale.sendKeys("bhavi");
ale.accept();

String text = driver.findElement(By.id("demo")).getText();
if (text.contains("bhavi")) 
{
	System.out.println("name is same");
} else {
	System.out.println("name is differnet");
}	
}
}