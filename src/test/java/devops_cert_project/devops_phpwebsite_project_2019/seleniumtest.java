package devops_cert_project.devops_phpwebsite_project_2019;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seleniumtest {
	
	static WebDriver driver = null;
	
	
	@BeforeTest
	public static void initDriver() {
		String prjpath=System.getProperty("user.dir");
		System.out.println(prjpath);
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		
		driver = new ChromeDriver();
		driver.get("https://finviz.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public static void pageCheck() {
		
		String page_title=driver.getTitle();
		System.out.println(page_title);
		if(page_title.equalsIgnoreCase("FINVIZ.com - Stock Screener")) {
			System.out.println("Title Check passed");
		}
		else
			System.out.println("Incorrect page loaded");
		
	}

}
