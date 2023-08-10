package com.ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.genericUtility.DriverUtility;
import com.orangehrm.genericUtility.ExcelUtility;
import com.orangehrm.genericUtility.IConstantPath;
import java.awt.AWTException;



public class PIMAddemployeepage {
	
	 @FindBy(xpath = "//a[text()='Add Employee']")
	    private WebElement AddEmployee;
	    @FindBy(xpath = "//*[@name='firstName']")
	    private WebElement FirstName;
	    @FindBy(xpath = "//*[@name='middleName']")
	    private WebElement MiddleName;
	    @FindBy(xpath = "//*[@name='lastName']")
	    private WebElement LastName;
	    @FindBy(xpath = "(//input)[6]")
	    private WebElement EmployeeId;
	    @FindBy(xpath = "//*[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	    private WebElement CreateLoginDetails;
	    @FindBy(xpath = "(//*[@autocomplete='off'])[1]")
	    private WebElement UserName;
	    @FindBy(xpath = "(//*[@autocomplete='off'])[2]")
	    private WebElement PassWord;
	    @FindBy(xpath = "(//*[@autocomplete='off'])[3]")
	    private WebElement ConfirmPassWord;
	    @FindBy(xpath = "//*[text()=' Save ']")
	    private WebElement save;
	    public PIMAddemployeepage(WebDriver driver) 
	    {
	        PageFactory.initElements(driver, this);
	    }
	      
	    public void clickonfirstname() 
	    {
	        FirstName.click();
	        ExcelUtility eu = new ExcelUtility();
	        String firstname = eu.getExcelData(IConstantPath.excelpath, "Sheet1", 1, 0);
	        FirstName.sendKeys(firstname);
	    }
	    
	    public void clickonmiddlename() 
	    {
	        MiddleName.click();
	        ExcelUtility eu = new ExcelUtility();
	        String middlename = eu.getExcelData(IConstantPath.excelpath, "Sheet1", 1, 1);
	        MiddleName.sendKeys(middlename);

	    }
	     
	    public void clickonlastname() 
	    {
	        LastName.click();
	        ExcelUtility eu = new ExcelUtility();
	        String lastname = eu.getExcelData(IConstantPath.excelpath, "Sheet1", 1, 2);
	        LastName.sendKeys(lastname);
	    }
	    //click on EmployeedId after that by using the robot class first i delete the previous data and  after enterd new data
	    public void clickonEmployeeId() throws AWTException 
	    {
	        EmployeeId.click();
	        DriverUtility du=new DriverUtility();
	        
	        du.robotAction();
	        ExcelUtility eu = new ExcelUtility();
	        String employeeid = eu.getExcelData(IConstantPath.excelpath, "Sheet1", 1, 3);
	        EmployeeId.sendKeys(employeeid);
	    }
	     
	    public void clickonCreateLoginDetails() 
	    {
	        CreateLoginDetails.click();

	    }
	    
	    public void clickonusername() 
	    {
	        UserName.click();
	        ExcelUtility eu = new ExcelUtility();
	        String username = eu.getExcelData(IConstantPath.excelpath, "Sheet1", 1, 5);
	        UserName.sendKeys(username);
	    }
	    //click on password
	    public void clickonpassword() 
	    {
	        PassWord.click();
	        ExcelUtility eu = new ExcelUtility();
	        String password = eu.getExcelData(IConstantPath.excelpath, "Sheet1", 1, 6);
	        PassWord.sendKeys(password);

	    }
	   
	    public void clickonconfirmpassword() 
	    {
	        ConfirmPassWord.click();
	        ExcelUtility eu = new ExcelUtility();
	        String confirmpassword = eu.getExcelData(IConstantPath.excelpath, "Sheet1", 1, 7);
	        ConfirmPassWord.sendKeys(confirmpassword);
	    }
	    
	    public void clickonaddemployee() 
	    {
	        AddEmployee.click();
	    }
	    //finally click on save and it will save 
	    public void clickonsave() 
	    {
	        save.click();
	    }


}
