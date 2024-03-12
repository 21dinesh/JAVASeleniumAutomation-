package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class airTicket {
	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.get("https://paytm.com/");
	  
	//  click on flights
	driver.findElement(By.xpath("//div[2][@class='_2EGQY']")).click();
	
	//click on from textfield
	driver.findElement(By.xpath("//span[text()='DEL']")).click();
	
	//choose the place from droup down
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	
	//enter pune in textfiled
	driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("PNQ");
	
	//click on pune 
	driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
	
	//click on close X button of departure 
	driver.findElement(By.xpath("//span[@id='destCode']")).click();
    
	//click on departure textfieled
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	
	//enter the dxb dubai in textfield 
	driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("DXB");
	
	// select the dubai
	driver.findElement(By.xpath("//div[text()='Dubai, United Arab Emirates']")).click();
	
	//click on departure date
	driver.findElement(By.xpath("//span[@id='departureDate']")).click();
	
	// select the date
	driver.findElement(By.xpath("(//div[text()='15'])[2]")).click();
	
	//click on flight search button
	driver.findElement(By.xpath("//button[@id='flightSearch']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
	//identify all prices of the flight
	List<WebElement> flightPrice = driver.findElements(By.xpath("//div[@class='_1dxje']"));
	
	//for loop for print the flight price
	
	for(int i=0;i<flightPrice.size();i++){
		System.out.println(flightPrice.get(i).getText());
	}
	}
}
