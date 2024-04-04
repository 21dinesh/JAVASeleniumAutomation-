package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class workingwithContextClick_RightClick {
	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
   WebElement rightButton = driver.findElement(By.id("btn30"));
   Actions act = new Actions(driver);
	act.contextClick(rightButton).perform();
	
	}

}
