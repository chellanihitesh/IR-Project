package com.at.util

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.imageio.ImageIO

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot

public class ScreenshotHelper {
	@Keyword
	public void takeWebElementScreenshot(TestObject object) {
		WebElement element = WebUiCommonHelper.findWebElement(object, 20)
		WebDriver driver = DriverFactory.getWebDriver();
		Screenshot screenshot = new AShot().takeScreenshot(driver, element)
		ImageIO.write(screenshot.getImage(), "PNG", new File(System.getProperty("user.dir") +"/ErrorScreenshots/ElementScreenshot.png"))
	}
}