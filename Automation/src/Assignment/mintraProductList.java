package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class mintraProductList {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("tshirt",Keys.ENTER);
		List<WebElement> nElements = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		//print the prducts
		for(int i=0;i<nElements.size();i++)
		{
			System.out.println();
			
		}
	}

}
