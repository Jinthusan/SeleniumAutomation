package FrameworkFromScratch.E2EProject;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.Base;

public class HomePage extends Base {
	
	
	@Test
	public void basePageNavigation() throws IOException{
		
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com/");
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();

	}

}
