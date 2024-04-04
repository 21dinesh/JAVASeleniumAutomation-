package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc  
	{

			public static void main(String[] args) throws InterruptedException {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.irctc.co.in/nget/train-search");
			driver.findElement(By.xpath("//input[@role='searchbox'and @aria-controls='pr_id_1_list']")).sendKeys("jaipur");
            //driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[1])")).click();
			driver.findElement(By.xpath("//span[text()=' JAIPUR - JP ']")).click();
			driver.findElement(By.xpath("//span[text()=' PUNE JN - PUNE ']")).click();
			}
}
