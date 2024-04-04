package JavaScriptsExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriverInfo;

public class handleDisableWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('name').value='dinesh';");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('email').value='dinesh@gmail.com';");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('password').value='dineshkumar';");		
		
		
		
		
	}

}
