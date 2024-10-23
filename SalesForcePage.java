package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificationMethod;

public class SalesForcePage extends ProjectSpecificationMethod {
	public SalesForcePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public OpportunityPage clickSales() {
    driver.findElement(By.xpath("//p[text()='Sales']")).click();
    return new OpportunityPage(driver);
	}
}
