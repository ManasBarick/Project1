package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {


	public static void main(String[]args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Manas\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	
		OrangeHRM obj=new OrangeHRM();
		obj.leave(driver);
	
		

	}
	void leave(WebDriver driver) {
	
	
	driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).click();
	driver.findElement(By.name("leaveList[calFromDate]")).click();
	driver.findElement(By.className("ui-datepicker-month")).click();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a")).click();
	driver.findElement(By.name("leaveList[calToDate]")).click();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[5]/a")).click();
	driver.findElement(By.name("leaveList[txtEmployee][empName]")).sendKeys("STWA SLE");
	driver.findElement(By.id("leaveList_cmbSubunit")).click();
	driver.findElement(By.xpath("//*[@id=\"leaveList_cmbSubunit\"]/option[2]")).click();
	driver.findElement(By.name("btnSearch")).click();
	}
}


