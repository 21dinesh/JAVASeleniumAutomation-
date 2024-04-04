package WorkingWithWindowPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPupupSendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\pc\\Desktop\\project ambernotes\\Ambernotes Docs\\Negative Data\\Word");
		
		
		
}
}
