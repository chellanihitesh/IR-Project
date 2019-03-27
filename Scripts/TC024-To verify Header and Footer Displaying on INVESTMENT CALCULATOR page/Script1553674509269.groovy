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
WebUI.verifyMatch(lblHeader, 'Investment Calculator', false, FailureHandling.CONTINUE_ON_FAILURE)

println('Navigated to investment calculator page')

//check header
WebUI.scrollToElement(findTestObject('Menu_SubMenu_Links/a_Investing With Us'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Menu_SubMenu_Links/a_Investing With Us'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Menu_SubMenu_Links/a_Investment Calculator'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Menu_SubMenu_Links/a_Investment Calculator'), 10, FailureHandling.CONTINUE_ON_FAILURE)

println('Header is present')

String lblFooterText = WebUI.getText(findTestObject('Footer/li_ 2018 American Water. All rights reserved.'), FailureHandling.CONTINUE_ON_FAILURE)

'Using input from excel\r\n'
WebUI.verifyMatch(lblFooterText, '© 2018 American Water. All rights reserved.', false, FailureHandling.CONTINUE_ON_FAILURE)

println('Footer is present')

CustomKeywords.'utilities.BasicFunctions.closeApplication'()

