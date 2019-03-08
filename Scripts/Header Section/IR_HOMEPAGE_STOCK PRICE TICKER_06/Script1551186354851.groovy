import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

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

WebUI.openBrowser('')

WebUI.waitForPageLoad(3)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ir.amwater.com')

WebUI.waitForPageLoad(10)

boolean result=WebUI.verifyElementPresent(findTestObject("Object Repository/Stock price widget Objects/Stock price verbiage object/Stock price veribiage"), 10)

Assert.assertTrue(result, "Element is present")

String expveribiage="AWK - NYSE | Quote delayed at least 20 minutes."

String actveribiage=WebUI.getText(findTestObject("Object Repository/Stock price widget Objects/Stock price verbiage object/Stock price veribiage"))
System.out.println(actveribiage)
if(expveribiage.contentEquals(actveribiage))
{
	System.out.println("pass")
}
else
{
	System.out.println("fail")
}