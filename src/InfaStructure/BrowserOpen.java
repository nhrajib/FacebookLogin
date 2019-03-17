package InfaStructure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserOpen {
	public static WebDriver launch(String browserType, String url){
		WebDriver driver = null;
		switch (browserType) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constant.ChromeDriverPath);
			 driver = new ChromeDriver();
	
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
	
			break;

		default:
			break;
		}

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;

	}
}
