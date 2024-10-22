package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass {

	public ChromeDriver driver;
	
	@Given ("Launch Browser and load the Url and maximize screen")
	
	public void LaunchUrl() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	}

	@And ("Enter the user name as dilip@testleaf.com")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");

	}
	@And ("Enter the password as leaf@2024")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("leaf@2024");

	}
	@When ("Click on LoginButton")
	public void Login() {
		driver.findElement(By.id("Login")).click();

	}
	@Then ("Verifiy my page successfully Login") 
	public void  verifiyPage() {
		String title = driver.getTitle();
		if (title.contains("SetupHome")) {
			System.out.println("Login is Successful");
		}else {
			System.out.println("Not Successful");
			
		}
	}
	
}
