package com.crm.orangehrm.framework;

import com.ObjectRepository.Homepage;
import com.ObjectRepository.Pimdelete;
import com.orangehrm.genericUtility.BaseClass;
import org.testng.annotations.Test;

public class Deletepim extends BaseClass  {
	@Test(groups = {"smoke"})
	 public void search() throws InterruptedException {

        Homepage hp = new Homepage(driver);
        hp.clickonPIM();
        Pimdelete pp = new Pimdelete(driver);
        pp.clickonEmployeeName();
        pp.clickonSearch();
        pp.clickonDeletebutton();
        pp.clickonYesDelete();

}
}
