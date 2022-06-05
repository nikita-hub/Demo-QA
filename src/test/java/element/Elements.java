package element;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	private static WebDriver driver = null;
	private WebElement Element1;

	public Elements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElementButton() {
		return driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]/div"));

	}

	// verify different fields in element
	public List<WebElement> getElementButtonFields() {
		return driver.findElements(By.xpath(""));

	}
	// textbox

	public WebElement getTextBoxButton() {
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[1]"));

	}

	public WebElement getName() {
		return driver.findElement(By.cssSelector("#userName"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.cssSelector("#userEmail"));
	}

	public WebElement getCurrentAddress() {
		return driver.findElement(By.cssSelector("#currentAddress"));
	}

	public WebElement getPermanentAddress() {
		return driver.findElement(By.cssSelector("#permanentAddress"));
	}

	public WebElement getSubmitButton() {

		WebElement element = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		return driver.findElement(By.xpath("//form[@id='userForm']//child::button"));
	}
//	public WebElement geterroremail()
//	{
//		return driver.findElement(By.xpath("//input[@class='mr-sm-2 field-error form-control']"));	
//	}

	// check box

	public WebElement getCheckBoxButton() {

		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[2]"));

//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		WebElement element =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]")));
	}

	public void checkbox() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("/html/body//div[1]/div/ul/li[2]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public WebElement getCheckBoxElementButton() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]"));
	}

	public WebElement getCheckBox() {
		return driver.findElement(By.xpath("//*[@id='tree-node']/ol/li//input"));
	}

	public WebElement getCheckBoxDropdownButton() {
		return driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/button"));
	}
//	public WebElement getDropdown()
//	{
//		return driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/button"));	
//	}

	// Radio Button

	public WebElement getRadioButton() {
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[3]"));
	}

	public WebElement getRadioButtonElement() {
		return driver.findElement(By.xpath("//div/div[@class=\"mb-3\"]/following-sibling::div[1]/label"));
	}

	public WebElement getButtonRadio() {
		return driver.findElement(By.xpath("//*[@id='yesRadio']"));
	}

	// WebTables

	public WebElement getWebTables() {
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[4]"));
	}

	public WebElement getSerchBar() {
		return driver.findElement(By.className("form-control"));
	}

	public WebElement getAddButton() {
		return driver.findElement(By.cssSelector("#addNewRecordButton"));
	}

	public WebElement getCloseButton() {
		return driver.findElement(By.xpath("//button[@class='close']"));
	}
	// regestration form

	public WebElement getFirstName() {
		return driver.findElement(By.xpath("//div[@id='firstName-wrapper']//child::input"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.cssSelector("#lastName"));
	}

	public WebElement getEmailf() {
		return driver.findElement(By.cssSelector("#userEmail"));
	}

	public WebElement getAge() {
		return driver.findElement(By.cssSelector("#age"));
	}

	public WebElement getSalary() {
		return driver.findElement(By.cssSelector("#salary"));
	}

	public WebElement getDepartment() {
		return driver.findElement(By.cssSelector("#department"));
	}

	public WebElement getSubmitButtoninform() {
		return driver.findElement(By.id("submit"));
	}

	public WebElement getRecordEditorSign() {
		return driver.findElement(By.xpath("//span[@id='edit-record-1']"));
	}

	public WebElement getButton() {
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[5]"));
	}

	public WebElement getdoubleclickbutton() {
		return driver.findElement(By.cssSelector("#doubleClickBtn"));

	}

	// links
	public WebElement getLinks() {
		WebElement element = driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[6]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[6]"));
	}

	public WebElement getHomelink() {
		return driver.findElement(By.id("simpleLink"));
	}

	public WebElement getHomeGMRAFlink() {
		return driver.findElement(By.id("dynamicLink"));
	}

	public WebElement getCreatedlink() {
		return driver.findElement(By.id("#created"));
	}

	public WebElement getNoContentlink() {
		return driver.findElement(By.id("no-content"));
	}

	public WebElement getMovedlink() {
		return driver.findElement(By.cssSelector("#moved"));
	}

	public WebElement getBadRequestlink() {
		return driver.findElement(By.id("bad-request"));
	}

	public WebElement getUnauthorizedlink() {
		return driver.findElement(By.cssSelector("#unauthorized"));
	}

	public WebElement getForbiddenlink() {
		return driver.findElement(By.cssSelector("#forbidden"));
	}

	public WebElement getNotFoundlink() {
		return driver.findElement(By.id("invalid-url"));
	}
	
//		public WebElement getElementButton1()
//		{
//List<String>list= new ArrayList<String>();
//list.add("Text box");
//list.add("check box");
//System.out.println("list"+list);
//			List<WebElement> webelements= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul"));

//			for(String otherCurrentLink: webelements) {
//           String strLinkTest= otherCurrentLink;
//			System.out.println( strLinkTest);
//}					

}
