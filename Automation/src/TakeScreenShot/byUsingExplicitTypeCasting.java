package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class byUsingExplicitTypeCasting {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.youtube.com/GitHub");
		
		// take the screenshot by using explicit type casting
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./Screenshot/img.png");
		Files.copy(src, dest);
		
	}

}
