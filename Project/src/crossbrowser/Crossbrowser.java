package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser 
{
	@Test
	@Parameters("browser")
	public void testcrossbrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("google"))
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.close();
		}
		
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com");
			driver.close();
		}
	}
	

}
