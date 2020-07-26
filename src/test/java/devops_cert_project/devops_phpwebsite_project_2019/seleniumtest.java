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
		driver.get("http://35.238.110.205:8080");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public static void pageCheck() {
		 String x =driver.getTitle();
	  assertEquals(x, "Home | Simple PHP Website");
	  System.out.println(x);
	  
	// driver.findElement(By.id("id")).sendKeys("About Us");
	  driver.findElement(By.id("About Us")).click();
		Thread.sleep(2000);
	  
	//String y=   driver.findElement(By.xpath("//*[@id=\"PID-ab2-pg\"]/text()[2]")).getText();
	  //System.out.println(y);
	//*[@id="PID-ab2-pg"]/text()[2]
	  
	  boolean text= driver.getPageSource().contains("Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. ");
	  System.out.println(text);
	  
	  //String expectedText= "Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry.";
        //System.out.println(expectedText);
        
      
        boolean flag = false;
        if (text)
        	{
        	flag = true;
        	System.out.println("the website is deployed successfully  and it's running fine");
        	}
        
        Assert.assertTrue(flag, "Looks like there is some issue,please check");
	}
	
	
  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }
}
