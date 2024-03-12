import java.sql.DriverManager;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetandPosition {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        Dimension dimension = new Dimension(2000, 2000);
        driver.manage().window().setSize(dimension);
        driver.get("https://paytm.com/");
	}

}
