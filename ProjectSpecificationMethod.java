package base;



	import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

		
public class ProjectSpecificationMethod {
	public RemoteWebDriver driver;

		@BeforeMethod
		public void precondition() {
		driver = new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notificatons");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://login.salesforce.com/");
	}
		@AfterMethod
		public void postCondition() {
			driver.close();
		}
	
}
