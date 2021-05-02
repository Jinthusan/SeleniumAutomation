package FrameworkFromScratch.E2EProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	//This class is to invoke driver to the relevant browser
	
	public void initializeDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\SLIIT\\QA Udemy\\Selenium\\Git_Selenium\\Projects\\E2EProject\\src\\main\\java\\FrameworkFromScratch\\E2EProject\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		//System.out.println(browserName);
		
		if(browserName == "Chrome") {
			System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}
		else if(browserName=="Firefox"){
			
			System.setProperty("webdriver.gecko.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		}
		else if(browserName== "IE") {
			System.setProperty("webdriver.ie.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\IEDriverServer.exe");
			WebDriver driver=new InternetExplorerDriver();
		}
	}

}
