
package login;

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

		myLog.info("******Salesforce automation script Started***********");
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
		myLog.info("******Salesforce automation script ended***********");
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
		myLog.info(url+ "is entered");
	}
	
	public static void maximiseBrowser() {
		driver.manage().window().maximize();
		myLog.info("browser window has maximized");
	}
	public static String getPageTitle() {
		return driver.getTitle();
	}

	public static void refreshPage() {
		driver.navigate().refresh();

	}
	
	public static String getTextFromElement(WebElement ele,String objectName) {
		String data=ele.getText();
		myLog.info("extracted the text from"+objectName);
		return data;
	}
	
	public static void closeBrowser() {
		driver.close();
		myLog.info("browser closed");
	}
	public static void quitBrowser() {
		driver.quit();
		myLog.info("browser closed");
	}
	
	public static void enterText(WebElement ele,String data,String ObjectName) {
		if (ele.isDisplayed()) {
			clearElement(ele, ObjectName);
			ele.sendKeys(data);
			myLog.info("data is entered in the "+ObjectName);
		} else {
			myLog.error(ObjectName+" element is not displayed");
		}
	}
	public static void clearElement(WebElement ele,String ObjectName) {
		if (ele.isDisplayed()) {
			ele.clear();
			myLog.info(ObjectName+" is cleared");
		}
		else {
			myLog.error(ObjectName+" element is not displayed");
		}
	}
	
	public static void clickElement(WebElement ele,String ObjectName) {
		if(ele.isEnabled()) {
			ele.click();
			myLog.info(ObjectName+"button is clicked");
			}
			else {
				myLog.error("button element is not enabled");
			}
	}
	//*******************Handling alerts reusable methods***********************
	
	public static Alert switchToAlert() {
		
		Alert alert= driver.switchTo().alert();
		myLog.info("switched to alert");
		return alert;
		
	}
	
	public static void AcceptAlert(Alert alert) {
		
		myLog.info("Alert accepted");
		alert.accept();
	}
	
	
	public static String getAlertText(Alert alert, String ObjectName) {
		
		myLog.info("Extract text in the "+ ObjectName);
		String text=alert.getText();
		myLog.info("Text extracted from alert box is : "+ text);
		return text;
	}

	
	public static void dismisAlert() {
		
		Alert alert = switchToAlert();
		alert.dismiss();
		myLog.info("Alert dismissed");
	}
	
	//***************************alert ends*********************************
	
	
	
	
	//****************Select class reusable method starts**********************
	
	public static void selectByIndexData(WebElement element,int index, String ObjectName) {
		
		waitForVisibility(element,5,ObjectName);
		Select selectcity = new Select(element);
		selectcity.selectByIndex(index);
		myLog.info(ObjectName + " Selected with index : "+ index);
		
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
	

}
