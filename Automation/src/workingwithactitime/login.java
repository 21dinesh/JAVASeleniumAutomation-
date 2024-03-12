package workingwithactitime;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='content users'and@style]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		//Random.
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("abc2xyz");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("abc123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("XYZ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc_xyz");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("abc123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'View ')]")).click();
		
		}

}
