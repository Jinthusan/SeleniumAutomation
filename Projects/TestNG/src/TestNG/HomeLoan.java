package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {
	
	@Test(groups= {"Smoke"})
	public void LoginWebHome()
	{
		System.out.println("Selenium");
	}
	
	@BeforeSuite
	public void LoginMobileHome()
	{
		System.out.println("BeforeSuiteApium");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethodabc");
	}
	@Parameters({"URL"})
	@Test
	public void LoginWebAPIHome(String homeURL)
	{
		System.out.println(homeURL);
	}

}
