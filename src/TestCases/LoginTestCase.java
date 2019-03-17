package TestCases;

import org.openqa.selenium.WebDriver;
import InfaStructure.Constant;
import PageFlows.HomePage;
import InfaStructure.BrowserOpen;

public class LoginTestCase {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Masum Ahmmed\\Documents\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = null;
		String browser = Constant.BrowserType;
		String url = Constant.BaseURL;
		driver = BrowserOpen.launch(browser, url);
		new HomePage().login(driver);
		

	}

}
