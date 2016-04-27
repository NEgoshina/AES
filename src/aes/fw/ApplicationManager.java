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
		//�����������, ������������ ��� �������� �������� (������ ���. ��� ������� ��������). ����� ��� ��� � ������ � ��� ������������� ��������, �.�. ��� ��� ������
		driver = new FirefoxDriver();
		baseUrl = "http://boss.aes-systems.org:8080/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //navigationHelper = new NavigationHelper(this); // ��������������� �������������
	}

	public void stop() {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}

	public NavigationHelper getNavigationHelper() { //���������� �������������
		if (navigationHelper == null) {
			navigationHelper = new NavigationHelper(this);
		}
		return navigationHelper;
	}
}
