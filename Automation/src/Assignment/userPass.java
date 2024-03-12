package Assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class userPass 
{ public static void main(String[] args) throws InterruptedException {
	
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  
  driver.get("https://www.facebook.com/login/");
 // Thread.sleep(2000);
  
  driver.findElement(By.linkText("Sign up for Facebook")).click();
  driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("asdfg");
  
  driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("xyx");
  //driver.findElement(By.tagName("button")).click();
 
  driver.findElement(By.cssSelector("button[name='websubmit']")).click();
  
  
}
}