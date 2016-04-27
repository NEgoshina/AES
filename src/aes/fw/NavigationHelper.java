package aes.fw;

import org.openqa.selenium.By;

import aes.tests.LoginFormData;

public class NavigationHelper extends HelperBase{

	public NavigationHelper(ApplicationManager manager) {
		super(manager);
		//конструктор базового класса; this - обращение к себе, super - к базовому классу или его экземпл€ру или конструктору
	}

	public void openLoginPage() {
		manager.driver.get(manager.baseUrl);
	}

	public void fillLoginForm(LoginFormData loginForm) {
	type(By.id("login"), loginForm.login);
	type(By.id("password"), loginForm.password);
	}

	public void submitLogin() {
		click(By.name("submit"));
	}

	public void LogOut() {
		click(By.xpath(".//*[@id='sidebar']/a[2]"));
	}

}
