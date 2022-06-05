package element;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forms {
	private static WebDriver driver = null;
	private WebElement Element1;

	public Forms(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getForm() {
		return driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(2) > div"));
		
	}
	public WebElement getPracticeForm() {
		return driver.findElement(By.xpath("//div[@class='element-list collapse show']//child::li[1]"));
	}
	public WebElement getfirstname() {
		return driver.findElement(By.id("firstName"));
	}
	public WebElement getlastname() {
		return driver.findElement(By.id("lastName"));
	}
	public WebElement getEmail() {
		return driver.findElement(By.xpath("//input[@id='userEmail']"));
	}
	public WebElement getmale() {
		return driver.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[1]/label"));
	}
	public WebElement getFemale() {
		return driver.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[2]/label"));
	}
	public WebElement getOther() {
		return driver.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[3]/label"));
	}
	public WebElement getMobile() {
		return driver.findElement(By.xpath("//input[@id='userNumber']"));
	}
	public WebElement getDateofBirth() {
		return driver.findElement(By.id("dateOfBirthInput"));
	}
	public WebElement getSubject() {
		return driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
	}
	public WebElement getHobbiesSport() {
		return driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
	}
	public WebElement getHobbiesReading() {
		return driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label"));
	}
	public WebElement getHobbiesMusic() {
		return driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
	}
	public WebElement getpicture() {
		return driver.findElement(By.xpath("//div[@class='form-file']"));
	}
	public WebElement getCurrentAddress() {
		return driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	}
	
}
