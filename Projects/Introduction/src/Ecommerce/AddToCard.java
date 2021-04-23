package Ecommerce;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		
		String[] itemsNeeded = {"Cucumber","Beetroot","Tomato"};
		//when declaring as array instead of list bcs array takes only less space of memory	
		
		addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulShetty");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

	}
	public static void addItems(WebDriver driver,String[] itemsNeeded) {
		
		List<WebElement> vegetables= driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		for(int i=0;i<vegetables.size();i++) {
			//String name = arrayName[i]
			String[] name = vegetables.get(i).getText().split("-");
			String formattedName = name[0].trim();
			//it will be spliit into two under one array like "onion", "1 kg"
			//System.out.println(name);
			//Since arraylist has .contains method we can convert the array to arraylist in runtime
			//then find the element in the array found(contain) in the arraylist of vegetables
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			int j=0;
			if(itemsNeededList.contains(formattedName)) {
				
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==itemsNeeded.length) {
					break;
				}
			}
		}
	}

}
