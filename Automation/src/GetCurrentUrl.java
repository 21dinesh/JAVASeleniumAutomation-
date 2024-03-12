import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		//to fatch the url
		String actualUrl= driver.getCurrentUrl();
		String expectedUrl="https://paytm.com/";
		if (actualUrl.equals(expectedUrl))
			System.out.println("url is currect");
		else {

			System.out.println("url is not currect");
		}
	}

}
