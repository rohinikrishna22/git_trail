package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass{
	
	public RegistrationPage() {
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\Numpy-DSAlgo\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chromeOptions.setAcceptInsecureCerts(true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://dsportalapp.herokuapp.com/home");
		PageFactory.initElements(driver,this);
	  
		
	}
	
	@FindBy(using="id_username")
	private WebElement txtusename;
   
   @FindBy(using="id_password1")
   private  WebElement txtpassword1;
   @FindBy(using="id_password2")
   private  WebElement txtpassword2;
   
   @FindBy(xpath ="//div[2]/div/div[2]/form/input[4]")
   private  WebElement submit;
   
   
   public   void register(){
		 PageFactory.initElements(driver,this);
		 driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")).click();
		 txtusename.sendKeys("Dsnumpy12");
		 txtpassword1.sendKeys("abcd12345!");
		 txtpassword2.sendKeys("abcd12345!");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]")).click();
		// driver.findElement(By.xpath("/html/body/div[3]/div[5]/div/div/a")).click();
	
	}
   
   }
