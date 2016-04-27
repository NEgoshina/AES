package aes.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import aes.fw.ApplicationManager;


public class TestBase {

	protected ApplicationManager app;
	// —сылка на ApplicationManager - используем его методы. Protected - т.к. всем тестовым классам, расшир€ющим TestBase, нужен доступ к ApplicationManager
	
	@BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager(); //проинициализировали - создали экземпл€р объекта

	}
	
	@AfterTest
	public void tearDown() throws Exception {
		app.stop();


	}
	

}
