package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way2ToTakeScreenShot {
	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.youtube.com/GitHub");
		
		// take the screenshot by doing upcasting in remote webdriver class
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./Screenshot/img.png");
		Files.copy(src, dest);
	}

}
