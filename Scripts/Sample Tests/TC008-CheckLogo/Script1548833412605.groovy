import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementVisible(findTestObject('Home Page/img_logo'))

WebUI.verifyElementClickable(findTestObject('Home Page/img_logo'))

def ImgLink = WebUI.getAttribute(findTestObject('Home Page/img_logo'), 'baseURI')

def HomePageLink = 'https://ir.amwater.com/#/home'

if (ImgLink == HomePageLink) {
    println('The home page link is correct on logo')
} else {
    println('Test case failed')
}

WebUI.delay(5)

CustomKeywords.'com.at.util.ScreenshotHelper.takeWebElementScreenshot'(findTestObject('Home Page/img_logo'))

WebUI.delay(5)

not_run: WebUI.takeScreenshot('ErrorScreenshots/Demo.png')

