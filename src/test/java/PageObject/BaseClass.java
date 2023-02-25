package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
		
	 public String baseUrl ="https://dsportalapp.herokuapp.com/home ";
	 
	
			
	 public String usename =" Dsnumpy ";
	
	 public String password ="abcd123!";
	 public WebDriver driver=null;//new ChromeDriver();
	 public BaseClass() {
		 System.setProperty("webdriver.chrome.driver","C:\\workspace\\Helloselenium\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	

}
