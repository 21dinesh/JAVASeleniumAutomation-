package WorkingWithJavaSccriptPopUp;

import java.time.Duration;

import org.bouncycastle.asn1.x509.AltSignatureAlgorithm;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		//click on alert box button
		driver.findElement(By.id("buttonAlert2")).click();
		// switch the control from main page to alert popup
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		//use accept()
	    alt.accept();
}

}
