package pack1;

import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HrmPriorityTestCases {
		WebDriver driver;
		
		  @BeforeMethod
		 void HrmLogin() throws InterruptedException 
		  {
			  System.setProperty("webdriver.chrome.driver", "D:\\Manas\\chromedriver.exe");
			  WebDriver driver=new ChromeDriver();
			   // WebDriverManager.chromedriver().setup();
			 // WebDriverManager.firefoxdriver().setup();
			    driver=new ChromeDriver();
			  //driver=new FirefoxDriver();
			    driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.findElement(By.name("txtUsername")).sendKeys("Admin");
				driver.findElement(By.name("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				 Thread.sleep(3000);
				driver.findElement(By.id("menu_pim_viewPimModule")).click();
		  }
	  @Test(priority=0)
	  public void hrmSearchEmployee() throws InterruptedException {
		  
		  driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("David Morris");
		  driver.findElement(By.id("searchBtn")).click();
		  String actResult=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]/a")).getText();
		  String expResult="David";
		   Assert.assertEquals(expResult, actResult);
		  System.out.println("Succesfully pass : searchEmployee");
	  }
	  @Test(priority=3)
	  public void searchSupervisor() throws InterruptedException
	  {
		  Thread.sleep(1000);
		  driver.findElement(By.name("empsearch[supervisor_name]")).sendKeys("Kevin Mathews");
		  driver.findElement(By.id("searchBtn")).click();
		  String actResult=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[8]")).getText();
		  String expResult="Kevin Mathews";
		   Assert.assertEquals(expResult, actResult);
		  System.out.println("Succesfully pass : searchSupervisor");
	  }
	  @Test(priority=2)
	  public void searchId() throws InterruptedException
	  {
		  Thread.sleep(1000);
		  driver.findElement(By.id("empsearch_id")).sendKeys("0066");
		  driver.findElement(By.id("searchBtn")).click();
		  String actResult=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).getText();
		  String expResult="0066";
		   Assert.assertEquals(expResult, actResult);
		  System.out.println("Succesfully pass : searchId");
	  }
	  
	@Test(priority=4)
	public void dropDownEmpstatus() throws InterruptedException
	{
		//for employee status
		WebElement drpEmpStatusEle=driver.findElement(By.name("empsearch[employee_status]"));
		Select drpEmpStatus=new Select(drpEmpStatusEle);
		drpEmpStatus.selectByVisibleText("Full-Time Permanent");
		 Thread.sleep(3000);
		String actResult=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[3]/select/option[4]")).getText();
		String expResult="Full-Time Permanent";
		 Assert.assertEquals(expResult, actResult);
	}
	@Test(priority=5)
	public void dropDownInclude() throws InterruptedException
	{	
		//for include
		WebElement drpIncludeEle=driver.findElement(By.id("empsearch_termination"));
		Select drpInclude=new Select(drpIncludeEle);
		drpInclude.selectByIndex(2);
		 Thread.sleep(3000);
		String actuResult=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[4]/select/option[3]")).getText();
		String exptResult="Past Employees Only";
		 Assert.assertEquals(exptResult, actuResult);
	}
	@Test(priority=7)
	public void dropDownjobtitle() throws InterruptedException
	{
		//for job title
		 WebElement drpJobTitleEle=driver.findElement(By.name("empsearch[job_title]"));
		 Select drpJobTitle=new Select(drpJobTitleEle);
		 drpJobTitle.selectByValue("24");
		  Thread.sleep(3000);
		 String acResult=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[6]/select/option[15]")).getText();
		 String exResult="HR Associate";
			Assert.assertEquals(exResult, acResult);
	}
	@Test(priority=6)
	public void dropDownSubunit() throws InterruptedException
	{		
			//for sub unit
		WebElement drpSubUnitEle=driver.findElement(By.id("empsearch_sub_unit"));
		Select drpSubUnit=new Select(drpSubUnitEle);
		drpSubUnit.selectByIndex(2);
		 Thread.sleep(3000);
		String acttResult=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[7]/select/option[3]")).getText();
		String exppResult="Engineering";
		Assert.assertEquals(exppResult, acttResult);
		 driver.findElement(By.id("searchBtn")).click();
		System.out.println("Sucessfully pass : dropDowns");
	}
	@Test(priority=1)
	public void logout() throws InterruptedException
	{
		driver.findElement(By.className("panelTrigger")).click();
		 Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();;
		System.out.println("Succesfully pass : logout");
		
	}

	  @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
		  System.out.println("Succesfully pass test case");
	  }

	}


