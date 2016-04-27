package aes.fw;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {
	
	public WebDriver driver;
	public String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	
	private NavigationHelper navigationHelper;

	public ApplicationManager() {
		//конструктор, используется для создания объектов (методы исп. для готовых объектов). имеет имя как у класса и нет возвращаемого значения, т.е. это сам объект
		driver = new FirefoxDriver();
		baseUrl = "http://boss.aes-systems.org:8080/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //navigationHelper = new NavigationHelper(this); // предварительная инициализация
	}

	public void stop() {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}

	public NavigationHelper getNavigationHelper() { //отложенная инициализация
		if (navigationHelper == null) {
			navigationHelper = new NavigationHelper(this);
		}
		return navigationHelper;
	}
}
