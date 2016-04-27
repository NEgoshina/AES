package aes.tests;

import org.testng.annotations.*;

public class PersonModuleTests extends TestBase{

@Test (enabled = true)
public void validLogin() throws Exception {
		app.getNavigationHelper().openLoginPage();
	    //manager.navigationHelper.openLoginPage();
	    LoginFormData loginForm = new LoginFormData();
	    loginForm.login = "zt";
	    loginForm.password = "aes";
		app.getNavigationHelper().fillLoginForm(loginForm);
	    app.getNavigationHelper().submitLogin();
	    app.getNavigationHelper().LogOut();
	}

@Test (enabled = false)
public void invalidLogin() throws Exception {
    app.getNavigationHelper().openLoginPage();
    LoginFormData loginForm = new LoginFormData();
    loginForm.login = "";
    loginForm.password = "";
	app.getNavigationHelper().fillLoginForm(loginForm);
    app.getNavigationHelper().submitLogin();
}
}	
