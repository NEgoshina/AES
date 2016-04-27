package aes.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import aes.fw.ApplicationManager;


public class TestBase {

	protected ApplicationManager app;
	// ������ �� ApplicationManager - ���������� ��� ������. Protected - �.�. ���� �������� �������, ����������� TestBase, ����� ������ � ApplicationManager
	
	@BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager(); //������������������� - ������� ��������� �������

	}
	
	@AfterTest
	public void tearDown() throws Exception {
		app.stop();


	}
	

}
