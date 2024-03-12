package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithBlinkit {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blinkit.com/");
		// click on the popup 
		driver.findElement(By.xpath("//button[@class='btn location-box mask-button']")).click();
		Thread.sleep(3000);
		//click on the search baar
		driver.findElement(By.xpath("//div[@class='SearchBar__PlaceholderContainer-sc-16lps2d-0 dPbxWD']")).click();
		Thread.sleep(2000);
		//enter the product name in the search baar
		driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("peanet butter",Keys.ENTER);
		//input[@class='SearchBarContainer__Input-sc-hl8pft-3 irVxjq']
		Thread.sleep(2000);
		//click on aad button
		driver.findElement(By.xpath("(//div[text()='ADD'])[1]")).click();
		//click on + button for adding product in cart
		for(int i=0;i<=3;i++)
		    {
		    driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']")).click();
	     	}
    	driver.findElement(By.xpath("//div[text()='r']")).click();
		
		
	}

}
