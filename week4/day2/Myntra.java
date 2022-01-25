package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//Myntra
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		//1) Open https://www.myntra.com/
		driver.get("https://www.myntra.com/");
		//2) Mouse hover on MeN 
		WebElement men = driver.findElement(By.xpath("//a[@href='/shop/men']"));
		Actions action = new Actions(driver);
		action.moveToElement(men).pause(500).perform();
		//3) Click Jackets 
		driver.findElement(By.xpath("//a[@href='/men-jackets']")).click();
//4) Find the total count of item 
		WebElement ele2 = driver.findElement(By.xpath("//h1[@class='title-title']/following-sibling::span[1]"));
		String text1= ele2.getText();
		System.out.println(text1);
//5) Validate the sum of categories count matches
		String rp1 = text1.replaceAll("[^0-9]","");
		int s1 = Integer.parseInt(rp1);
//6) Check jackets
		WebElement ele3 = driver.findElement(By.xpath("//ul[@class='categories-list']//label"));
		String text2 = ele3.getText();
		 String rp2 = text2.replaceAll("[^0-9]","");
		int s2 = Integer.parseInt(rp2);
//7) Click + More option under BRAND
		WebElement ele4 = driver.findElement(By.xpath("(//ul[@class='categories-list']//label)[2]"));
		 String text3 = ele4.getText();
		 String rp3 = text3.replaceAll("[^0-9]","");
		int s3 = Integer.parseInt(rp3);
		
		int sum = s2 + s3;
		
		if(s1==sum) {
			
			System.out.println("Total matches");
			
		}else {
			
		System.out.println("Total mismatches");
		}
		driver.findElement(By.xpath("//ul[@class='categories-list']//label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='brand-list']/following-sibling::div[1]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
		List<String> window1 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window1.get(0));
//8) Type Duke and click checkbox
		driver.findElement(By.xpath("//div[@class='FilterDirectory-titleBar']//input[1]")).sendKeys("Duke");
		driver.findElement(By.xpath("//ul[@class='FilterDirectory-list']/li[2]")).click();
		Thread.sleep(3000);
//9) Close the pop-up x
		
         driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
       
        
         driver.switchTo().defaultContent();
		
//10) Confirm all the Coats are of brand Duke
        WebElement ele6 = driver.findElement(By.xpath("(//input[@value='Duke']/following::span)"));
       String text4 = ele6.getText();
    	String dd = text4.replaceAll("[^0-9]","");
    	System.out.println(dd);
      	int duke = Integer.parseInt(dd);
    	
    	List<WebElement> lt = new ArrayList<WebElement>();
    	for (int i = 0; i < duke ; i++) {
    		
    		lt.add(ele6);
    	}	
    		
    	int size = lt.size();
    		
    		if(size==duke) {
    			
    			System.out.println(" Duke is added to the list");
    		}else {
    			
    			System.out.println("Contains other brands");
    		}
		   // Hint : use List 
//11) Sort by Better Discount
    		WebElement ele7 = driver.findElement(By.xpath("(//div[@class='horizontal-filters-sortContainer']//div)[3]"));
    		WebElement ele8=driver.findElement(By.xpath("(//ul[@class='sort-list']//label)[3]"));
    		action.moveToElement(ele7).moveToElement(ele8).click(ele8).perform();
			
//12) Find the price of first displayed item
    		WebElement ele9 = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]"));
    		
    		String text =ele9.getText();
    		
    		System.out.println("Price of 1st item:" + text);
    //Click on the first product
    		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
    		
    		Set<String> windowHandles2 = driver.getWindowHandles();
    		
    		List<String> window2 = new ArrayList<String>(windowHandles2);
    		
    		driver.switchTo().window(window2.get(1));
		
//13) Take a screen shot

			File source = driver.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("./images/DukeJacket.png");
			
			FileUtils.copyFile(source, destination);
//14) Click on WishList Now
			driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite desktop-iconWishlist')]")).click();
//15) Close Browser
			driver.switchTo().defaultContent();
			driver.quit();

	}

}
