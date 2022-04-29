package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchWikipedia {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Manas\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.findElement(By.name("search")).sendKeys("india");
		driver.findElement(By.id("searchButton")).click();
		String expResult="India";
		String ActResult=driver.findElement(By.id("firstHeading")).getText();
		Assert.assertEquals(expResult, ActResult);
		System.out.println("sucessfully passed");
	}

}

