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

WebUI.callTestCase(findTestCase('TT001-Launch Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Menu_SubMenu_Links/a_Investing With Us'))

WebUI.click(findTestObject('Menu_SubMenu_Links/a_Investment Calculator'))

String lblHeader = WebUI.getText(findTestObject('Menu_SubMenu_Links/h1_Investment Calculator'))

'Using input from excel\r\n'
WebUI.verifyMatch(lblHeader, findTestData('Excel_Screenames').getValue(1, 1), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Menu_SubMenu_Links/a_Investing With Us'))

WebUI.scrollToElement(findTestObject('Menu_SubMenu_Links/a_Historical Pricing'), 10)

WebUI.waitForElementPresent(findTestObject('Menu_SubMenu_Links/a_Historical Pricing'), 10, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.click(findTestObject('Menu_SubMenu_Links/a_Historical Pricing'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Menu_SubMenu_Links/a_Historical Pricing'))

WebUI.verifyElementPresent(findTestObject('Menu_SubMenu_Links/h1_Historical Pricing'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Menu_SubMenu_Links/a_Investing With Us'))

WebUI.scrollToElement(findTestObject('Menu_SubMenu_Links/a_Dividend History'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Menu_SubMenu_Links/a_Dividend History'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu_SubMenu_Links/a_Dividend History'))

WebUI.verifyElementPresent(findTestObject('Menu_SubMenu_Links/h1_Dividend History'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Menu_SubMenu_Links/a_Investing With Us'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu_SubMenu_Links/a_DSSPDrip'))

WebUI.switchToWindowIndex(1)

WebUI.delay(10)

WebUI.maximizeWindow()

String DSSDrip_ActualUrl = WebUI.getUrl()

String DSSDrip_ExpectedUrl = 'https://us.astfinancial.com/InvestOnline/Invest/PlanInfo?ticker=AWK'

if (DSSDrip_ActualUrl == DSSDrip_ExpectedUrl) {
    System.out.println('DSSDrip URL is correct')
} else {
    System.out.println('DSSDrip URL is incorrect')
}

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.mouseOver(findTestObject('Menu_SubMenu_Links/a_Investing With Us'))

WebUI.scrollToElement(findTestObject('Menu_SubMenu_Links/a_Analyst Coverage'), 0)

WebUI.waitForElementPresent(findTestObject('Menu_SubMenu_Links/a_Analyst Coverage'), 0)

WebUI.delay(10)

WebUI.click(findTestObject('Menu_SubMenu_Links/a_Analyst Coverage'))

WebUI.verifyElementPresent(findTestObject('Menu_SubMenu_Links/h1_Analyst Coverage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Menu_SubMenu_Links/a_Investing With Us'))

WebUI.scrollToElement(findTestObject('Menu_SubMenu_Links/a_FAQ'), 0)

WebUI.delay(10)

WebUI.click(findTestObject('Menu_SubMenu_Links/a_FAQ'))

WebUI.verifyElementPresent(findTestObject('Menu_SubMenu_Links/h1_FAQ'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Menu_SubMenu_Links/a_Financial Reports'))

WebUI.scrollToElement(findTestObject('Menu_SubMenu_Links/a_Annual Reports  Proxy Statem'), 0)

WebUI.delay(10)

WebUI.click(findTestObject('Menu_SubMenu_Links/a_Annual Reports  Proxy Statem'))

WebUI.verifyElementPresent(findTestObject('Menu_SubMenu_Links/h1_Annual Reports  Proxy State'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Menu_SubMenu_Links/a_Financial Reports'))

WebUI.scrollToElement(findTestObject('Menu_SubMenu_Links/a_SEC Filings'), 0)

WebUI.delay(10)

WebUI.click(findTestObject('Menu_SubMenu_Links/a_SEC Filings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Menu_SubMenu_Links/h1_SEC Filings'), 0, FailureHandling.CONTINUE_ON_FAILURE)

