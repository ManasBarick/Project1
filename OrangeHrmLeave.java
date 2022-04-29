package pack1;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLeave {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Manas\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.out.println(driver);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		OrangeHrmLeave obj=new OrangeHrmLeave();
		obj.leave(driver);
	}
	
	void leave(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).click();
		driver.findElement(By.id("menu_leave_assignLeave")).click();
		//Thread.sleep(1000);
		driver.findElement(By.name("assignleave[txtFromDate]")).click();
		driver.findElement(By.name("assignleave[txtEmployee][empName]")).sendKeys("John Smith");
		driver.findElement(By.id("assignleave_txtLeaveType")).click();
		driver.findElement(By.xpath("//*[@id=\"assignleave_txtLeaveType\"]/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a")).click();
		driver.findElement(By.name("assignleave[txtToDate]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]/a")).click();
		driver.findElement(By.id("assignleave_partialDays")).click();
		driver.findElement(By.xpath("//*[@id=\"assignleave_partialDays\"]/option[2]")).click();
		driver.findElement(By.id("assignleave_txtComment")).sendKeys("want a leave");
		driver.findElement(By.id("assignBtn")).click();
		driver.findElement(By.id("confirmOkButton")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.id("confirmCancelButton")).click();
		
		
	
	}

}
