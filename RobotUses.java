package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotUses {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Manas\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).click();
		//driver.findElement(By.id("menu_leave_assignLeave")).click();
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.partialLinkText("Assign ")).click();
		driver.findElement(By.name("assignleave[txtFromDate]")).click();
		driver.findElement(By.name("assignleave[txtEmployee][empName]")).sendKeys("John Smith");
		driver.findElement(By.id("assignleave_txtLeaveType")).click();
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		//robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//driver.findElement(By.xpath("//*[@id=\"assignleave_txtLeaveType\"]/option[4]")).click();
		driver.findElement(By.id("assignleave_txtFromDate")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a")).click();
		driver.findElement(By.name("assignleave[txtToDate]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]/a")).click();
		driver.findElement(By.id("assignleave_partialDays")).click();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("assignleave_txtComment")).click();
	
		robot.keyPress(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_E);
		
		driver.findElement(By.id("assignBtn")).click();
		driver.findElement(By.id("confirmOkButton")).click();
		

	}

}
