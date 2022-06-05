package element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Widgets {
	private static WebDriver driver = null;
	private WebElement Element1;

	public Widgets(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getWidgets() {
		return driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(4) > div"));
	}
	public WebElement getAccordian() {
		WebElement element = driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[1]"));
	}
	public WebElement getLorem() {
		return driver.findElement(By.cssSelector("#accordianContainer > div > div:nth-child(1)"));
	}
	public WebElement getloremcomefrom() {
		return driver.findElement(By.cssSelector("#accordianContainer > div > div:nth-child(2)"));
	}
	public WebElement getuseoflorem() {
		return driver.findElement(By.cssSelector("#accordianContainer > div > div:nth-child(3)"));
	}
//Auto Complete
	public WebElement getAutocomplete() {
		WebElement element = driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[2]"));
	}
	public WebElement getmultiplecolor() {
		return driver.findElement(By.id("autoCompleteMultipleInput"));
		
	}
	public WebElement getsinglecolor() {
		return driver.findElement(By.id("autoCompleteSingleInput"));
	}
	
	//Date Picker
	
	public WebElement getDatepicker() {
		WebElement element = driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[3]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[3]"));
	}
	public WebElement getselectdate() {
		return driver.findElement(By.id("datePickerMonthYearInput"));
	}
	public WebElement getdateandtime() {
		return driver.findElement(By.id("dateAndTimePickerInput"));
	}
	//Progress Bar
	public WebElement getProgressbar() {
		WebElement element = driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[5]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[5]"));
	}
	public WebElement getstart() {
		return driver.findElement(By.id("startStopButton"));
	}
	public WebElement getstop() {
		return driver.findElement(By.id("startStopButton"));
	}
	public WebElement getreset() {
		return driver.findElement(By.id("resetButton"));
	}
	
	//Tabs
	
	public WebElement getTabs() {
		WebElement element = driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[6]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[6]"));
	}
	public WebElement getWhat() {
		return driver.findElement(By.xpath("//nav[@class='nav nav-tabs']//child::a[1]"));
	}
	public WebElement getOrigin() {
		return driver.findElement(By.xpath("//nav[@class='nav nav-tabs']//child::a[2]"));
	}
	public WebElement getUse() {
		return driver.findElement(By.xpath("//nav[@class='nav nav-tabs']//child::a[3]"));
	}
}
