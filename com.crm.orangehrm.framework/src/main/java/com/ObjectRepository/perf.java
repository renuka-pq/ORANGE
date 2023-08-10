package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.genericUtility.ExcelUtility;
import com.orangehrm.genericUtility.IConstantPath;

public class perf {
	@FindBy(xpath = "//*[text()='Configure ']")
    private WebElement configure;
	@FindBy(xpath = "//*[text()='Trackers']")
    private WebElement Trackers;
	@FindBy(xpath = "//*[text()=' Add ']")
    private WebElement Addon;
	@FindBy(xpath = "(//input)[2]")
    private WebElement Trackername;
	@FindBy(xpath = "(//input)[3]")
    private WebElement Employeename;
	@FindBy(xpath = "(//input)[4]")
    private WebElement Reviewers;
	@FindBy(xpath="//*[text()=' Cancel ']") private WebElement cancel;
	  public perf(WebDriver driver) 
	    {
	        PageFactory.initElements(driver, this);
	    }
	  public void clickconfigure() {
		  configure.click();	  
	  }
	  public void clicktracker() {
		  Trackers.click();
	  }
	  public void clickadds() {
		  Addon.click();
			
		}
	  public void clicktrack() {
		  Trackername.click();
	        ExcelUtility eu = new ExcelUtility();
	        String firstname = eu.getExcelData(IConstantPath.excelpath, "Sheet3", 1, 0);
	        Trackername.sendKeys(firstname);
		  
	  }
	
	public void clickename() {
		Employeename.click();
		
	}
	public void clickreviewer() {
		Reviewers.click();
	}
	public void clickcancel() {
		cancel.click();
		
	}
	
	  
}
