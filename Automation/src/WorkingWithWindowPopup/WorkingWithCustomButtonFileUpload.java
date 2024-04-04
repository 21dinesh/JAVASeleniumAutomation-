package WorkingWithWindowPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCustomButtonFileUpload {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
	    driver.findElement(By.id("//div[text()='Upload File']")).sendKeys("");
	
	}

}
