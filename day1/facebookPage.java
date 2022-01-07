package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("bhavya");
		  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sree");
		  driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("sree@gmail.com");
		  driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("sree56");
		
		  WebElement dateofbirth = driver.findElement(By.id("day"));
			
			Select dd = new Select(dateofbirth);
			
			dd.selectByVisibleText("28");
			
          WebElement month = driver.findElement(By.id("month"));
			
			Select dd1= new Select(month);
			
			dd1.selectByVisibleText("May");
          WebElement year = driver.findElement(By.id("year"));
			
			Select dd2 = new Select(year);
			
			dd2.selectByVisibleText("1994");
			driver.findElement(By.xpath("//input[@name='Female']"));
			 
			driver.findElement(By.name("websubmit")).click();      
	}

}
