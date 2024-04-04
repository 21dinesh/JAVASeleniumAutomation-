
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookCopyPast {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("Admin");
		
		
		//create a robot class
		Robot r = new Robot();
		//press the key
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		
		
	}

}
