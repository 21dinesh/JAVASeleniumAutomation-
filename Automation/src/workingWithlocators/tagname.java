package workingWithlocators;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	public static void main(String[] args) {
//launch the browser
	WebDriver driver =new ChromeDriver();
// maximize the browser
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com");
	WebElement element =driver.findElement(By.tagName("input"));
	element.sendKeys("books"); 
	driver.findElement(By.className(null)).click();
	}	
}
