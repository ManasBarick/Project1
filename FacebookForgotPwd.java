package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookForgotPwd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Manas\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[role='button']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("james");
		driver.findElement(By.xpath("//input[@type='text']")).clear();
	}

}
