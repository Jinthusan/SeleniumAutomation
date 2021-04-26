package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class CarLoan {
	
	@Test
	public void LoginWebCar()
	{
		System.out.println("CarSelenium");
	}
	
	@Test
	public void LoginWebCarMotor()
	{
		System.out.println("CarSeleniumMotor");
	}
	
	@Test(groups= {"Smoke"})
	public void LoginMobileCar()
	{
		System.out.println("CarApium");
	}
	
	@Test(dependsOnMethods={"LoginWebCar", "LoginWebCarMotor"})
	public void LoginWebAPICar()
	{
		System.out.println("CarRestAssured");
	}

}
