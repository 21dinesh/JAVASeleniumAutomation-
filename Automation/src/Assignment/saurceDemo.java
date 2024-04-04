package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import TakeScreenShot.TakescreenshotWebElement;

public class saurceDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		//
		Thread.sleep(2000);
		 WebElement Verify = driver.findElement(By.xpath("//div[text()='29.99']"));
		 String actualPrice= Verify.getText();
		 
		 String expectedPeice = "29.99";
		 
		 if(actualPrice==expectedPeice)
		 {
			 System.out.println("Currect Value");
			 Thread.sleep(3000);
		 }
		 
		 else
		 {
			 System.out.println("Incurrect Value");
		 }
		 Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@data-test='checkout']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("DK");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("KD");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("302020");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='continue']")).click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sre =ts.getScreenshotAs(OutputType.FILE);
		  File dest = new File("./Screenshot/bill.png");
		  Files.copy(sre, dest);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[text()='Open Menu']")).click(); 
		  driver.findElement(By.xpath("//a[text()='Logout']")).click(); 
		  
		  
			

	}

}
