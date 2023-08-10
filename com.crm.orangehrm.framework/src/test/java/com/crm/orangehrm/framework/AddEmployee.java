package com.crm.orangehrm.framework;

import com.ObjectRepository.Homepage;
import com.ObjectRepository.PIMAddemployeepage;
import com.orangehrm.genericUtility.BaseClass;

import java.awt.AWTException;

import org.testng.annotations.Test;


public class AddEmployee extends BaseClass  {
	
	@Test(groups = {"smoke"})
	public void  AddEmployeeDetails() throws AWTException, InterruptedException {
		 Homepage hp = new Homepage(driver);
		     hp.clickonPIM();
		     Thread.sleep(3000);
		     PIMAddemployeepage pa = new PIMAddemployeepage(driver);
		        pa.clickonaddemployee();
		        pa.clickonfirstname();
		        pa.clickonmiddlename();
		        pa.clickonlastname();
		        pa.clickonEmployeeId();
		        pa.clickonCreateLoginDetails();
		        pa.clickonusername();
		        pa.clickonpassword(); 
		        pa.clickonconfirmpassword();
		        Thread.sleep(3000);
		        pa.clickonsave();
		
	}

}
