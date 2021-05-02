package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	//This class is to invoke driver to the relevant browser
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\SLIIT\\QA Udemy\\Selenium\\Git_Selenium\\Projects\\E2EProject\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.contains("Firefox")){
			
			System.setProperty("webdriver.gecko.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.contains("IE")) {
			System.setProperty("webdriver.ie.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
