import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger



import groovy.ui.text.FindReplaceUtility.ReplaceAllAction
import internal.GlobalVariable as GlobalVariable
import jdk.internal.org.objectweb.asm.tree.analysis.BasicValue as BasicValue

WebUI.callTestCase(findTestCase('TT001-Launch Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Menu_SubMenu_Links/a_Investing With Us'))

WebUI.click(findTestObject('Menu_SubMenu_Links/a_Investment Calculator'))

WebUI.mouseOver(findTestObject('Investment Calculator/i_Total Return_far fa-calendar'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'Click Calendar Control\r\n'
WebUI.click(findTestObject('Investment Calculator/i_Total Return_far fa-calendar'))

WebUI.delay(5)

'Select Year 2018\r\n\t'
WebUI.selectOptionByValue(findTestObject('Investment Calculator/select_20082009201020112012201'), '2018', true)

'Select Month \'December\''
WebUI.selectOptionByValue(findTestObject('Investment Calculator/select_JanFebMarAprMayJunJulAu'), '12', true)

'Select Date \'31\''
WebUI.click(findTestObject('Investment Calculator/div_28'))

'Optionally enter date text'
not_run: WebUI.setText(findTestObject('Investment Calculator/input_Total Return_txt w-100 n'), '01/01/2019')

//Input value to text box
WebUI.setText(findTestObject('Investment Calculator/input_Total Return_txt w-100 n_4'), '95')

//Store the input value to variable
//Click calculate
WebUI.click(findTestObject('Investment Calculator/button_Calculate Price'))

//String inputvalue = WebUI.getText(findTestObject('Investment Calculator/input_Total Return_txt w-100 n_4'))

String inputvalue = WebUI.getAttribute(findTestObject('Investment Calculator/input_Total Return_txt w-100 n_4'), "value")

KeywordLogger log = new KeywordLogger()
log.logInfo("Input price is " +inputvalue)


//Get text after the object is modify
String DynValue = WebUI.getText(findTestObject('Object Repository/Investment Calculator/h1_basicPrice'))
String NewDynValue = DynValue.replaceAll("\$", "")

log.logInfo("Input price is " +NewDynValue)


//Compare text of the set object and retrieved object value
//WebUI.verifyMatch(PriceOfPurchaseInput, DynValue, false)
//WebUI.verifyMatch(WebUI.getText(findTestObject('Investment Calculator/input_Total Return_txt w-100 n_4')), WebUI.getText(findTestObject('null')), false)
//WebUI.click(findTestObject('Investment Calculator/strong_Price appreciation (dep'))
//int extractedNum = CustomKeywords.'utilities.BasicFunctions.extractNumberFromString'(findTestObject('Investment Calculator/strong_Price appreciation (dep'))
//Calculate appreciation/depreciation
int TodayPrice = WebUI.getText(findTestObject('Investment Calculator/p_Current Price'))

int PurchasePrice = WebUI.getText(findTestObject('Investment Calculator/input_Total Return_txt w-100 n_4', '100'))

int ActualCalcuated = (TodayPrice - PurchasePrice) / PurchasePrice

//Compare Price Appreciation on screen to that of calculate
if (ActualCalcuated == extractedNum) {
    System.out.println('Calculation is correct')
}

Else({ 
        System.out.println('Calculation is incorrect')
    })

