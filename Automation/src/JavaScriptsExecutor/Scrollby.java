package JavaScriptsExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollby {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.bluestone.com/");
	    // scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(int i=0; i<=30; i++)
		{	
		js.executeScript("window.scrollBy(0,100);");
		}
		
		driver.findElement(By.xpath("//span[text()='Not now']")).click();

		Thread.sleep(3000);
		for(int i=1;i<=30;i++)
		{	
		js.executeScript("window.scrollBy(0,-100);");
	
		}
	}
}
