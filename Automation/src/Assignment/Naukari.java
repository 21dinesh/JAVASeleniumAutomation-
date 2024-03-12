package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukari {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("register_Layer")).click();
		
		
		driver.findElement(By.id("name")).sendKeys("abc");

		driver.findElement(By.id("email")).sendKeys("axbyc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("a1232123");
		driver.findElement(By.id("mobile")).sendKeys("9023432340");
		driver.findElement(By.xpath("//div[@data-val='fresher']")).click();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("(//span[text()='Pune'])[1]")).click();
		
		//driver.findElement(By.className("chip initialLocation-location")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("axbyc@gmail.com",Keys.ENTER);
        driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("a1232123",Keys.ENTER);
        
		
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));//implicit wait
		//explicit wait
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement wait = (WebElement) new WebDriverWait (driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.elementToBeClickable("//button[@type='submit']"));
		submit.click();
		*/
	}
}
