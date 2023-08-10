package com.ObjectRepository;
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.genericUtility.DriverUtility;
import com.orangehrm.genericUtility.ExcelUtility;
import com.orangehrm.genericUtility.IConstantPath;


public class Performance 
{	
	DriverUtility du = new DriverUtility();
	@FindBy(xpath = "//*[text()='Configure ']")
    private WebElement configure;
	@FindBy(xpath = "//*[text()='KPIs']")
    private WebElement kpis;
	@FindBy(xpath = "//*[text()=' Add ']")
    private WebElement Add;
    @FindBy(xpath = "(//input)[2]")
    private WebElement KeyPerformance;
    @FindBy(xpath = "(//input)[3]")
    private WebElement Ratingmin;
    @FindBy(xpath = "(//input)[4]")
    private WebElement Ratingmax;
    @FindBy(xpath = " //span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    private WebElement Default;
    @FindBy(xpath="//*[text()=' Cancel ']") private WebElement cancel;
    
    
    public Performance(WebDriver driver) 
    {
        PageFactory.initElements(driver, this);
    }
  public void clickconfigure() {
	  configure.click();	  
  }
  public void clickkpis() {
	  kpis.click();
	  
  }
	public void clickadd() {
		Add.click();
		
	}
	public void addkperf() {
		
		
		    KeyPerformance.click();
	        ExcelUtility eu = new ExcelUtility();
	        String firstname = eu.getExcelData(IConstantPath.excelpath, "Sheet2", 1, 0);
	        KeyPerformance.sendKeys(firstname);
	}
	public void krmin() throws AWTException 
	{	Ratingmin.click();
		du.robotAction();
        ExcelUtility eu = new ExcelUtility();
        String third = eu.getExcelData(IConstantPath.excelpath, "Sheet2", 1,1);
        Ratingmin.sendKeys(third);
	}
	public void krmax() throws AWTException 
	{	Ratingmax.click();
		du.robotAction();
        ExcelUtility eu = new ExcelUtility();
        String Second = eu.getExcelData(IConstantPath.excelpath, "Sheet2", 1, 2);
        Ratingmax.sendKeys(Second);
		
	}
	
	public void bdefault() {
		Default.click();
		/*
		 * ExcelUtility eu = new ExcelUtility(); String firstname =
		 * eu.getExcelData(IConstantPath.excelpath, "Sheet2", 1, 0);
		 * Default.sendKeys(firstname);
		 */
	}
	public void clickcancel() {
		cancel.click();
		
		
	}
	


}
