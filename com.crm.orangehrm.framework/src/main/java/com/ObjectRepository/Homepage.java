package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	 @FindBy(xpath = "//span[text()='Dashboard']")
	    private WebElement Dashboard;
	    @FindBy(xpath = "//span[text()='Admin']")
	    private WebElement Admin;
	    @FindBy(xpath = "//span[text()='PIM']")
	    private WebElement PIM;
	    @FindBy(xpath = "//span[text()='Leave']")
	    private WebElement Leave;
	    @FindBy(xpath = "//span[text()='Time']")                
	    private WebElement Time;
	    @FindBy(xpath = "//span[text()='Recruitment']")
	    private WebElement Recruitment;
	    @FindBy(xpath = "//span[text()='My Info']")
	    private WebElement MyInfo;
	    @FindBy(xpath = "//span[text()='Performance']")
	    private WebElement Performance;
	    @FindBy(xpath = "//span[text()='Directory']")
	    private WebElement Directory;
	    @FindBy(xpath = "//span[text()='Maintenance']")
	    private WebElement Maintenanace;
	    @FindBy(xpath = "//span[text()='Buzz']")
	    private WebElement Buzz;
	    @FindBy(xpath = "//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	    private WebElement LogOutDropdown;
	    @FindBy(xpath = "//*[text()='Logout']")
	    private WebElement LogOut;
	    
	    

	    public Homepage(WebDriver driver) 
	    {
	        PageFactory.initElements(driver, this);
	    }

	    public void clickonDashboard() 
	    {
	        Dashboard.click();
	    }
	    //click on ADMIN
	    public void clickonAdmin()
	    {
	        Admin.click();
	    }
	    //click on PIM
	    public void clickonPIM() 
	    {
	        PIM.click();
	    }

	    public void clickonLeave() 
	    {
	        Leave.click();
	    }

	    public void clickonTime() 
	    {
	        Time.click();
	    }

	    public void clickonRecruitment()
	    {
	        Recruitment.click();
	    }

	    public void clickonMyInfo() 
	    {
	        MyInfo.click();
	    }

	    public void clickonPerformance()
	    {
	        Performance.click();
	    }

	    public void clickonDirectory()
	    {
	        Directory.click();
	    }

	    public void clickonMaintenanace() 
	    {
	        Maintenanace.click();
	    }

	    public void clickonBuzz() 
	    {
	        Buzz.click();
	    }
	    //Click on Logoutdropdown
	    public void clickonLogOutDropdown()
	    {
	        LogOutDropdown.click();
	    }
	    //click on Logout
	    public void clickonLogOut()
	    {
	        LogOut.click();
	    }


}
