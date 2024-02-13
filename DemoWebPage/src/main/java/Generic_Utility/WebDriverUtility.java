package Generic_Utility;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select s;
	public static Actions a;
	public static JavascriptExecutor js;  // scroling the page
	public static Properties p;
	
	
	
	/**
	 * this method is used to open url
	 * @param url
	 */
	public static void getUrl(String url) {
	driver.get(url);
	}
	/**
	 * this method is used to get current url of webpage
	 * @return
	 */
	public static String currentUrl() {
		return driver.getCurrentUrl();
	}
	/**
	 * 
	 */
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	/**
	 * this method is used to get source code of webpage
	 * @return
	 */
	public static String pageSource() {
		return driver.getPageSource();
	}
	/**
	 * this method is used to get title of webpage
	 * @return
	 */
	public static String title() {
		return driver.getTitle();
	}
	/**
	 * this method is used to handle current window of webpage
	 * @return
	 */
	public static String currentWindow() {
		return driver.getWindowHandle();
	}
	/**
	 * this method is used to handle all window of webpage
	 * @return
	 */
	public static Set<String> allWindow() {
		return driver.getWindowHandles();
	}
	/**
	 * this method is used to maximize the webpage
	 */
	public static void maximize() {
		 driver.manage().window().maximize();
	}
	/**
	 * this method is used to manimize the webpage
	 */
	public static void manimize() {
		 driver.manage().window().minimize();
	}
	/**
	 * this method is used to close the current window
	 */
	public static void close() {
		driver.close();
	}
	/**
	 * this method is used to close all window
	 */
	public static void quite() {
		driver.quit();
	}
	/**
	 * 
	 * @param url
	 */
	public static void toUrl(String url) {
		driver.navigate().to(url);
	}
	/**
	 * this method is used to navigate the particular url
	 * @param url
	 */
	public static void toString(String url) {
		driver.navigate().to(url);
	}
	/**
	 * this method is used to forward the webpage
	 */
	public static void forward() {
		driver.navigate().forward();
	}
	/**
	 * this method is used to take back to previous webpage
	 */
	public static void back() {
		driver.navigate().back();
	}
	/**
	 * this method is used to refresh the webpage
	 */
	public static void refresh() {
		driver.navigate().refresh();
	}
	/**
	 * this method use to switch to next window
	 */
	public static void Switchto() {
		driver.switchTo();
	}
	/**
	 * this method is use to wait until the all element are get load in webpage
	 * @param element
	 */
	public static void ExplicitWait(WebElement element) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * this method use to select the option from dropdown by using index number
	 * @param i
	 * @param element
	 */
	public static void dropDown(int index,WebElement element) {
		s= new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * this method is used to select the option from the dropdown by using attribute value
	 * @param value
	 * @param element
	 */
	public static void dropDown(String value,WebElement element) {
		s= new Select(element);
		s.selectByValue(value);
	}
	/**
	 * this method use to select the option from the dropdown by using Text Function
	 * @param element
	 * @param Visibletext
	 */
	public static void dropDown(WebElement element,String Visibletext) {
		s = new Select(element);
		s.selectByVisibleText(Visibletext);
	}
	public static void moveCursor(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
		}
	
	public static void rightlick(WebElement element) {
		a = new Actions(driver);
		a.contextClick().perform();
	}
	public static void double_Click(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	public static void dragAndDrop(WebElement source, WebElement destination) {
		a = new Actions(driver);
		a.dragAndDrop(source,destination).perform();
	}
	public static void clickElement(WebElement element) {
		a = new Actions(driver);
		a.click(element).perform();
	}
	public static void clickElement() {
		a = new Actions(driver);
		a.click().perform();
	}
	
	
}
