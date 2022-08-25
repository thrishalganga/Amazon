package Com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpage extends Basepage{
	@FindBy(id="twotabsearchtextbox")
	private WebElement inputenterproduct;
	@FindBy(id="nav-search-submit-button")
	private WebElement clicksubmit;
	@FindBy(xpath="//span[text()='Apple iPhone 13 (128GB) - Starlight']")
	private WebElement clickproduct;
	
	public void searchproduct(String str)
	{
		inputenterproduct.sendKeys(str);
	}
	public void clicksubmit()
	{
		clicksubmit.click();
	}
	public void clickproduct()
	{
		clickproduct.click();
	}


}
