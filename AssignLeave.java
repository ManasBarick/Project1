package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignLeave {
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "D:\\Manas\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		  AssignLeave obj= new AssignLeave();
		  obj.Leave(driver);
		  //obj.stringAdd(4,5);
		  driver.close();
	
	}
	void Leave(WebDriver ABC) throws InterruptedException
	{
	
		ABC.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		ABC.findElement(By.xpath ("//a[@id='menu_leave_assignLeave']")).click();
        ABC.findElement (By.xpath("//input[@id='assignleave_txtEmployee_empName']")).sendKeys("Charlie Carter");
		WebElement leaveType=ABC.findElement(By.xpath("//select[@name='assignleave[txtLeaveType]']"));
		Select s= new Select(leaveType);
		s.selectByVisibleText("CAN - Bereavement");
		
		/*ABC.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]")).click();
		Thread.sleep(2000);
		WebElement selectMonth=ABC.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select m= new Select(selectMonth);
		m.selectByVisibleText("Ar");
		WebElement selectYear=ABC.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select y= new Select(selectYear);
		y.selectByValue("2022");
		Thread.sleep(3000);
		ABC.findElement(By.xpath("//tbody/tr[2]/td[2]/a[1]")).click();

		ABC.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[2]")).click();
		Thread.sleep(2000);
		WebElement selectMon=ABC.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select M= new Select(selectMon);
		M.selectByVisibleText("Apr");
		WebElement selectYr=ABC.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select Y= new Select(selectYr);
		Thread.sleep(3000);
		Y.selectByValue("2022");
		Thread.sleep(3000);
		ABC.findElement(By.xpath("//tbody/tr[2]/td[2]/a[1]")).click();
		Thread.sleep(3000);*/
		Thread.sleep(3000);
		ABC.findElement (By.xpath("//input[@id='assignleave_txtFromDate']")).click();
		ABC.findElement(By.xpath("//input[@id='assignleave_txtFromDate']")).sendKeys("2022-04-06");
		Thread.sleep(3000);
		ABC.findElement (By.xpath("//*[@id=\"assignleave_txtToDate\"]")).click();
		ABC.findElement(By.xpath("//*[@id=\"assignleave_txtToDate\"]")).sendKeys("2022-04-09");
		Thread.sleep(3000);
		/*WebElement partialDays=ABC.findElement(By.xpath("//select[@id='assignleave_duration_duration']"));
		Select d= new Select(partialDays);
		d.selectByVisibleText("All_Days");
		Thread.sleep(3000);*/
		WebElement duration=ABC.findElement(By.xpath("//select[@id='assignleave_duration_duration']"));
		Select D= new Select(duration);
		D.selectByValue("half_day");
		Thread.sleep(3000);
		WebElement amPm=ABC.findElement(By.xpath("//select[@id='assignleave_duration_ampm']"));
		Select A= new Select(amPm);
		A.selectByValue("PM");
		Thread.sleep(3000);
		ABC.findElement(By.xpath ("//textarea[@id='assignleave_txtComment']")).sendKeys("Grant_my_leave.");
		Thread.sleep(3000);
		
		
		}
	
	/*void stringAdd(int a,int b)
	{
		int a=4;
		int b=5;
		int sum=0;
		sum=a+b;
	}*/
	
		
	

}


