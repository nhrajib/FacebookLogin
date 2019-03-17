package PageFlows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import InfaStructure.Operation;
import PageObjects.HomeObject;

public class HomePage {
	//private static final String HomePageObject = null;
	static Operation op = new Operation();
	
	public static void login(WebDriver driver) {
    op.ClickLink(driver, HomeObject.Link_login);
    op.SetText(driver, HomeObject.user);
    op.SetText(driver, HomeObject.Passd);
    
}
}