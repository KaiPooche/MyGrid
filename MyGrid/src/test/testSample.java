package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

public class testSample {

	@Parameters("browser")
	@Test
	public void testLogin(String browser) throws MalformedURLException {
		System.out.println(browser);
		DesiredCapabilities cap = null;
		
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
	
		RemoteWebDriver driver = new RemoteWebDriver(new URL("https://localhost:4444/wd/hub"), cap);
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("mahatmadeepti@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("mahatmadeepti");
		driver.quit();
		
	}
}
