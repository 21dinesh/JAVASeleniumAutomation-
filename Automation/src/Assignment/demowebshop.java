package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop {
	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.className("ico-register")).click();
	
	driver.findElement(By.id("gender-male")).click();
	
	driver.findElement(By.id("FirstName")).sendKeys("abcd",Keys.ENTER);	
	
	driver.findElement(By.id("LastName")).sendKeys("dcba",Keys.ENTER);	
	driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com",Keys.ENTER);	
	driver.findElement(By.id("Password")).sendKeys("abc@123",Keys.ENTER);
	driver.findElement(By.id("ConfirmPassword")).sendKeys("abc@123",Keys.ENTER);
	
	
	}

}
