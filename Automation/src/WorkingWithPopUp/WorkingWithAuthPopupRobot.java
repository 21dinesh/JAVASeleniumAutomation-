package WorkingWithPopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAuthPopupRobot {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 		Thread.sleep(3000);
		driver.findElement(By.id("AuthLink")).click();	
	    Robot r = new Robot();
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_A);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_D);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_M);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_I);
	    r.keyPress(KeyEvent.VK_N);
	    
	    //for release
	    Thread.sleep(1000);
	    r.keyRelease(KeyEvent.VK_A);
	    r.keyRelease(KeyEvent.VK_D);
	    Thread.sleep(1000);
	    r.keyRelease(KeyEvent.VK_M);
	    Thread.sleep(1000);
	    r.keyRelease(KeyEvent.VK_I);
	    r.keyRelease(KeyEvent.VK_N);
	
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_A);
	    r.keyPress(KeyEvent.VK_D);
	    r.keyPress(KeyEvent.VK_M);
	    r.keyPress(KeyEvent.VK_I);
	    r.keyPress(KeyEvent.VK_N);
	    
	    //for release
	    r.keyRelease(KeyEvent.VK_A);
	    r.keyRelease(KeyEvent.VK_D);
	    r.keyRelease(KeyEvent.VK_M);
	    r.keyRelease(KeyEvent.VK_I);
	    r.keyRelease(KeyEvent.VK_N);
	    
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_ENTER);
	
	}

}
