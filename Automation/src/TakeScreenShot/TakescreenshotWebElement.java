package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class TakescreenshotWebElement {
 public static void main(String[] args) throws InterruptedException, IOException {
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  driver.get("https://www.bluestone.com/");
  
  //click on allow option
  driver.findElement(By.id("confirmBtn")).click();
  
  //identfy the goldcoin webelement
  driver.findElement(By.xpath("//a[text()='Gold Coins ']")).click();
  JavascriptExecutor js =(JavascriptExecutor) driver;
  //use execute script method
  js.executeScript("window.scrollBy(0,100);");
  Thread.sleep(3000);
  //use Action class
  //Actions act = new Actions(driver);

  //Use moveToElement()
  //act.moveToElement(goldcoin).perform();
  
  //click on gold coin 
  //goldcoin.click();
  
  //identify the gold coin
  WebElement coin =driver.findElement(By.xpath("//img[@src='https://kinclimg2.bluestone.com/f_webp,c_scale,w_1024,b_rgb:ffffff/product/1gms995_YAA24XXXXXXXXXXXX_ABCD00-fr-1024-v6.jpg']"));
  Thread.sleep(5000);
  
  File sre = coin.getScreenshotAs(OutputType.FILE);
  File dest = new File("./Screenshot/coinsA.png");
  Files.copy(sre, dest);
  
  
}
}
