package InfaStructure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Operation {

	public void ClickLink(WebDriver driver, String xpathExpression) {
		driver.findElement(By.xpath(xpathExpression)).click();
	
}       
	
	
	public void SetText(WebDriver driver, String xpathExpression) {
		driver.findElement(By.xpath(xpathExpression)).sendKeys();
}       
	
	
}