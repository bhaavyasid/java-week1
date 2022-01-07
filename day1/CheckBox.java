package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//h5[text()='Checkbox']")).click();
		driver.findElement(By.xpath("//div[text()='Java']//input")).click();
		driver.findElement(By.xpath("//div[text()='Not Selected']//input")).click();
		driver.findElement(By.xpath("//div[text()='Option 1']//input")).click();
		driver.findElement(By.xpath("//div[text()='Option 2']//input")).click();
		driver.findElement(By.xpath("//div[text()='Option 3']//input")).click();
		driver.findElement(By.xpath("//div[text()='Option 4']//input")).click();
		driver.findElement(By.xpath("//div[text()='Option 5']//input")).click();


}
}
