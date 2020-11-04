package extnreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extnrpt {

	public WebDriver driver;
	public ExtentHtmlReporter htmlreport;
	public ExtentReports reports;
	//public ExtentTest t;
	ExtentTest test;

	  static 
	  { 
		  System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	  }
	 

	
	  @BeforeMethod
	  public void openreport() 
	  { 
		 htmlreport = new ExtentHtmlReporter("extentreport.html");
	  
	   reports = new ExtentReports();
	  
	  reports.attachReporter(htmlreport);
	  }
	 

	@Test
	public void login() throws InterruptedException  {
		test = reports.createTest("test1","validating login page");
		test.log(Status.INFO, "begin");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://localhost:90/login.do");
		Thread.sleep(3000);
		
		System.out.println("Entering url");
		test.pass("Passed");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		System.out.println("Entering username");
		
		test.pass("Passed");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		System.out.println("Entering password");
		test.pass("Passed");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		System.out.println("clicking on login");
		test.pass("Passed");
				
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		test.info("end");
		
	}
	
	  @AfterMethod
	  public void end()
	  {
		  reports.flush();
	  }
	 

}
