package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewReport {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Manas\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.aitsteam.com/Diploma/ViewReport/");
		driver.findElement(By.id("RegNumber")).sendKeys("AITS/A/1236/19");
		driver.findElement(By.xpath("//*[@id=\"StudName\"]")).sendKeys("NAINIKA RAJ");
		driver.findElement(By.name("submit")).click();
		String show=driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr[3]/td[2]/strong")).getText();
		
		System.out.println(show);
		
	}

}
