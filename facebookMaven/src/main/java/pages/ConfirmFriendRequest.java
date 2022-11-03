package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmFriendRequest {
	
	//@FindBy (xpath="//input[@type='text']")
	//private WebElement username ;
	
	//@FindBy (xpath="//input[@type='password']")
	//private WebElement password ;
	
	//@FindBy (xpath="//button[@type='submit']")
	//private WebElement submit ;
	
	@FindBy (xpath="//a[@aria-label='Friends']")
	private WebElement friend ;
	
	@FindBy (xpath ="(//a[@href='/friends/requests/'])[1]")
	private WebElement friendRequest ;
	
	//@FindBy (xpath="(//div[@aria-label='Friend Requests'])[1]")
//	private WebElement friendRequestpage ;
	
	@FindBy (xpath="(//div[@aria-label='Confirm'])[1]")
	private WebElement confirmFriendRequest ;
	
	
	@FindBy (xpath="(//span[text()='Amol Waghmare'])[1]")
	private WebElement viewProfile ;
	
	@FindBy (xpath="(//span[text()='Confirm Request'])[1]")
	private WebElement confirm ;
	public ConfirmFriendRequest(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void Friends()
	{
		friend.click();
	}
	public void FriendRequest()
	{
		friendRequest.click();
	}
	public void  ViewProfile ()
	{
		 viewProfile .click();
	}
	
	public void ConfirmRequest()
	{
		confirm .click();
	}
	


}
