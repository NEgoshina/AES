package aes.tests;

import org.testng.annotations.*;

public class PersonModuleTests extends TestBase{

@Test (enabled = true)
public void validLogin() throws Exception {
		app.openLoginPage();
	    //manager.navigationHelper.openLoginPage();
	    LoginFormData loginForm = new LoginFormData();
	    loginForm.login = "zt";
	    loginForm.password = "aes";
		app.fillLoginForm(this, loginForm);
	    app.submitLogin();
	    app.LogOut();
	}

@Test (enabled = false)
public void invalidLogin() throws Exception {
    app.openLoginPage();
    LoginFormData loginForm = new LoginFormData();
    loginForm.login = "";
    loginForm.password = "";
	app.fillLoginForm(this, loginForm);
    app.submitLogin();
}
}	
