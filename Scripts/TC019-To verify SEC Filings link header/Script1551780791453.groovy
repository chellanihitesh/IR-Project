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

WebUI.scrollToElement(findTestObject('Home Page/QuickLinks/li_SEC Filings'), 5)

WebUI.click(findTestObject('Home Page/QuickLinks/li_SEC Filings'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Menu_SubMenu_Links/h1_SEC Filings'), 3)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

String lblHeader = WebUI.getText(findTestObject('Menu_SubMenu_Links/h1_SEC Filings'))

/*
if(lblHeader =='Investor Presentations' )
{
	println "Link is navigated to  Presentations page"
}
else
{
	println "Test case failed"
}*/
if (WebUI.verifyMatch(lblHeader, 'SEC Filings', false) == true) {
    println('Link is navigated to  SEC Filings page')
} else {
    println('Test case failed')
}

CustomKeywords.'utilities.BasicFunctions.closeApplication'()

