package page1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base1.ProjectSpec;

public class Loginpage extends ProjectSpec
{
	public Loginpage enterUsername()
	{
		WebElement uName = driver.findElementById("email");
		uName.sendKeys("kumar.testleaf@gmail.com");
		uName.sendKeys(Keys.TAB);
		return this;
	}
	
	public Loginpage enterPassword() 
	{
		driver.findElementById("password").sendKeys("leaf@12");
		return this;
		
	}
	public VerifyTitle clickLogin() 
	{
		driver.findElementById("buttonLogin").click();
		return new VerifyTitle();
		
	}
	

}
