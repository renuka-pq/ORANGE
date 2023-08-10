package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(xpath = "//input[@name='username']")
    private WebElement UserNameTextBox;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement PasswordTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public Loginpage(WebDriver driver) 
    {
        PageFactory.initElements(driver, this);
    }

    public void loginAction(String username, String password) 
    {
        UserNameTextBox.sendKeys(username);    //username is taken from excelsheet
        PasswordTextBox.sendKeys(password);    //password is taken from excelsheet
        loginButton.click();                   //click on 

    }
}
