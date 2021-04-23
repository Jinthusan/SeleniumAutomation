import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/ap/?ir=1");
		
		/*//Login to facebook 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("123");
		//driver.findElement(By.xpath("//*[@name='login']")).click();*/
		
		//Login to Saleforece using xpath derived from regex
		
		driver.findElement(By.cssSelector("a[class*='dropdown-toggle']")).click();
		//driver.findElement(By.xpath("//input[contains(@class,'username')]")).sendKeys("a@b.com");
		driver.findElement(By.xpath("//div[@id='usernamegroup']/div/input[1]")).sendKeys("a@b.com");
		//driver.findElement(By.xpath("//input[contains(@class,'password')]")).sendKeys("123");
		//driver.findElement(By.cssSelector("input[class*='primary']")).click();

	}

}
