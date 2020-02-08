package test1;

import org.testng.annotations.Test;

import base1.ProjectSpec;
import page1.Loginpage;

public class TC001_Loginpage extends ProjectSpec
{
	@Test
	public void runTC001() 
	{
		new Loginpage().enterUsername().enterPassword().clickLogin().verifyTitle();
		
	}

}
