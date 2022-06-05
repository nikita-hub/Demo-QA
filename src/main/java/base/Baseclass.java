package base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import testData.TestData;
import utilities.JsonReader;

public class Baseclass implements ITestListener {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	protected TestData data;

	@BeforeMethod
	public void SetUp() throws IOException {
	//	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		data = new JsonReader().readJsonAndGetObject("testData.json", TestData.class);
		if (driver == null) {
			fr = new FileReader(
					"D:\\Automationtesting\\framework of Demo-QA\\DemoQA\\src\\test\\resources\\configfiles\\ webdriver.properties");
			prop.load(fr);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
//			driver = new FirefoxDriver();
			driver = new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(prop.getProperty("Url"));
		
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			//WebDriverManager.firefoxdriver().setup();
			//driver = new FirefoxDriver();
			driver.get(prop.getProperty("Url"));
		}
	}

	@AfterMethod
	public void teardown() {
  //driver.quit();
	}

}
