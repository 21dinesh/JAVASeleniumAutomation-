package WorkingWithSelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectByIndex {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[@class='poppins text-[14px]']")).click();
    


}
}
