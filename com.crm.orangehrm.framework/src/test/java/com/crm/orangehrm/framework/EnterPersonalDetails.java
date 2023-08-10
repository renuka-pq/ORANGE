package com.crm.orangehrm.framework;

import java.awt.AWTException;

import org.testng.annotations.Test;
import com.ObjectRepository.Homepage;
import com.ObjectRepository.MyInfoPD;
import com.orangehrm.genericUtility.BaseClass;

public class EnterPersonalDetails extends BaseClass {
	@Test(groups = {"smoke"})
	
	public void enterpd() throws InterruptedException, AWTException {
		Homepage hp = new Homepage (driver);
		hp.clickonMyInfo();
		MyInfoPD pd = new MyInfoPD(driver);
		pd.clickonfirstname();
		pd.clickonmiddlename();
		pd.clickonlastname();
		pd.clickonnickname();
		pd.clickonotheID();
		pd.clickondriverslicence();
		pd.clickonssnnumber();
		pd.clickonsinnumber();
		pd.clickonmilitaryservice();
		pd.clickonsave();
		

	
}
}