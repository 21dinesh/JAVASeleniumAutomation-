package WorkingWithMouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithDragAndDrop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		//identify th drag webelement
		WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']")); 
        WebElement drag1 =driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		//identify the drop webelement
		WebElement	drop =driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		 WebElement drop1 = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		
		//create the object of action class
		Actions act = new Actions(driver);
		Actions act1= new Actions(driver);
		
		
		//use draganddrop()
		act.dragAndDrop(drag, drop).perform();
		act1.dragAndDrop(drag1, drop1).perform();
		
		
		
	}

}
