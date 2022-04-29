package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmReturnHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Manas\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
		//String back = driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/a")).getText();
		//System.out.println(back);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
	
	}

}
