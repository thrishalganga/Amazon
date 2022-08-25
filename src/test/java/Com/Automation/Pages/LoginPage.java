package Com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage {
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	private WebElement Clicksignin;
	@FindBy(id="ap_email")
	private WebElement inputtextemail;
	@FindBy(id="continue")
	private WebElement clickcontinue;
	@FindBy(id="ap_password")
	private WebElement inputtextpassword;
	@FindBy(id="signInSubmit")
	private WebElement clicksubmit;
	
	
	
	public void clicksignin()
	{
		Clicksignin.click();
	}
	public void enteremail(String str)
	{
		inputtextemail.sendKeys(str);
	}
	public void clickcontinue()
	{
		clickcontinue.click();
	}
	public void enterpassword(String str)
	{
		inputtextpassword.sendKeys(str);
	}
	public void clicksubmit()
	{
		clicksubmit.click();
	}
	

}
