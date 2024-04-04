package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import TakeScreenShot.TakescreenshotWebElement;
import net.bytebuddy.agent.builder.AgentBuilder.ClassFileBufferStrategy;

public class CoinScreenshot_Disabl_JSExecutor {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		
		//click on allow option
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(5000);	
		driver.switchTo().activeElement().click();
		
	    Thread.sleep(5000);
		//identify the gold coin webelement  \
     	WebElement goldCoin = driver.findElement(By.xpath("//a[text()='Gold Coins ']"));
     	//use Actions class
		Actions act = new Actions(driver);
		//use moveToElement()
		act.moveToElement(goldCoin).perform();
		Thread.sleep(5000);
		//click on 2 gram gold coin
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-2gms,m']")).click();
		
		//identify gold coin image
		WebElement coin = driver.findElement(By.xpath("//img[@alt='2 gram 24 KT Gold Coin']"));
		
 	    File src=coin.getScreenshotAs(OutputType.FILE);
	    File dest= new File("./Screenshot/singlecoin.png");
	    Files.copy(src, dest);
	    
	    //takes full page screenshot using explicit typecasting
	    TakesScreenshot ts =(TakesScreenshot) driver;
	    File src1 =ts.getScreenshotAs(OutputType.FILE);
	    File dest1 =new File("./Screenshot/fullpage.png");
	    Files.copy(src1, dest1);
		
	    //doing explicit typecasting for scroll down
	    JavascriptExecutor je = (JavascriptExecutor)driver;
	    je.executeScript("document.getElementsByName('newsletter_subscriber').value='dk@gmail.com';");
	    
		
		
	}

}
