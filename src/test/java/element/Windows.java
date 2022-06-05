package element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Windows {
	private static WebDriver driver = null;
	private WebElement Element1;

	public Windows(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getAlertsFrameandWindows() {
		return driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(3) > div"));
	}

	public WebElement getBrowserWindows() {
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[1]"));
	}

	public WebElement getNewTab() {
		return driver.findElement(By.id("tabButton"));
	}

	public WebElement getNewWindow() {
		return driver.findElement(By.id("windowButton"));
	}

	public WebElement getNewWindowMessage() {
		return driver.findElement(By.id("msgWindowButtonWrapper"));
	}
	// Alert

	public WebElement getAlerts() {
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[2]"));
	}

	public WebElement getClickClickMe() {
		return driver.findElement(By.xpath("//*[@id='alertButton']"));
	}

	public WebElement getAlert() {

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		alert.accept();
		return driver.findElement(By.xpath("//*[@id='alertButton']"));

	}
	public WebElement getclickMe() {
		return driver.findElement(By.id ("timerAlertButton"));
	}
	//frame
	
	public WebElement getframe() {
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[3]"));
	}
	public WebElement getframeelement() {
		WebElement element = driver.findElement(By.cssSelector("#frame2Wrapper"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		return driver.findElement(By.cssSelector("#frame2Wrapper"));
	}
	//nested 
	public WebElement getnestedFramebutton() {
		WebElement element = driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[4]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[4]"));
	}
	
	//modal
	public WebElement getmodeldialogbutton() {
		WebElement element = driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[5]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[5]"));
	}
	
	public WebElement getsmallmodal() {
		return driver.findElement(By.id("showSmallModal"));
	}
	public WebElement getclosebuttonofsmall() {
		return driver.findElement(By.id("closeSmallModal"));
	}
	public WebElement getcutbuttonofsmall() {
		return driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span[1]"));
	}
	public WebElement getlargemodal() {
		return driver.findElement(By.id("showLargeModal"));
	}
	public WebElement getclosebuttonoflarge() {
		return driver.findElement(By.id("closeLargeModal"));
	}
	public WebElement getcutbuttonoflarge() {
		return driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span[1]"));
	}
}
