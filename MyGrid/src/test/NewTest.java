package test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
  @Test(dataProvider="getData")
  public void testLogin(String username,String Password,String browser) throws MalformedURLException {
		
	  System.out.println(browser);
	  System.out.println("Git Change try.");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("username");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.quit();
		
	}
  
  @DataProvider 
  public Object[][] getData(){
	 Object data[][]=new Object[3][3]; 
	 data[0][0]="mahatmadeepti@gmail.com";
	 data[0][1]="mahatmadeepti";
	 data[0][2]="firefox";
	 
	 data[1][0]="diamahatma08@gmail.com";
	 data[1][1]="mahatmadia";
	 data[1][2]="chrome";
	 
	 data[2][0]="anktmahatma16@gmail.com";
	 data[2][1]="ankitmahatma";
	 data[2][2]="iexplore";
	 
	 return data;
  }
}
