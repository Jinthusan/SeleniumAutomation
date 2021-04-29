package MavenDemo.MavenJava;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTest {
	
	ExtentReports extent;
	@BeforeTest
	public void config() {
		
		String path =System.getProperty("user.dir")+"\\reports\\index.html";//create path to save report html
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Test Result");
		reporter.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Jinthusan");//giving tester's detail(optional)
	}
	
	
	@Test
	public void initiaDemo() {
		
		extent.createTest("Initial Report Demo");//this will listen the script and generate report
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.close();
		//extent.fail("Result do not match");//to failt test deleberately
		extent.flush();//finish generating the report
	}

}
