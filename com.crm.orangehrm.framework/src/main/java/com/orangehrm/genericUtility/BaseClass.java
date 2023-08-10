package com.orangehrm.genericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ObjectRepository.Homepage;
import com.ObjectRepository.Loginpage;

public class BaseClass
{
	    protected JavaUtility ju;
	    protected WebDriver driver;
	    protected DriverUtility du;
	    protected PropertyFileUtility pf;
	    protected String un;
	    protected String pw;
        
	    public static WebDriver sdriver;
	    
	    @BeforeClass  
	    
	    public void openBrowser()
	    {
	        pf =new PropertyFileUtility();
	        ju=new JavaUtility();
	        String browser =pf.getDataFromPropertyFile(KeysPropertyFile.Browser.convertToString(),IConstantPath.propertyFilepath);
	        String url=pf.getDataFromPropertyFile(KeysPropertyFile.Url.convertToString(),IConstantPath.propertyFilepath);
	        un=pf.getDataFromPropertyFile(KeysPropertyFile.Username.convertToString(),IConstantPath.propertyFilepath);
	        pw=pf.getDataFromPropertyFile(KeysPropertyFile.Password.convertToString(),IConstantPath.propertyFilepath);
	        long timeout =(Long)ju.convertToAnyDataType(pf.getDataFromPropertyFile(KeysPropertyFile.Timeout.convertToString(),IConstantPath.propertyFilepath), "long");
	        du=new DriverUtility();
	        ThreadSafe.setdriverUtility(du);
	        driver=du.openApplication(browser, timeout, url);
	        sdriver=driver;
	        
	    }
	    @BeforeMethod
	    public void loginToApp()
	    {
	        Loginpage lp=new Loginpage(driver);
	        lp.loginAction(un, pw);
	        
	    }
		
		  @AfterMethod public void logoutApp() 
		  {
			  Homepage hp = new Homepage(driver);
		  hp.clickonLogOutDropdown(); hp.clickonLogOut();
		  
		  }
		 
	    
		
		  @AfterClass public void closeBrowser() { driver.quit(); }
		 
	    
	    

	}
