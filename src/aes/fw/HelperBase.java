package aes.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

public abstract class HelperBase {
	//abstract - �� ������������ ��� �������� ��������, ������ ������ ���
	protected ApplicationManager manager; //������������ �� ������ ������ ������, �� � � ����������
	
	public HelperBase(ApplicationManager manager) {
		this.manager = manager; //������ �� ����, ������ ������ ������� - ��������
	}
	
	public boolean isElementPresent (By by) {
		try {
			manager.driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	protected void type(By locator, String text) {
		if (text != null) {
			manager.driver.findElement(locator).clear();
			manager.driver.findElement(locator).sendKeys(text);
		} 
	}

	protected void click(By locator) {
		manager.driver.findElement(locator).click();
	}

	protected void selectByText(By locator, String text) {
		if (text != null) {
			new Select(manager.driver.findElement(locator)).selectByVisibleText(text);
		} 
	}
	
}
