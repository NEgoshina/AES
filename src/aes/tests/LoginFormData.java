package aes.tests;

import aes.fw.ApplicationManager;

public class LoginFormData extends TestBase{
	public String login;
	public String password;
	
	protected ApplicationManager app;

	public LoginFormData(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public LoginFormData() {
	}


}