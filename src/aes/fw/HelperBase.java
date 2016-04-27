package aes.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public abstract class HelperBase {
	
	protected ApplicationManager manager;
	
	public HelperBase (ApplicationManager manager) {
		this.manager = manager;
	}
	
	public boolean isElementPresent (By by) {
		try {
			//manager.driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
