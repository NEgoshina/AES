package aes.tests;

import org.testng.annotations.Test;

public class CompanyModuleTests extends TestBase{
	
	
	@Test
	public void validLogin() throws Exception {
			app.openLoginPage();
		    //manager.navigationHelper.openLoginPage();
		    LoginFormData loginForm = new LoginFormData();
		    loginForm.login = "adm.adm";
		    loginForm.password = "3admin124";
			loginForm.app.fillLoginForm(loginForm, loginForm);
		    app.submitLogin();
		    app.LogOut();
		}


}
