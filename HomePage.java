package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificationMethod;

public class HomePage extends ProjectSpecificationMethod{

	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public HomePage clickToggle() {
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	return this;
	}
	
	
	public SalesForcePage clickViewALL() {
    driver.findElement(By.xpath("//button[text()='View All']")).click();
    return new SalesForcePage(driver);
	}

	public HomePage clickToggle1() {
		return null;
	}
}
