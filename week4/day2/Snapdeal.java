package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		//1. Launch https://www.snapdeal.com/
		driver.get(" https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//	2. Go to Mens Fashion
		//	3. Go to Sports Shoes
		//	4. Get the count of the sports shoes
		//	5. Click Training shoes
		//6. Sort by Low to High
			//	7. Check if the items displayed are sorted correctly
		//8.Select the price range (900-1200)
		//9.Filter with color Navy 
		//10 verify the all applied filters 
		//11. Mouse Hover on first resulting Training shoes
		//12. click QuickView button
		//	13. Print the cost and the discount percentage
		//14. Take the snapshot of the shoes.
		//15. Close the current window
		//	16. Close the main window
	}

}
