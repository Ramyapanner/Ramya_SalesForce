package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import week5.day1.ProjectSpecificMethod;

public class VerifyPage extends ProjectSpecificMethod {

	public VerifyPage(RemoteWebDriver driver) {
		this.driver=(ChromeDriver) driver;
	}
	
public VerifyPage verifyText() {
	String text = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by Ramya']")).getText();
    System.out.println(text);
    
    if(text.contains("Ramya")) {
    	System.out.println("Verified");
    }else {
    	System.out.println("Not Verified");
    	
    	
    		
    	}
    return this;
    }
}
