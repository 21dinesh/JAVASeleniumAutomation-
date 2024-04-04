package WorkingWithJavaSccriptPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		driver.findElement(By.id("buttonAlert5")).click();
		Alert alt = driver.switchTo().alert();
		
		//use get text() 
		String text = alt.getText();  
		System.out.println(text);
		
		Thread.sleep(3000);		
		//use dismiss()
        alt.dismiss();
	}

}
