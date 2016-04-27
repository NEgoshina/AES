package aes.fw;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import aes.tests.LoginFormData;
import aes.tests.TestBase;

public class ApplicationManager {
	
	public static WebDriver driver;
	public static String baseUrl;
	private static StringBuffer verificationErrors = new StringBuffer();

	public void submitLogin() {
		driver.findElement(By.name("submit")).click();
	}

	public void LogOut() {
		driver.findElement(By.xpath(".//*[@id='sidebar']/a[2]")).click();
	}

	public void openLoginPage() {
		driver.get(baseUrl);
	}

	public void fillLoginForm(TestBase testBase, LoginFormData loginForm) {
	driver.findElement(By.id("login")).clear();
	driver.findElement(By.id("login")).sendKeys(loginForm.login);
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys(loginForm.password);
	}
	
	public ApplicationManager() {
		//конструктор, используется для создания объектов (методы исп. для готовых объектов). имеет имя как у класса и нет возвращаемого значения, т.е. это сам объект
		driver = new FirefoxDriver();
		baseUrl = "http://boss.aes-systems.org:8080/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void stop() {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}

}
