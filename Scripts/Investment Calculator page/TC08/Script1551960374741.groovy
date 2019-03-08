import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.DecimalFormat as DecimalFormat
import org.testng.Assert as Assert
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

WebUI.waitForElementPresent(findTestObject('Object Repository/Investment Calculator/Investing with us/a_Investing With Us'), 
    10)

WebUI.mouseOver(findTestObject('Object Repository/Investment Calculator/Investing with us/a_Investing With Us'))

WebUI.click(findTestObject('Object Repository/Investment Calculator/Investment calculator option/a_Investment Calculator'))

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('Object Repository/Investment Calculator/calculator field/input_Total Return_txt w-100 n'), 
    '04/01/2019')

WebUI.setText(findTestObject('Object Repository/Investment Calculator/Price of purchase/input_Total Return_txt w-100 n'), 
    '100')

WebUI.waitForElementPresent(findTestObject('Object Repository/Investment Calculator/Price of purchase/input_Total Return_txt w-100 n'), 
    10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Investment Calculator/Calculate price button/button_Calculate Price'), 
    10)

WebUI.click(findTestObject('Object Repository/Investment Calculator/Calculate price button/button_Calculate Price'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/Investment Calculator/Basic tab/basic tab'), 10)

String basic = WebUI.getText(findTestObject('Object Repository/Investment Calculator/Basic tab/basic tab'))

println(basic)

WebUI.delay(2)

String priceofpurchase = WebUI.getAttribute(findTestObject('Object Repository/Investment Calculator/Price of purchase/input_Total Return_txt w-100 n'), 
    'value')

println(priceofpurchase)

String currentprice = WebUI.getText(findTestObject('Object Repository/Investment Calculator/current price/currentprice field'))

println(currentprice)

String priceappdepr = WebUI.getText(findTestObject('Object Repository/Investment Calculator/page apprdeppr/price apprdepr'))

println(priceappdepr)

WebUI.delay(2)

String basicvalue = basic.substring(1)

String currentpricevalue = currentprice.substring(1)

//Integer currentprice1 = Double.parseDouble(currentpricevalue);
Float currentprice1 = Float.parseFloat(currentpricevalue)

String lastword = priceappdepr.substring(priceappdepr.lastIndexOf(' ') + 1)

println(lastword + 'This is from last word')

String appdeprvalue = lastword.substring(0, lastword.length() - 1)

println(appdeprvalue + 'This is from appdeprvalue')

Double purchaseprice1 = Double.parseDouble(priceofpurchase)

Double r = currentprice1 - purchaseprice1

println('r value is :' + r)

//Integer result=Math.round(r/purchaseprice1);
//println((r / purchaseprice1)*100);
double value = (r / purchaseprice1) * 100.00

DecimalFormat df = new DecimalFormat('##.##')

String calcappdprvalue = df.format(value)

println(calcappdprvalue)

String symbol = '%'

String appdprvalue = calcappdprvalue + symbol

println(appdprvalue + 'This is the value after combining')

Assert.assertEquals(lastword, appdprvalue)

CustomKeywords.'launchandClosekeyword.LaunchandCloseApp.closeBrowser'()

