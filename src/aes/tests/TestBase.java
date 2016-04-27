package aes.tests;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//import aes.fw.ApplicationManager;


public class TestBase {
	
	public static WebDriver driver;
	public static String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	
//	protected ApplicationManager app;

	@BeforeTest
	public void setUp() throws Exception {
		//app = new ApplicationManager();
		driver = new FirefoxDriver();
		baseUrl = "http://boss.aes-systems.org:8080/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@AfterTest
	public void tearDown() throws Exception {
//		app.stop();
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }

	}
	
	public void openLoginPage() {
		driver.get(baseUrl);
	}
	
	public void submitLogin() {
		driver.findElement(By.name("submit")).click();
	}
	
	public void LogOut() {
		driver.findElement(By.xpath(".//*[@id='sidebar']/a[2]")).click();
	}

	public void fillLoginForm(LoginFormData loginForm) {
	driver.findElement(By.id("login")).clear();
	driver.findElement(By.id("login")).sendKeys(loginForm.login);
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys(loginForm.password);
	}
	

}
