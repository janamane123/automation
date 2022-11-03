package facebookMaven;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.ConfirmFriendRequest;
import pages.LogIn;
import pages.SendFriendRequest;
import setup.Base;

public class VerifySendFriendRequestAndconfirmRequest extends Base {
	private WebDriver driver ;
	private LogIn logIn ;
	private SendFriendRequest   SendingfriendRequest ;
	private ConfirmFriendRequest confirmRequest ;
	private SoftAssert soft ;
	
    @Parameters("browser")
    
    @BeforeTest
    public void launchBrowser(String browserName)
    { 
      if(browserName.equals("Chrome"))
      {
    	  driver= openChromeBrowser();	 
      }
      if(browserName.equals("Firefox"))	
      {
    	  driver = openFirefoxBrowser();
      }
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      driver.manage().window().maximize();
    }
      
	@BeforeClass
	public void createPomClass()
	{
	     logIn = new LogIn(driver);
		 SendingfriendRequest = new SendFriendRequest(driver);
		 confirmRequest = new  ConfirmFriendRequest (driver);
		
		
	}
	@BeforeMethod
	 public void LaunchApplication() throws InterruptedException
	 {
		driver.get("https://www.facebook.com/");
		   logIn.userName();
		   logIn.password();
		   logIn.logIn();  
		   Thread.sleep(3000);
	     SendingfriendRequest.friend(); 
	 }
	@Test  
	 public void SendFriendRequest() 

	 {
        SendingfriendRequest.suggestion();
		 SendingfriendRequest.addFriend(); 
		 String url= driver.getCurrentUrl();
		 String tittle = driver.getTitle();
		 System.out.println(url);
		 System.out.println(tittle);
		 soft =new SoftAssert();
		 soft.assertEquals(url,"https://www.facebook.com/friends");
		 soft.assertEquals(tittle,"Friends | Facebook");
		 soft.assertAll();
	
	 }
	
	
	@AfterMethod 
	public void Logoutfacebook ()
	{
		
		System.out.println("LOgOutfacebook");
	}
	
	@AfterClass
	public void ClearObject()
	{
		logIn =null ;
		SendingfriendRequest =null ;
		confirmRequest =null ;
	}
	@AfterTest
	public void clearBrowser()
	{
		
		driver.close();
		driver =null ;
		System.gc();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
