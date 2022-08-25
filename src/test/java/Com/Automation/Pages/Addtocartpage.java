package Com.Automation.Pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocartpage extends Basepage{
	
	@FindBy(id="add-to-cart-button")
	private WebElement clickaddtocart;
	@FindBy(id="attach-sidesheet-checkout-button")
	private WebElement clickcheckout;
	public void switchwin()
	{
		String parentWindow=driver.getWindowHandle();
		Set<String>handles=driver.getWindowHandles();
		for(String windowHandle : handles)
		{
			if(!windowHandle.equals(parentWindow))
			{
				driver.switchTo().window(windowHandle);
			}
		
		}
	}
	public void clickaddtocart()
	{
		clickaddtocart.click();
	}
	public void clickcheckout()
	{
		clickcheckout.click();
	}

}
