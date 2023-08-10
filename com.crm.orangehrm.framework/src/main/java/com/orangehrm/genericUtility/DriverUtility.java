package com.orangehrm.genericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;





public class DriverUtility 
{
    WebDriver driver;
    /**
     * this method contain set the application...open the browser,maximize and provideimplicitly wait.
     * @param browser
     * @param timeout
     * @param url
     * @return
     * 
     */
    public WebDriver openApplication(String browser, long timeout, String url) {
    //WebDriver driver=null;
    if(browser.equals("chrome"))
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    //launch the browser
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    driver.get(url);
    return driver;
    
    }

    public void logoutBrowser(WebDriver driver)
    {
        driver.findElement(By.xpath("")).click();                
    }
    public void closeBrowser(WebDriver driver) {
        driver.quit();
    }
    /**
     * used to wait for a element to be clickable in gui,and check for specific element
     */
    public void scriptTimeout(WebDriver driver) {
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        
    }
    public void waitForElementToBeClickable(WebDriver driver,WebElement Element) {
        /**
         * used to wait for a element to be click able in gui,and check for specific element
         */
    	WebDriverWait wait =new WebDriverWait(driver,null);
        wait.until(ExpectedConditions.elementToBeClickable(Element ));
        }
    public void mouseHoverMOveToElement(WebDriver driver,WebElement element) {
        /**
         * this method provide the functionality to hover the mouse to a 
         * particular element.
         */
        Actions a =new Actions(driver);
        a.moveToElement(element).perform();
        
    }
    public void rightClick(WebDriver driver,WebElement element)
    {
        /**
         * this method provide the functionality to perform right click
         * on the desired element
         */
        Actions a = new Actions(driver);
        a.contextClick(element).perform();
        
    }
    public void doubleClick(WebDriver driver,WebElement element)
    {
        /**
         * this method provide the functionality to perform double click
         * on a particular element
         */
        Actions a = new Actions(driver);
        a.dragAndDrop(element, element).perform();
                
    }
    public void dragAndDrop(WebDriver driver,WebElement element) {
        /**
         * this method provide the functionality to select the element based
         * on the desired element.
         */
        Actions a = new Actions(driver);
        a.dragAndDrop(element, element).perform();
    
        }
    
    public void slectByVisibleText(WebElement element,String text) {
    	  /**
    	   * this method provide the functionality to select the element based 
         * on the visible text
         */
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }
    public void selectByValue(WebElement element,String text) {
        /**
         * this method provide the functionlity to select the element based 
         * on the values of HTML codes
         */
        Select s = new Select(element);
        s.selectByValue(text);
    }
  
        public void selectByIndex(WebElement element,int num)
        {
            /**
             * this method provide the functionality to select the element based
             * on the index of element in HTML codes.
             */
            Select s =new Select(element);
            s.selectByIndex(num);
        }
        public void switchToFrameByIndex(WebDriver driver,int index)
        {
            /**
             * this method provide the functionality switch the window on the basis
             * of index
             */
            driver.switchTo().frame(index);
            
        }
        
        public void switchToFrameAttribute(WebDriver driver, String id) {
            /**
             * this method provide the functionality switch the window on the basis
             * on attribute.
             */
            driver.switchTo().frame(id);
        }
        public void switchToAlertAccept(WebDriver driver) {
            /**
             * this method provide the functionality to click OK(accept)
             */
            driver.switchTo().alert().accept();
        }
        public void switchToAlertDismiss(WebDriver driver) {
            
            /**
             * this method provide the functionality to click CANCEL(dismiss)
             */
        driver.switchTo().alert().dismiss();
        }
        public void scrollIntoView (WebElement element, WebDriver driver)
        {
            /**
             * this method provide the functionality to scroll down the pages.
             */
            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView()",element);
            
        }
        public By convertStringToBy(String xpath) {
            /**
             * this method provide the functionalityy to convert string to 
             * By type
             */
            return By.xpath(xpath);
        }
       /* public String takeScreenshot(String testName) throws Throwable
        {
            SimpleDateFormate formatter-new SimpleDateFormate("dd_MM_YYYY_HH_mm_sss");
            Date date =new Date(0);
            String time = formatter.formate(date);
            System.out.println(time);
            TakesScreenshot ts=(TakesScreenshot)driver;
            java.io.File src = ts.getScreenshotAs(OutputType.FILE);
            File dest=new File("./screenshot/"+testName+"_"+time+".PNG");
            FileUtils.copyFile(src, dest);
            return dest.getAbsolutePath();
            
            
        }*/
       /*public String takeScreenshot() {
            TakesScreenshot ts=(TakesScreenshot)driver;
            String src = ts.getScreenshotAs(OutputType.BASE64);
            return src;
            
    }*/
        public void robotAction() throws AWTException {

        	Robot r = new Robot();

        	r.keyPress(KeyEvent.VK_CONTROL);

        	r.keyPress(KeyEvent.VK_A);

        	r.keyPress(KeyEvent.VK_DELETE);

        	r.keyRelease(KeyEvent.VK_CONTROL);
        }
    
 
}

    	   
    