package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import commonfunctions.CommonFunctions;


public class HrmSearchEmployee {
	CommonFunctions obj=new CommonFunctions();
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException{
		HrmSearchEmployee search=new HrmSearchEmployee();
		
		search.searchEmployee("Odis");
		search.searchEmployee("odis", "Linda Jane Anderson");
		search.searchEmployee("All", "All", "Current Employees Only","All");
	}
	
	void searchEmployee(String empName) throws InterruptedException  
{

	driver=obj.hrmlogin();
	driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("Odis");
	driver.findElement(By.id("searchBtn")).click();
	String expResult="Odis";
	String actResult=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]/a")).getText();
	Assert.assertEquals(expResult, actResult);
	System.out.println("sucessfuly passed");
	
}
	void searchEmployee(String empName,String supervisorName)
	{
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
		driver.findElement(By.name("empsearch[supervisor_name]")).sendKeys("Linda Jane Anderson");
		//obj.type("empsearch[supervisor_name]", "Linda Jane Anderson");
		driver.findElement(By.id("searchBtn")).click();
		String expResult="Linda Jane Anderson";
		String actResult=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[8]")).getText();
		Assert.assertEquals(expResult, actResult);
	}
	void searchEmployee(String employeementStatus,String Include,String jobTitle,String subUnit) throws AWTException, InterruptedException
	{
		Robot robot=new Robot();
		driver.findElement(By.name("empsearch[employee_status]")).click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.name("empsearch[termination]")).click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.id("empsearch_job_title")).click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.id("empsearch_sub_unit")).click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.name("_search")).click();
		Thread.sleep(1000);
		String expResult=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td")).getText();
		String actResult="No Records Found";
		Assert.assertEquals(expResult, actResult);
		
		
	}
}
	




	
		
			
			
			
			
				
		


		


	

