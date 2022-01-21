package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://jqueryui.com/draggable/");
			driver.switchTo().frame(0);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		
			
			Actions builder=new Actions(driver);
			builder.dragAndDropBy(source, 100, 100).perform();
	}	
}
			
			
		