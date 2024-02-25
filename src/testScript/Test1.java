package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.close();
		
	}
}
