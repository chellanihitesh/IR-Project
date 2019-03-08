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

WebUI.click(findTestObject("Object Repository/StockGraph objects/stockdropdown button/stockdropdown"))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject("Object Repository/StockGraph objects/Graph table/div_Previous Close           9"), 5)

WebUI.verifyElementPresent(findTestObject("Object Repository/StockGraph objects/Graph table/div_Previous Close           9"), 10)

WebUI.delay(15)

String previousclose=WebUI.getText(findTestObject("Object Repository/StockGraph objects/previous close value/value"))
println(previousclose);

String apprdppr=WebUI.getText(findTestObject("Object Repository/StockGraph objects/stock value of header/stock value"))
println(apprdppr);

String stockvalue=WebUI.getText(findTestObject("Object Repository/StockGraph objects/current stock value/stock value"))
println(stockvalue);

System.out.println("This is previous value :"+previousclose+"\n"+"This is stock value:"+apprdppr+"\n"+"This is stock value:"+stockvalue);

Double tablepreviousclose = Double.parseDouble(previousclose);

Double headerstockvalue = Double.parseDouble(stockvalue);


String[] arr = apprdppr.split(" ");

String firstWord = arr[0];
String secondWord = arr[1];
String thirdWord = arr[2];

System.out.println(firstWord)
System.out.println(secondWord)
System.out.println(thirdWord)

//Getting color and comparing them
String actcolor=WebUI.getAttribute(findTestObject('Object Repository/StockGraph objects/stock price color/color'), 'class');
System.out.println(actcolor);
String expcolor='green';

if(expcolor.equals(actcolor))
{
//for price appreciation
Double castedapprdpprvalue = Double.parseDouble(thirdWord);
System.out.println(castedapprdpprvalue);
Double appcomparisonvalue=headerstockvalue-tablepreviousclose;
DecimalFormat df=new DecimalFormat("##.##");
String comparisonvalue1=df.format(appcomparisonvalue);
Assert.assertEquals(thirdWord, comparisonvalue1)
if(thirdWord.equals(comparisonvalue1))
{
	System.out.println("Color is green"+"pass");
}
else
{
	System.out.println("Color is green"+"fail");
}
}
else
{

//for price depreacition
Double castedapprdpprvalue = Double.parseDouble(firstWord);
System.out.println(castedapprdpprvalue);
Double comparisonvalue=headerstockvalue-tablepreviousclose;
DecimalFormat df=new DecimalFormat("##.##");
String comparisonvalue1=df.format(comparisonvalue);
System.out.println(comparisonvalue1);
Assert.assertEquals(firstWord, comparisonvalue1)
System.out.println(comparisonvalue1+"passed");

}
