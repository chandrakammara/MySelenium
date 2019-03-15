package MavenPackageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyMVNTestNGEx {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	  WebDriver wd = new ChromeDriver();
	  wd.get("https://www.google.com");
	  wd.manage().window().maximize();
	 // Boolean n=false;
	  
	  
	  wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  System.out.println(wd.getTitle());
	  System.out.println("Just Maven Example");
	  wd.close();
	  
	  
  }
}
