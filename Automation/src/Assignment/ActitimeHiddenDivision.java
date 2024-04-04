package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActitimeHiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("dinesh3111 Bank");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
		Thread.sleep(2000);
		
		 WebElement dropD = driver.findElement(By.xpath("//select[@name='customerId']"));
		Select d = new Select(dropD);
		d.selectByVisibleText("dinesh3111 Bank");
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("dinesh3111 Automation");
		driver.findElement(By.xpath("//input[@name='createProjectSubmit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='All']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		driver.findElement(By.id("deleteButton")).click();
		driver.quit();
		
		
		
		
		
        
	}

}
