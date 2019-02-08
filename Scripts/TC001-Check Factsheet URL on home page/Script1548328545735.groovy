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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('TT001-Launch Application'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Home Page/a_Fact Sheet'), 30)

WebUI.click(findTestObject('Home Page/a_Fact Sheet'))

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(10)

WebUI.maximizeWindow()

String ActualUrl = WebUI.getUrl()

//not_run: String titleExpected = 'Microsoft Word - Document1 - final_coming_soon.pdf'
String ExpectedUrl = 'https://ir.amwater.com/cp-content-ms/documents/259581/0/2018_FactSheet_Final.pdf/9af8b6a2-99ad-41f7-927d-cf12840d32ae'

'Comparing PDF url to expected one\r\n'
if (ActualUrl.equals(ExpectedUrl)) {
    WebUI.comment('URL for the factshet is as expected' //  WebUI.executeJavaScript('alert(\'Page title not matched or has an exception\')', null)
        )
} else {
    WebUI.comment('URL does not matches')
}

CustomKeywords.'utilities.BasicFunctions.closeApplication'()

KeywordUtil.markPassed('Test completed succesfully!')

