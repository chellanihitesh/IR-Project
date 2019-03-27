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
import com.kms.katalon.core.webui.keyword.builtin.GetUrlKeyword as GetUrlKeyword
import com.sun.jna.platform.win32.DsGetDC as DsGetDC
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('TT001-Launch Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('QuickLinks/li_Email Alerts'), 5)

WebUI.click(findTestObject('QuickLinks/li_Email Alerts'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Home Page/Featured Articles/h4_Email Alerts'), 
    5)

not_run: WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Menu_SubMenu_Links/h4_Email Alerts'), 3)

String lblHeader = WebUI.getText(findTestObject('Home Page/Featured Articles/h4_Email Alerts'))

if (WebUI.verifyMatch(lblHeader, 'Email Alerts', false) == true) {
    println('Link is navigated to  Email Alerts popup')
} else {
    println('Test case failed')
}

WebUI.click(findTestObject('Object Repository/Home Page/Featured Articles/Page_Investor Relations/a_'))

CustomKeywords.'utilities.BasicFunctions.closeApplication'()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ir.amwater.com/#/home')

WebUI.click(findTestObject('Home Page/Featured Articles/img_View All_article-img-tag'))

WebUI.click(findTestObject('Home Page/Featured Articles/img_Investing With Us_logo-align'))

WebUI.click(findTestObject('Home Page/Featured Articles/img_The 2019 Gender-Equality Index highlights 230 firms that ar..._article-img-tag'))

WebUI.click(findTestObject('Home Page/Featured Articles/img_Investing With Us_logo-align'))

WebUI.click(findTestObject('Home Page/Featured Articles/img_The 2019 Gender-Equality Index highlights 230 firms that ar..._article-img-tag_1'))

WebUI.click(findTestObject('Home Page/Featured Articles/img_possi..._article-img-tag'))



