package com.ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.genericUtility.ExcelUtility;
import com.orangehrm.genericUtility.IConstantPath;


public class Pimdelete {
	@FindBy(xpath = "(//*[@placeholder='Type for hints...'])[1]")
    private WebElement EmployeeName;
    @FindBy(xpath = "//*[text()=' Search ']")
    private WebElement Search;
    @FindBy(xpath = "(//*[@type='button'])[5]")
    private WebElement Deletebutton;
    @FindBy(xpath = "//*[text()=' Yes, Delete ']")
    private WebElement YesDelete;

    public Pimdelete(WebDriver driver) 
    {
        PageFactory.initElements(driver, this);
    }
  //click on EmployeeName
    public void clickonEmployeeName() 
    {
        EmployeeName.click();
        ExcelUtility eu = new ExcelUtility();
        String employeename = eu.getExcelData(IConstantPath.excelpath, "Sheet1", 1, 8);
        EmployeeName.sendKeys(employeename);
    }
     
    public void clickonSearch() 
    {
        Search.click();
    }
    
    public void clickonDeletebutton() 
    {
        Deletebutton.click();
    }
    
    public void clickonYesDelete() 
    {
        YesDelete.click();
    }

}
