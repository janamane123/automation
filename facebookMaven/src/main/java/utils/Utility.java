package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import pages.LogIn;


public class Utility {
	
	public static void captureScreen(WebDriver driver,String testId ) throws IOException {
	 TakesScreenshot ts =(TakesScreenshot)driver ;
	 File src = ts.getScreenshotAs(OutputType.FILE); 
	 File dest;
	 dest = new File("C:\\Users\\hp"+timestamp()+testId+".png");
	 try
	 {
	  FileHandler.copy(src, dest);
	 }
	 catch( Exception e)
	 {
		 e.getMessage();
	 }
	}
	public static String timestamp()
 	{
		return new SimpleDateFormat("yyyy-mm-dd  HH-mm-ss").format(new Date());
	}
	
	public static void ExcelSheetHandle()
	{
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



