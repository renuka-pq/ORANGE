package com.ObjectRepository;
import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import com.orangehrm.genericUtility.BaseClass;
import com.orangehrm.genericUtility.ExcelUtility;
import com.orangehrm.genericUtility.IConstantPath;




public class MyInfoPD extends BaseClass {
	@FindBy(xpath="//input[@name='firstName']") private WebElement firstname;

	@FindBy(xpath="//input[@name='middleName']") private WebElement middilename;

	@FindBy(xpath="//input[@name='lastName']") private WebElement lastname;

	@FindBy(xpath="(//input)[5]")private WebElement nickname;

	@FindBy(xpath="(//input)[6])") private WebElement employeeID;

	@FindBy(xpath="(//input)[7]") private WebElement otheID;

	@FindBy(xpath="(//input)[8]") private WebElement driverslicence;

	@FindBy(xpath="(//input)[9]") private WebElement licenceexpirydate;

	@FindBy(xpath="(//input)[10]") private WebElement ssnnumber;

	@FindBy(xpath="(//input)[11]") private WebElement sinnumber;

	@FindBy(xpath="(//input)[12]") private WebElement dob;

	@FindBy(xpath="(//input)[13]")private WebElement male;

	@FindBy(xpath="(//input)[15]") private WebElement militaryservice;

	@FindBy(xpath="(//input)[16]") private WebElement smoker;

	@FindBy(xpath="(//button)[3]") private WebElement save;

	public MyInfoPD (WebDriver driver) {

	PageFactory.initElements(driver, this);

	}

	public void clickonfirstname() throws AWTException {

	firstname.click();

	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_A);

	r.keyPress(KeyEvent.VK_DELETE);

	r.keyRelease(KeyEvent.VK_CONTROL);

	

	
    ExcelUtility eu=new ExcelUtility();
    
	String firstName=eu.getExcelData(IConstantPath.excelpath,"PersonalData",1,0);

	firstname.sendKeys(firstName);

	}

	public void clickonmiddlename() throws AWTException {

	middilename.click();

	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_A);

	r.keyPress(KeyEvent.VK_DELETE);

	r.keyRelease(KeyEvent.VK_CONTROL);

	ExcelUtility eu =new ExcelUtility();

	String middilename = eu.getExcelData(IConstantPath.excelpath, null, 0, 0);

	this.middilename.sendKeys(middilename);

	}

	public void clickonlastname() throws AWTException {

	lastname.click();

	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_A);

	r.keyPress(KeyEvent.VK_DELETE);

	r.keyRelease(KeyEvent.VK_CONTROL);

	ExcelUtility eu =new ExcelUtility();

	String lastname = eu.getExcelData(IConstantPath.excelpath, null, 0, 0);

	this.lastname.sendKeys(lastname);

	}

	{

	// TODO Auto-generated method stub

	}

	public void clickonnickname() throws AWTException {

	nickname.click();

	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_A);

	r.keyPress(KeyEvent.VK_DELETE);

	r.keyRelease(KeyEvent.VK_CONTROL);

	ExcelUtility eu =new ExcelUtility();

	String nickname = eu.getExcelData(IConstantPath.excelpath, null, 0, 0);

	this.nickname.sendKeys(nickname);

	}

	public void clickonemployeeID() throws AWTException {

	employeeID.click();

	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_A);

	r.keyPress(KeyEvent.VK_DELETE);

	r.keyRelease(KeyEvent.VK_CONTROL);

	ExcelUtility eu =new ExcelUtility();

	String employeeID = eu.getExcelData(IConstantPath.excelpath, null, 0, 0);

	this.employeeID.sendKeys(employeeID);

	}

	public void clickonotheID() throws AWTException {

	otheID.click();

	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_A);

	r.keyPress(KeyEvent.VK_DELETE);

	r.keyRelease(KeyEvent.VK_CONTROL);

	ExcelUtility eu =new ExcelUtility();

	String otheID = eu.getExcelData(IConstantPath.excelpath, null, 0, 0);

	this.otheID.sendKeys(otheID);

	}

	public void clickondriverslicence() throws AWTException {

	driverslicence.clear();

	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_A);

	r.keyPress(KeyEvent.VK_DELETE);

	r.keyRelease(KeyEvent.VK_CONTROL);

	ExcelUtility eu =new ExcelUtility();

	String driverslicence = eu.getExcelData(IConstantPath.excelpath, null, 0, 0);

	this.driverslicence.sendKeys(driverslicence);

	}

	public void clickonlicenceexpirydate() throws AWTException {

	licenceexpirydate.clear();

	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_A);

	r.keyPress(KeyEvent.VK_DELETE);

	r.keyRelease(KeyEvent.VK_CONTROL);

	ExcelUtility eu =new ExcelUtility();

	String licenceexpirydate = eu.getExcelData(IConstantPath.excelpath, null, 0, 0);

	this.licenceexpirydate.sendKeys(licenceexpirydate);

	}

	public void clickonssnnumber() throws AWTException {

	ssnnumber.clear();

	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_A);

	r.keyPress(KeyEvent.VK_DELETE);

	r.keyRelease(KeyEvent.VK_CONTROL);

	ExcelUtility eu =new ExcelUtility();

	String ssnnumber = eu.getExcelData(IConstantPath.excelpath, null, 0, 0);

	this.ssnnumber.sendKeys(ssnnumber);

	}

	public void clickonsinnumber() throws AWTException {

	sinnumber.clear();

	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_A);

	r.keyPress(KeyEvent.VK_DELETE);

	r.keyRelease(KeyEvent.VK_CONTROL);

	ExcelUtility eu =new ExcelUtility();

	String sinnumber = eu.getExcelData(IConstantPath.excelpath, null, 0, 0);

	this.sinnumber.sendKeys(sinnumber);

	}

	public void clickondob() throws AWTException {

	dob.clear();

	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_A);

	r.keyPress(KeyEvent.VK_DELETE);

	r.keyRelease(KeyEvent.VK_CONTROL);

	ExcelUtility eu =new ExcelUtility();

	String dob = eu.getExcelData(IConstantPath.excelpath, null, 0, 0);

	this.dob.sendKeys(dob);

	}

	public void clickonmale() throws AWTException {

	male.click();

	}

	public void clickonmilitaryservice() {

	com.orangehrm.genericUtility.ExcelUtility eu =new ExcelUtility();

	String militaryservice = eu.getExcelData(IConstantPath.excelpath, null, 0, 0);

	this.militaryservice.sendKeys(militaryservice);

	}

	public void clickonsmoker() {

	smoker.click();

	}

	public void clickonsave(){

	save.click();}
	

}
