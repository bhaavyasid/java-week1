package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		// * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		File Source=driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./images/HomeScreen.png");
		FileUtils.copyFile(Source,destination);
		driver.switchTo().defaultContent();
        List<WebElement> outerframe = driver.findElements(By.tagName("iframe"));
		int size = outerframe.size();
		System.out.println(size+" frames are in outerframes");
		for(int i=0;i<outerframe.size();i++) {
			driver.switchTo().frame(outerframe.get(i));//0,1,2
			List<WebElement> innerFrame = driver.findElements(By.tagName("iframe"));//0,1,1
		    size = size + innerFrame.size();
		    driver.switchTo().defaultContent();
	}
		System.out.println("Totally "+size+" frames are in page");
		driver.close();
		
		
	}

}