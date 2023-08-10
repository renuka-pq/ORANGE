package com.crm.orangehrm.framework;
import com.ObjectRepository.Homepage;
import com.ObjectRepository.perf;
import com.orangehrm.genericUtility.BaseClass;

import java.awt.AWTException;

import org.testng.annotations.Test;


public class tracker extends BaseClass{
	@Test
	public void track() throws InterruptedException, AWTException{
		Homepage hp = new Homepage(driver);
        hp.clickonPerformance();
        perf pp= new perf(driver);
        pp.clickconfigure();
        pp.clicktracker();
        pp.clickadds();
        pp.clicktrack();
        pp.clickename();
        pp.clickreviewer();
        pp.clickcancel();
        
            
        
	}
	

}
