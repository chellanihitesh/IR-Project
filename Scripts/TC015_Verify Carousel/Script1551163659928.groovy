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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TT001-Launch Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/carousel/Page_Investor Relations/h1_tQ4 and Year-End 2018 Ameri'), 
    0, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Object Repository/carousel/Page_Investor Relations/button_Webcast'), 0, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/carousel/Page_Investor Relations/button_Webcast'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/carousel/Page_Investor Relations/button_Webcast'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/carousel/Page_Investor Relations/button_Webcast'), FailureHandling.OPTIONAL)

WebUI.switchToWindowTitle('Webcast', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/carousel/Page_Webcast/a_Join the webcast'), FailureHandling.OPTIONAL)

WebUI.switchToWindowTitle('Webcast', FailureHandling.OPTIONAL)

CustomKeywords.'utilities.BasicFunctions.closeApplication'()

