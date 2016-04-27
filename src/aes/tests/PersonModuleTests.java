package aes.tests;

import org.testng.annotations.*;

public class PersonModuleTests extends TestBase{

@Test
public void validLogin() throws Exception {
		openLoginPage();
	    //manager.navigationHelper.openLoginPage();
	    LoginFormData loginForm = new LoginFormData();
	    loginForm.login = "zt";
	    loginForm.password = "aes";
		fillLoginForm(loginForm);
	    submitLogin();
	    LogOut();
	}

@Test (enabled = false)
public void invalidLogin() throws Exception {
    openLoginPage();
    LoginFormData loginForm = new LoginFormData();
    loginForm.login = "";
    loginForm.password = "";
	fillLoginForm(loginForm);
    submitLogin();
}
}	
