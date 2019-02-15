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

WebUI.mouseOver(findTestObject('Menu_SubMenu_Links/a_News  Events'))

WebUI.click(findTestObject('Menu_SubMenu_Links/a_Investor Presentations'))

WebUI.delay(3)

WebUI.verifyElementPresent(, 0, FailureHandling.STOP_ON_FAILURE))

String lblHeader = WebUI.getText(findTestObject('Menu_SubMenu_Links/h1_Investor Presentations'))


WebUI.verifyMatch(lblHeader, 'Investor Presentations', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Investor Presentations/span_2019 1 Total'))

WebUI.click(findTestObject('Investor Presentations/h5_January 2019 Investor Prese'))

WebUI.click(findTestObject('Investor Presentations/p_01042019'))

WebUI.click(findTestObject('Investor Presentations/i_January 2019 Investor Presen'))

WebUI.click(findTestObject('Investor Presentations/span_2018 13 Total'))

WebUI.click(findTestObject('Investor Presentations/h5_American Water 2018 Investo'))

WebUI.click(findTestObject('Investor Presentations/p_12112018'))

WebUI.click(findTestObject('Investor Presentations/i_American Water 2018 Investor'))

WebUI.click(findTestObject('Investor Presentations/h5_2018 Third Quarter Earnings'))

WebUI.click(findTestObject('Investor Presentations/p_10312018'))

WebUI.click(findTestObject('Investor Presentations/i_American Water 2018 Investor'))

WebUI.click(findTestObject('Investor Presentations/h5_October 2018 Investor Prese'))

WebUI.click(findTestObject('Investor Presentations/p_10022018'))

WebUI.click(findTestObject('Investor Presentations/i_October 2018 Investor Presen'))

WebUI.click(findTestObject('Investor Presentations/p_10312018'))

WebUI.click(findTestObject('Investor Presentations/li_2018 Third Quarter Earnings'))

WebUI.selectOptionByValue(findTestObject('Investor Presentations/select_All Years20192018201720'), '2019', true)

WebUI.click(findTestObject('Investor Presentations/span_2019 1 Total'))

WebUI.selectOptionByValue(findTestObject('Investor Presentations/select_All Years20192018201720'), '2018', true)

WebUI.click(findTestObject('Investor Presentations/span_2018 13 Total'))

WebUI.selectOptionByValue(findTestObject('Investor Presentations/select_All Years20192018201720'), '2017', true)

WebUI.click(findTestObject('Investor Presentations/span_2017 16 Total'))

WebUI.click(findTestObject('Investor Presentations/span_2017 16 Total'))

WebUI.selectOptionByValue(findTestObject('Investor Presentations/select_All Years20192018201720'), '2016', true)

WebUI.click(findTestObject('Investor Presentations/span_2016 1 Total'))

