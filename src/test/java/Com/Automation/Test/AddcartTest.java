package Com.Automation.Test;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.Pages.Addtocartpage;
import Com.Automation.Pages.LoginPage;
import Com.Automation.Pages.Searchpage;

public class AddcartTest extends BaseTest {
	@Test
	
	public void verifylogintest() throws InterruptedException
	{
		DriverUtils.getDriver().get("https://www.amazon.in/");
		DriverUtils.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage sp=new LoginPage();
		Searchpage sr=new Searchpage();
		Addtocartpage ap=new Addtocartpage();
	
		sp.clicksignin();
		sp.enteremail("thrishalganga@gmail.com");
		sp.clickcontinue();
		sp.enterpassword("Oneplus1+");
		sp.clicksubmit();
		Thread.sleep(2000);
		sr.searchproduct("iphone");
		Thread.sleep(3000);
		sr.clicksubmit();
		sr.clickproduct();
		Thread.sleep(3000);
		ap.switchwin();
		ap.clickaddtocart();
		ap.clickcheckout();


}

}
