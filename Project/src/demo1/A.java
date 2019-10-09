package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class A 
{
	@Test(groups="Aut")
	public void Auto()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.hdfc.com");
	    driver.close();
	}
	
	@Test(groups="Aut1")
	public void Auto1()
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver ff=new FirefoxDriver();
		ff.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		ff.get("https://cricbuzz.com");
		ff.close();
	
}
}
