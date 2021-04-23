package Section14;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws Throwable, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		SoftAssert s = new SoftAssert();
		
		List<WebElement> Links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link: Links) {
			String url = link.getAttribute("href");
			
			HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int statusCode = con.getResponseCode();
			System.out.println(statusCode);
			s.assertTrue(statusCode<400, "Broken link is "+ url);
			
			/*if(statusCode>400) {
				System.out.println("Broken link is "+ url);
				Assert.assertTrue(false);
			}*/
		}
		
		s.assertAll();

	}

}
