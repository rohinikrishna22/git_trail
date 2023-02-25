package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass{
	
	public Loginpage() {
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\Numpy-DSAlgo\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chromeOptions.setAcceptInsecureCerts(true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://dsportalapp.herokuapp.com/home");
		PageFactory.initElements(driver,this);
	    //driver.get(baseUrl);
		
	}
	
	@FindBy(using="id_username")
	private WebElement txtusename;
   
   @FindBy(using="id_password")
   private  WebElement txtpassword;
   
   @FindBy(xpath ="//div[2]/div/div[2]/form/input[4]")
   private  WebElement submit;
   
   
   public void setusername(String uname) {
	   
	   txtusename.sendKeys(uname);}
   
   public void setpassword(String pwd) {
	   txtpassword.sendKeys(pwd);
   }
     
   public  void login() 
	{
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();
		txtusename.sendKeys(usename);
		txtpassword.sendKeys(password);
		submit.click();
		System.out.println("Successfully logged in ");
	}   
	   
   }
