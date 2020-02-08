package page1;

import base1.ProjectSpec;

public class VerifyTitle extends ProjectSpec
{
	public void verifyTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}

}
