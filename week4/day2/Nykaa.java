package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
		   
		    //to handle notifications in websites
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--disable-notifications");
		        
			ChromeDriver driver = new ChromeDriver(options);
			
			driver.get("https://www.nykaa.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			Actions builder = new Actions(driver);
			
			WebElement fe1 = driver.findElement(By.xpath("//a[text()='brands']"));
			
			WebElement fe2 = driver.findElement(By.xpath("//a[contains(text(),'Paris')]"));
			
			builder.moveToElement(fe1).pause(1000).click(fe2).perform();
							
		    String text = driver.findElement(By.xpath("//div[@id='title']/h1")).getText();
		 
			System.out.println(text);
			
			driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();
			
			driver.findElement(By.xpath("//span[contains(text(),'customer')]")).click();
			
			driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
			
			driver.findElement(By.xpath("//span[contains(text(),'Hair')]")).click();
			
			driver.findElement(By.xpath("//span[contains(text(),'Hair Care')]")).click();
			
			WebElement fe3 = driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]"));
			
			String text2 = fe3.getText();
			
			fe3.click();
			
			driver.findElement(By.xpath("//span[contains(text(),'Concern')]")).click();
			
			driver.findElement(By.xpath("//span[contains(text(),'Color Protection')]")).click();
			
			if(text2.contains("Shampoo")) {
				
				System.out.println("Shampoo is added to the filter");
				
			}else {
				
				System.out.println("Shampoo is not added to the filter");
			}
			
			
	driver.findElement(By.xpath("//a[@href='/l-oreal-paris-color-protect-shampoo/p/6282?productId=6282&pps=1']")).click();
			
			Set<String> windowHandles = driver.getWindowHandles();
			
			List<String> window1 = new ArrayList<String>(windowHandles);
			
			String st = window1.get(1);
			
			driver.switchTo().window(st);
			
			driver.findElement(By.xpath("//option[contains(text(),'175')]")).click();
			
			WebElement fe4 = driver.findElement(By.xpath("//span[@class='css-12x6n3h']"));
			
			String text3 = fe4.getText();
			
			//replacing everything with "" except nos
			String rp = text3.replaceAll("[^0-9]", "");
			 
			//converting string(150) to integer
			int price = Integer.parseInt(rp);
			
			System.out.println("Price of the shampoo: Rs."+ price);
			
			fe4.click();
			
			driver.findElement(By.xpath("//span[contains(text(),'ADD TO BAG')]")).click();
			
			driver.findElement(By.xpath("//button[@class='css-5s18zx eoh7kvv0']")).click();
			
			driver.switchTo().frame(0);
			
			WebElement fe5 = driver.findElement(By.xpath("//div[@class='first-col']/div[1]"));
			
			String text4 = fe5.getText();
			
			String rp1 = text4.replaceAll("[^0-9]", "");
			
			int price1 = Integer.parseInt(rp1);
			
			System.out.println("Grand Total:"+ price1);
			
			driver.findElement(By.xpath("//div[@class='second-col']/button")).click();
			
			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("//button[contains(text(),'CONTINUE')]")).click();
			
           WebElement fe6 = driver.findElement(By.xpath("//div[text()='Grand Total']/following::span[1]"));
			
			String text5 = fe6.getText();
			
			String rp2 = text5.replaceAll("[^0-9]", "");
			
			int price2 = Integer.parseInt(rp2);
			
			System.out.println("Grand Total:"+ price2);
			
			if(price1==price2) {
				
				System.out.println("Grand total is same");
				
			}else {
				
				System.out.println("Grand total mismatches");
			}
			
			driver.quit();
			

	}

}
	  
	  
	  
	  
	  
	  
	  
	    
	    
	    
	    
	    
		
		
		
	