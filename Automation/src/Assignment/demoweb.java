package Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoweb 
{
		public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[2]/a")).click();//login button
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("abcxd@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']/ancestor::div[@class='product-grid']")).click();
	    driver.findElement(By.xpath("//input[@data-productid='45']")).click();
	     driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	     driver.findElement(By.xpath("//select[@name='CountryId']")).click();
	 //    WebElement dropdown = driver.findElement(By.id("//select[@id='CountryId']"));
	     
	     driver.findElement(By.xpath("//option[contains(text(),'Canada')]")).click();
	  //  driver.findElement(By.xpath("//select[@id='StateProvinceId']")).click();
	     //driver.findElement(By.xpath("//option[text()='British Columbia']")).click();
	     driver.findElement(By.xpath("//input[@type='button']/ancestor::div[@data-productid='13']")).click();
	      
	     driver.findElement(By.id("termsofservice")).click();
	     driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
		
		
		}

	}


