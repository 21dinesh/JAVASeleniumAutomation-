package JavaScriptsExecutor;

import java.awt.Rectangle;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbyTillElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.zomato.com/india");
		//create a privacy webelement form web page element
		WebElement privacy = driver.findElement(By.xpath("//p[text()='Privacy']"));
		
		/*
		//1st way
		Rectangle rect = privacy.getRect();
		 int x = rect.getX();
		 int y = rect.getY();
		 
	    // scroll down till find element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(" + x +","+y+");");
		*/
		
		//2nd way
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)", privacy);
		
		
	}
}
