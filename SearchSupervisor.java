package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchSupervisor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Manas\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("Odis");
		driver.findElement(By.id("searchBtn")).click();
		String expResult="Odis";
		String actResult=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]/a")).getText();
		Assert.assertEquals(expResult, actResult);
		driver.findElement(By.name("empsearch[supervisor_name]")).sendKeys("David Kennedy John");
		driver.findElement(By.id("searchBtn")).click();
		
		
		
	}

}
