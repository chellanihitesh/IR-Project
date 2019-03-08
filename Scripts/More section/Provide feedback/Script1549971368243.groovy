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

WebUI.waitForPageLoad(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/More section objects/More dropdown/a_More'), 10)

WebUI.mouseOver(findTestObject('Object Repository/More section objects/More dropdown/a_More'))

WebUI.click(findTestObject('Object Repository/More section objects/More dropdown/a_Provide Feedback'))

WebUI.waitForPageLoad(3)

//WebUI.verifyElementPresent(findTestObject("Object Repository/More section objects/More dropdown/provide feedback title/input__title"), 10)

WebUI.setText(findTestObject("Object Repository/More section objects/More dropdown/provide feedback title/input__title"), "To verify title")

WebUI.setText(findTestObject("Object Repository/More section objects/More dropdown/provide feedback comment/textarea__comment"), "To verify comment")

WebUI.click(findTestObject('Object Repository/More section objects/More dropdown/like object/i_Do you like our Investor Rel'))

WebUI.delay(60);

WebUI.click(findTestObject('Object Repository/More section objects/More dropdown/submit button/div_Submit'))