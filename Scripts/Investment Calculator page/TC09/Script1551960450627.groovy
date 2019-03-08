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

CustomKeywords.'launchandClosekeyword.LaunchandCloseApp.launchBrowser'('https://qa-ir.amwater.com/')

WebUI.waitForElementPresent(findTestObject('Object Repository/Investment Calculator/Investing with us/a_Investing With Us'),10)

WebUI.mouseOver(findTestObject('Object Repository/Investment Calculator/Investing with us/a_Investing With Us'))

WebUI.click(findTestObject('Object Repository/Investment Calculator/Investment calculator option/a_Investment Calculator'))

WebUI.waitForPageLoad(3)

WebUI.delay(5);

//click on total return tab
WebUI.click(findTestObject('Object Repository/Investment Calculator/Total return tab/a_Total Return'))
WebUI.delay(2);

//To pass date in from date
WebUI.setText(findTestObject('Object Repository/Investment Calculator/From field/input_From_txt w-100 ng-'), '04/01/2015')

//To pass date in To date
WebUI.setText(findTestObject('Object Repository/Investment Calculator/To field/input_To_txt w-100 ng-untouch'), '04/04/2018')
WebUI.delay(2);

//To select frequency
WebUI.selectOptionByLabel(findTestObject('Object Repository/Investment Calculator/total return Frequency dropdown/option1 daily'), "Weekly", false)

//Enter value in Amount invested field 
WebUI.setText(findTestObject('Object Repository/Investment Calculator/Amount invested field/input_To_txt w-100 ng-pristin'), '150')
WebUI.delay(2);

//Clicking on Calc button
WebUI.click(findTestObject('Object Repository/Investment Calculator/Total return calculate price button/button_Calculate Price'))





















