package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/selectable");
		driver.switchTo().frame(0);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement Item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		 WebElement Item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		 WebElement Item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		 Actions builder=new Actions(driver);
		 builder.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).keyUp(Keys.CONTROL).perform();

	}
}
