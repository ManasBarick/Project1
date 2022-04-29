package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HrmSearchSupervisor {
	void method() {
		System.setProperty("webdriver.chrome.driver", "D:\\Manas\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
		driver.findElement(By.name("empsearch[supervisor_name]")).sendKeys("Linda Jane Anderson");
		driver.findElement(By.id("searchBtn")).click();
		String expResult="Linda Jane Anderson";
		String actResult=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[8]")).getText();
		Assert.assertEquals(expResult, actResult);
		System.out.println("sucessfully passed");
		
	}

	public static void main(String[] args) {
		HrmSearchSupervisor obj=new HrmSearchSupervisor();
		obj.method();
		
	}

}
