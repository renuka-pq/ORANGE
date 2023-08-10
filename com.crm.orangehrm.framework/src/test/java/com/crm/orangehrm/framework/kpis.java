package com.crm.orangehrm.framework;
import com.ObjectRepository.Homepage;
import com.ObjectRepository.Performance;
import com.orangehrm.genericUtility.BaseClass;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class kpis extends BaseClass{
	@Test
	public void kp() throws InterruptedException, AWTException
	{
		Homepage hp = new Homepage(driver);
        hp.clickonPerformance();
        Performance pp =new Performance(driver); 
        pp.clickconfigure();
        Thread.sleep(3000);
        pp.clickkpis();
        pp.clickadd();
        pp.addkperf();
        pp.krmin();
        pp.krmax();
        pp.bdefault();
        pp.clickcancel();
        	
        }
	
	
}


