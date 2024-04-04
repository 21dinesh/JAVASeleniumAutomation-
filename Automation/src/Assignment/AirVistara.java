package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AirVistara {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		
		//flight search form
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("pune",Keys.ENTER);
		
		driver.findElement(By.xpath("//p[@id='ui-id-54']")).click();
		
		//Flight search destination
		driver.findElement(By.xpath("//input[@aria-label='Search destination']")).sendKeys("manchester",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		
		driver.findElement(By.linkText("3")).click();
		
		
		
	}
}
