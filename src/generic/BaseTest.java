package generic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	WebDriver driver;
	@BeforeMethod
	public void openApp() {
		try {
			URL url=new URL("http://localhost:4444/wd/hub/");
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setBrowserName("chrome");
			 driver=new RemoteWebDriver(url, dc);
			 driver.get("http://google.com");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void closeApp() {
		
	}

}
