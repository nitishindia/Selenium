package Generic_Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtiity extends WebDriverUtility{
	/**
	 * this method is used to scroll the webpage according to the x axis and y axis
	 * @param x
	 * @param y
	 */
	public static void scroll_By(int x,int y) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	/**
	 * this method is used to scroll the webpage from the resume point
	 * @param x
	 * @param y
	 */
	public static void scroll_To(int x,int y) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}
	/**
	 * this method is used to scroll the webpage until the element visible
	 * @param b
	 * @param element
	 * @param index
	 */
	public static void scroll_In_TO_View(Boolean b,WebElement element,int index) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments["+index+"].scrollInToview("+b+");,"+element+"");
	}
	/**
	 * this method used to click the disable element
	 * @param element
	 */
	public static void clickDisable(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}

}
