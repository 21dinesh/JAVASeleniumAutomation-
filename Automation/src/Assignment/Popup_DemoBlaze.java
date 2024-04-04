package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_DemoBlaze {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.demoblaze.com/");
		
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("abcasdfg@gmail.com");
		driver.findElement(By.id("loginpassword")).sendKeys("abc12345");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
		
		
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
        driver.findElement(By.xpath("//a[@onclick='addToCart(1)']")).click();
        Thread.sleep(2000);
        //switch to alert popup
        Alert alt = driver.switchTo().alert();
        Thread.sleep(2000);
        //use ok
        alt.accept();
        
        //goto home
        driver.findElement(By.xpath("//a[text()='Home ']")).click();
        //select secound product and add to cart
        driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
      
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
        Thread.sleep(3000);
        Alert alt1 = driver.switchTo().alert();
        //use ok
        alt1.accept();
        
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(3000);
        
        WebElement verify = driver.findElement(By.id("totalp"));
        String actualprice = verify.getText();
        System.out.println(actualprice);
        		
        		
        String expectedprice="1180"; 
         
        if(actualprice.equals(expectedprice))
        {
        	System.out.println("Matched");
        }
        else
        {
        	System.out.println("NOT matched");
        	
        }
        
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        
        driver.findElement(By.id("name")).sendKeys("kaka",Keys.TAB,"India",Keys.TAB,"Pune",Keys.TAB,"12345678876543216677",Keys.TAB,"may",Keys.TAB,"1993");
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();
        
        
        
        
	}

}
