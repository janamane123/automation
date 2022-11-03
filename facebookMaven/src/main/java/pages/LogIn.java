package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  public class LogIn {
	
	
	@FindBy (xpath= "//input[@type='text']")
	private WebElement userName ;
	
	@FindBy (xpath ="//input[@type='password']")
	private WebElement password ;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement logInButton;
	
	
	 public LogIn (WebDriver  driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void userName()
	{
		userName.sendKeys("9850165447");
	}
	
	public void password()
	{
       password.sendKeys("spartan@41");
	}	
	public void logIn()
	{
		logInButton.click();
	}
	
	
	
	
	
}
	
	
	
	
	
	


