package workigWithSelectmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDorpdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	//click on ui testing
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	
	//click on dropdown
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
	Thread.sleep(2000);
	
	//pass the mobile number in textfield
	driver.findElement(By.xpath("//input[@placeholder='enter your number']")).sendKeys("9029039202",Keys.ENTER);
   
     //select a dropdown using ID attribute
    WebElement dropdown = driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[1]"));
    //create a object of select class for selected dropdown
    Select s = new Select(dropdown);
    //use the method selectByid
    for(int i=0;i<=3;i++)
    {	
    s.selectByIndex(i);
    Thread.sleep(1000);
    }
    
    //deselect the selected value
    for(int i=0;i<=4;i++)
    {
    s.deselectByIndex(i);
    Thread.sleep(1000);
    }
    
    
	
}
}
