package com.headlessbrowser.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headlessbrowsertesting {
	
	
	static WebDriver driver = null;
	
	
	
public static void main(String arg[])
{
	
	driver = new HtmlUnitDriver();
	
	
	
	System.out.println("No browser launched");
	
	System.out.println("Headlessbrowser testing successful");
	
 	}
	
	

}
