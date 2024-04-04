package KeyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginActitime {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://127.0.0.1/login.do;jsessionid=42gf6n2kpl94n");
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
	}

}
