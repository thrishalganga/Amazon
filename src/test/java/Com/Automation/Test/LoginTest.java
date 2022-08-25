package Com.Automation.Test;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.Pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	
	public void verifylogintest()
	{
		DriverUtils.getDriver().get("https://www.amazon.in/");
		LoginPage sp=new LoginPage();
	
		sp.clicksignin();
		sp.enteremail("thrishalganga@gmail.com");
		sp.clickcontinue();
		sp.enterpassword("Oneplus1+");
		sp.clicksubmit();
		
		
		
		
	}

}
