package aes.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

public abstract class HelperBase {
	//abstract - не предназначен для создания объектов, просто хранит код
	protected ApplicationManager manager; //используется не только внутри класса, но и в помощниках
	
	public HelperBase(ApplicationManager manager) {
		this.manager = manager; //ссылка на поле, данные внутри объекта - параметр
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
