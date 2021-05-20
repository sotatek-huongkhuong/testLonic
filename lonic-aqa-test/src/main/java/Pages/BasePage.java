package Pages;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	public List<WebElement> getlistElement(String xpath)
	{
		List<WebElement> Elements = new ArrayList<WebElement>();
		Elements= driver.findElements(By.xpath(xpath));
		return Elements;
	}
	public void pause(long timeInMillis) {
		try {
			Thread.sleep(timeInMillis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void click(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
			element.click();
	}
	public void waitForElementPresent(WebElement e,WebDriver driver1)
	{
		pause(5000);
		 WebDriverWait wait = new WebDriverWait(driver1, 15);
		 try {
			  wait.until(ExpectedConditions.visibilityOf(e));
		       System.out.println(e+" is display");
		 }catch(Exception E) {
		       System.out.println(e+" isn't display");
			 System.out.println(E.getMessage());
		 }
	}
	public void scrollToElement(WebElement e)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
	}
	public void waitForPageLoaded(WebDriver driver) {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(expectation);
		} catch (Throwable error) {
			error.getCause().toString();
		}
	}
	public void checkElementToClickable(WebElement element,WebDriver driver1)
	{
		try {
		       new WebDriverWait(driver1, 10).until(ExpectedConditions.elementToBeClickable(element));
		       System.out.println(element+" is clickable");
		     }
		catch(TimeoutException e) {
		       System.out.println(element+" isn't clickable");
		    }
	}
}
