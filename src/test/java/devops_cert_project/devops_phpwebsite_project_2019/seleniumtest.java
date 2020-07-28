package devops_cert_project.devops_phpwebsite_project_2019;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;

public class seleniumtest {
	
	static WebDriver driver = null;
	
	
	@BeforeTest
	public static void initDriver() {
		//String prjpath=System.getProperty("user.dir");
		//System.out.println(prjpath);
		//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		//driver = new ChromeDriver();
		driver = new HtmlUnitDriver();
		driver.get("http://34.66.5.217:8080");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public static void pageCheck() throws InterruptedException  {
		 String x =driver.getTitle();
	  assertEquals(x, "Homme | Simple PHP Website");
	  System.out.println(x);

	}
	
	
  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }
}
