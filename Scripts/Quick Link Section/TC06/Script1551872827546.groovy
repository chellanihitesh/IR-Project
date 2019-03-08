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

WebUI.navigateToUrl('https://qa-ir.amwaternp.net/#/home')

WebUI.waitForPageLoad(10)

WebUI.delay(5)



for(int i=8;i<=13;i++)
{
	
//fetching quick links data from excel
String obj1= findTestData('Data Files/Links').getValue('Objects', i)

	
//Checking quick link is present on header section or not

boolean elementcheck=WebUI.verifyElementPresent(findTestObject(obj1), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot("C:\\Users\\mallikarjunaraog\\Desktop\\Katalon IR project\\Investor Relation\\screen shots")

Assert.assertTrue(elementcheck)


}