package Com.Automation.Test;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.Pages.LoginPage;
import Com.Automation.Pages.Searchpage;

public class SearchTest extends BaseTest{
	@Test
	public void verifylogintest() throws InterruptedException
	{
		DriverUtils.getDriver().get("https://www.amazon.in/");
		LoginPage sp=new LoginPage();
		Searchpage sr=new Searchpage();

		
	
		sp.clicksignin();
		sp.enteremail("thrishalganga@gmail.com");
		sp.clickcontinue();
		sp.enterpassword("Oneplus1+");
		sp.clicksubmit();
		Thread.sleep(2000);
		sr.searchproduct("iphone");
		
		sr.clicksubmit();
		sr.clickproduct();

}
}
