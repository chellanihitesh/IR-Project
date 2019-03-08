package seleniumUtilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.concurrent.TimeUnit

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class SeleniumKeywords {
	@Keyword
	public String chromeBrowserLaunch(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mallikarjunaraog\\Desktop\\Katalon IR project\\Investor Relation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver()
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
		driver.manage().window().maximize()
		return driver;
	}

	@Keyword
	public mozillaBrowserLaunch(String url) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mallikarjunaraog\\Desktop\\Katalon IR project\\Investor Relation\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver()
		driver.get(url)
	}
}
