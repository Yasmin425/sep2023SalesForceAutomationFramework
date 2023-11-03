
package basetest;

import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.reporters.jq.Main;

import Utilities.ExtentReportsUtility;
import Utilities.Log4JUtility;
import Utilities.PropertiesUtility;

public class BaseTest {
	protected static WebDriver driver=null;
	static WebDriverWait wait=null;
    protected static Logger myLog;
   
	
	
	@BeforeMethod
	@Parameters("browsername")
	public static void setUpBeforeTestMethod(@Optional("firefox") String browser_name) {

		System.out.println("******Salesforce automation script Started***********");
		PropertiesUtility pro=new PropertiesUtility();
		Properties applicationProFile=pro.loadFile("applicationDataProperties");
		String url=applicationProFile.getProperty("url");
		launchBrowser(browser_name);
		maximiseBrowser();
		goToUrl(url);
	}
	@AfterMethod
	public void tearDownAfterTestMethod() {
		closeBrowser();
		System.out.println("******Salesforce automation script ended***********");
	}
	
	public static void launchBrowser(String browserName) {
		switch(browserName) {
		case "firefox":driver=new FirefoxDriver();
						System.out.println("firefox browser launched");
						break;
		case "chrome":driver=new ChromeDriver();
						System.out.println("chrome browser launched");
						break;
		default: myLog.error("you have not entrered the correct browser");
		
			
		}
	}
	
	public static void goToUrl(String url) {
		driver.get(url);
		System.out.println(url+ "is entered");
	}
	
	public static void maximiseBrowser() {
		driver.manage().window().maximize();
		System.out.println("browser window has maximized");
	}
	public static String getPageTitle() {
		return driver.getTitle();
	}

	public static void refreshPage() {
		driver.navigate().refresh();

	}
	
	public static String getTextFromElement(WebElement ele,String objectName) {
		String data=ele.getText();
		System.out.println("extracted the text from"+objectName);
		return data;
	}
	
	public static void closeBrowser() {
		driver.close();
		System.out.println("browser closed");
	}
	public static void quitBrowser() {
		driver.quit();
		System.out.println("browser closed");
	}
	
	public static void enterText(WebElement ele,String data,String ObjectName) {
		if (ele.isDisplayed()) {
			clearElement(ele, ObjectName);
			ele.sendKeys(data);
			System.out.println("data is entered in the "+ObjectName);
		} else {
			myLog.error(ObjectName+" element is not displayed");
		}
	}
	public static void clearElement(WebElement ele,String ObjectName) {
		if (ele.isDisplayed()) {
			ele.clear();
			System.out.println(ObjectName+" is cleared");
		}
		else {
			myLog.error(ObjectName+" element is not displayed");
		}
	}
	
	public static void clickElement(WebElement ele,String ObjectName) {
		if(ele.isEnabled()) {
			ele.click();
			System.out.println(ObjectName+" is clicked");
			}
			else {
				myLog.error("button element is not enabled");
			}
	}
	//*******************Complete Handling alerts reusable methods***********************
	
	public static Alert switchToAlert() {
		
		Alert alert= driver.switchTo().alert();
		System.out.println("switched to alert");
		return alert;
		
	}
	
	public static void AcceptAlert(Alert alert) {

		alert.accept();
		System.out.println("Alert accepted");
	}
	
	
	public static String getAlertText(Alert alert, String ObjectName) {
		
		System.out.println("Extract text in the "+ ObjectName);
		String text=alert.getText();
		System.out.println("Text extracted from alert box is : "+ text);
		return text;
	}

	
	public static void dismisAlert() {
		
		Alert alert = switchToAlert();
		alert.dismiss();
		System.out.println("Alert dismissed");
	}
	
	//***************************alert ends*********************************
	
	//*************************Complete Action class reusable methods*********************
	
	public static void waitUntilPageLodes() {
		System.out.println("Waiting until page loads with 30 sec maximum");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	public static void moveToElementAction(WebElement ele,String objName) {
		Actions action= new Actions(driver);
		action.moveToElement(ele).build().perform();
		System.out.println(" cursor moved to web element "+objName);	
	}
	public static void ContextClickAction(WebElement ele,String objName) {
		Actions action= new Actions(driver);
		action.contextClick(ele).build().perform();
		System.out.println("right click performed on web element "+objName);	
	}
	
	//****************Action class reusable method ends**************************
	
	//****************Complete Select class reusable method starts**********************
	
	public static void selectByIndexData(WebElement element,int index, String ObjectName) {
		
		waitForVisibility(element,5,ObjectName);
		Select select = new Select(element);
		select.selectByIndex(index);
		System.out.println(ObjectName + " Selected with index : "+ index);
		
	}
	
    public static void selectByTextData(WebElement element,String text, String ObjectName) {
		
		waitForVisibility(element,5,ObjectName);
		Select select = new Select(element);
		select.selectByVisibleText(text);
		System.out.println(ObjectName + " Selected "+ text);
		
	}
    
    public static void selectByValueData(WebElement element,String text, String ObjectName) {
		
		waitForVisibility(element,5,ObjectName);
		Select select = new Select(element);
		select.selectByValue(text);
		System.out.println(ObjectName + " Selected "+ text);
		
	}
	
	//****************Select class reusable method ends**********************
	
	
	public static void waitForVisibility(WebElement ele,int time, int pollingtime, String ObjectName) {
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(time))
		.pollingEvery(Duration.ofSeconds(pollingtime))
		.ignoring(ElementNotInteractableException.class);
			
	}
	
	public static void waitForVisibility(WebElement ele,int time, String objectName) {
		
		wait= new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
    public static void waitForAlertPresent(int time) {
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
	}
    
    public static void switchToWindowOpened(String mainWindowHandle) {
    	Set<String> allWindowHandles = driver.getWindowHandles();
    	for (String handle: allWindowHandles) {
    		if(!mainWindowHandle.equalsIgnoreCase(handle))
    			driver.switchTo().window(handle);
    	}
    	
    }
    
    //*******************************PageWebElements****************************************
    
public static void GettoProfilePage(String expected) {
		
		WebElement MyProfilePageEle= driver.findElement(By.id("tailBreadcrumbNode"));
        waitForVisibility(MyProfilePageEle, 5, "My Profile Page");
		String actual= MyProfilePageEle.getText();
		System.out.println("text is extracted from My Profile Page element");
		Assert.assertEquals(actual, expected,"Pass: testcase passed");
		
	}

public static WebElement SharingElement() {
	WebElement ShareButtonEle= driver.findElement(By.id("publishersharebutton"));
    return ShareButtonEle;
  
}

public static void GettoMySettingPage(String expected) {
	
	WebElement MySettingPageEle= driver.findElement(By.xpath("//*[@id=\"PersonalSetup_font\"]/span[2]"));
    waitForVisibility(MySettingPageEle, 5, "My Setting Page");
	String actual= MySettingPageEle.getText();
	System.out.println("text is extracted from My Setting Page element");
	Assert.assertEquals(actual, expected,"Pass: testcase passed");
	
}

public static void FromCalanderHandler() 
{

		
	List<WebElement> allDates=driver.findElements(By.xpath("//*[@id=\"ext-gen274\"]"));
	
            // now we will iterate all values and will capture the text. We will select when date is 28
	for(WebElement ele:allDates)
	{
		
		String date=ele.getText();
		
                    // once date is 28 then click and break
		if(date.equalsIgnoreCase("2"))
		{
			ele.click();
			break;
		}
		
	}
	
	
}

public static void ToCalanderHandler() 
{
		
	List<WebElement> allDates=driver.findElements(By.xpath("//*[@id=\"ext-gen287\"]"));
	
            // now we will iterate all values and will capture the text. We will select when date is 28
	for(WebElement ele:allDates)
	{
		
		String date=ele.getText();
		
                    // once date is 28 then click and break
		if(date.equalsIgnoreCase("2"))
		{
			ele.click();
			break;
		}
		
	}
	
	
}

}
