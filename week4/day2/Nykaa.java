package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		//1) Go to https://www.nykaa.com/
		driver.get("https://www.nykaa.com/");
		//2) Mouseover on Brands and Search L'Oreal Paris
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions action = new Actions(driver);
		action.moveToElement(brand).perform();
		//3) Click L'Oreal Paris
		WebElement lp=driver.findElement(By.partialLinkText("Paris"));
		lp.click();
			//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		System.out.println("Page title after link click : " + driver.getTitle());
	     //5) Click sort By and select customer top rated
		
			//6) Click Category and click Hair->Click haircare->Shampoo
		
			//7) Click->Concern->Color Protection
		
			//8)check whether the Filter is applied with Shampoo
		
			//9) Click on L'Oreal Paris Colour Protect Shampoo
		
			//10) GO to the new window and select size as 175ml
		
		   //11) Print the MRP of the product
		
	    	//12) Click on ADD to BAG
		
		  //13) Go to Shopping Bag
		
		//14) Print the Grand Total amount
		
       //15) Click Proceed
		
		//16) Click on Continue as Guest
		
		//17) Check if this grand total is the same in step 14
		
		//18) Close all windows
	}

}
