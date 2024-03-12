package WorkingWithWebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//click on ui testing
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		//click on checkBox 
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		
		//check the check box value is enabled
		WebElement checkBox = driver.findElement(By.xpath("//span[text()='Email']"));
		System.out.println(checkBox.isEnabled());
		
		driver.findElement(By.xpath("//a[text()='Selected']")).click();
		
		//check the check box value is selected
		WebElement checkBox1 = driver.findElement(By.xpath("//a[text()='Selected']"));
		System.out.println(checkBox1.isSelected());
		
		
		
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[2]/a")).click();//login button
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/input[@id='Email']")).sendKeys("asdf@xyz");
		
	}
}
