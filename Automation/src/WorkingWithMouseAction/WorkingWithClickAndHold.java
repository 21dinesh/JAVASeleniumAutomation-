package WorkingWithMouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		//create the object of action class
		Actions act = new Actions(driver);
		
		// use clickAndHold
		act.clickAndHold(driver.findElement(By.id("circle"))).perform();
		Thread.sleep(2000);
		act.release().perform();
	}

}
