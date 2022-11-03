package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	
	
	@FindBy (xpath="//*[local-name() = 'svg' and @aria-label='Your profile']")
	private WebElement profile ;
	
	@FindBy (xpath="//span[text()='Log Out']")
	private WebElement logOut ;
	
	public LogOut (WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void Profile ()
	{
		profile.click();
	}
	public void LogOut()

	{
		logOut.click();
	}
	
	
	
	
	
	
	
	
	

}
