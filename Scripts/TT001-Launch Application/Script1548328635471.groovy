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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser(findTestData('URLs').getValue(1, 1))

'For IE Load'
WebUI.delay(10)

WebUI.maximizeWindow()

//Check incompatibity of browser
if (WebUI.verifyElementNotPresent(findTestObject('NonCompatibilityPopup/BrowserNonCompatibilityPopup'), 10, FailureHandling.OPTIONAL)) {
    KeywordLogger log = new KeywordLogger()

    log.logInfo('This is a compatible browser')
} else {
    WebUI.verifyElementPresent(findTestObject('NonCompatibilityPopup/BrowserNonCompatibilityPopup'), 0)

    KeywordLogger log = new KeywordLogger()

    log.logInfo('This is incompatible browser')

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/NonCompatibilityPopup/button_Ok'))
}

