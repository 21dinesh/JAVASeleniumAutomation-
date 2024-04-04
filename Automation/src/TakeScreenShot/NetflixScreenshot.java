package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import WorkingWithMouseAction.WorkingWithMoveToElement;
import xpath.chandlerbinggoogle;

public class NetflixScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.get("https://www.netflix.com/in/");
      
      //identfy the webElement
     /* WebElement nf =driver.findElement(By.xpath("//span[@class='default-ltr-cache-0 ev1dnif0']"));
      
      //Use Action class
      Actions act = new Actions(driver);
      
      //Use moveToElement()
      act.moveToElement(nf).perform();
      */
      //click on netflix 
      //nf.click();
      
      //identfy the netflix
       WebElement nf = driver.findElement(By.xpath("//span[@class='default-ltr-cache-0 ev1dnif0']"));
      File ser = nf.getScreenshotAs(OutputType.FILE);
      File dest = new File("./Screenshot/Netfilx3.png");
      Files.copy(ser, dest);
      
      
	}

}
