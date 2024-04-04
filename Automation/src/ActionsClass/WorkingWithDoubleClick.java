package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDoubleClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//click on ui testing
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Button']")).click();	
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		
		//identfy the yes button
	     WebElement	yesButton=driver.findElement(By.xpath("//button[@id='btn20']"));
	     
	     
	     Actions act = new Actions(driver);
	     
	     //use double click
	     act.doubleClick(yesButton).perform();
	}

}
