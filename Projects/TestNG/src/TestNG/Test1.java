package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	@Parameters({"URL","APIKey/username"})
	@Test
	public void Demo(String demoURL, String apikey) {
		System.out.println(demoURL);
		System.out.println(apikey);
	}
	
	@AfterTest
	public void Demo2() {
		System.out.println("I will execute first");
	}
	
	@Test(enabled=false)
	public void Demo3() {
		System.out.println("Hello World3");
	}
	
	@BeforeTest
	public void Demo4() {
		System.out.println("Second I will print");
	}

}
