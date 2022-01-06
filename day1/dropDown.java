package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		   WebElement username = driver.findElement(By.id("Dropdown1"));
		   select Dropdown1= new select(dd);
	}
	//*[@id="username"]
}
 from Mohan (TestLeaf) to everyone:    8:18 PM
 WebDriverManager.chromedriver().setup();
    ChromeDriver driver =new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    //id,class,name,linktext,xpath,css value    
    
    
    WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
    Username.sendKeys("demosalesManager");
    
    String Value = Username.getAttribute("attribute name");
    System.out.println(Value);
    Username.clear();
    Username.sendKeys(Value);
     