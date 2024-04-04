package WorkingWithMouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMoveToElement {
	public static void main(String[] args) {
	WebDriver	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist=3");
	
    WebElement menClick = driver.findElement(By.xpath(" //li[text()='Men ']"));
		
	//create object for action class
	Actions act= new Actions(driver);
		
	//
	act.moveToElement(menClick).perform();
	}

}
