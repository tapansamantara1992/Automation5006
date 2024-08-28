package com.Generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility
{
	public static WebDriver driver;

	public static void selectBasedDropdown(WebElement ddele,String value)
	{
		Select d1=new Select(ddele);
		System.out.println("Is dropdown support multiple selection?: "+d1.isMultiple());
		List<WebElement> allOptions=d1.getOptions();
		System.out.println("Total Options are: "+allOptions.size());
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
		
	}
	
	
	
	public static WebElement getElementById(String id)
	{
		return driver.findElement(By.id(id));
	}
	
	public static WebElement getElementByLinkText(String linktext)
	{
		return driver.findElement(By.linkText(linktext));
	}
	
	
	
	
}