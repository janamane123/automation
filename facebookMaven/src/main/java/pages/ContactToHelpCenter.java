package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactToHelpCenter {
	
	
	
	@FindBy (xpath="//a[@title='Take a look at Messenger.']")
	private WebElement messenger ;
	
	@FindBy (xpath="//a[text()='Rooms']")
	private WebElement room ;

	@FindBy (xpath="//a[text()=' Visit our help center ']")
	private WebElement contactToHelpCenter ;
	
	
	public ContactToHelpCenter(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Messenger() {
		messenger.click();
	}
	
	public void Room()
	{
		room.click();
	}
		
	public void ContactToHelpCenter()
	{
		contactToHelpCenter.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
