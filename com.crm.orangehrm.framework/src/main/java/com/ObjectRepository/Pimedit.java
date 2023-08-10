package com.ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.genericUtility.ExcelUtility;
import com.orangehrm.genericUtility.IConstantPath;

public class Pimedit {
	 @FindBy(xpath = "(//*[@placeholder='Type for hints...'])[1]")
	    private WebElement EmployeeName;
	 @FindBy(xpath = "//*[text()=' Search ']")
	    private WebElement Search;
	 @FindBy(xpath = "(//button)[ @class='oxd-icon-button oxd-table-cell-action-space'][2]")
	 private WebElement Edit;
	 public Pimedit(WebDriver driver) 
	    {
	        PageFactory.initElements(driver, this);
	    }
	 public void clickonEmployeeName() {
		 EmployeeName.click();
		 ExcelUtility eu = new ExcelUtility();
		 String employeename = eu.getExcelData(IConstantPath.excelpath, "Sheet1", 1, 0);
		 EmployeeName.sendKeys(employeename);
		 
	 }
	 public void clickonSearch() 
	    {
	        Search.click();
	    }
	 public void clickonedit() {
		 Edit.click();
	 }
	 
	
}
