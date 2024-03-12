package workingwithxpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.xpath("//a[@id='signIn']")).click();
		driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("asdfg");
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("987654321");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
     
}
