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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'utilities.BasicFunctions.invokeapplication'()
WebUI.mouseOver(findTestObject('Menu_SubMenu_Links/a_Investing With Us'))

WebUI.scrollToElement(findTestObject('Menu_SubMenu_Links/a_Analyst Coverage'), 0)

WebUI.waitForElementPresent(findTestObject('Menu_SubMenu_Links/a_Analyst Coverage'), 0)

WebUI.delay(10)

WebUI.click(findTestObject('Menu_SubMenu_Links/a_Analyst Coverage'))
for(int j=1;j<=14;j++)
{
String xpathval = "//*[@id="Analyst Coverage"]/div[2]/div[1]/ul[1]/li["+j+"]/div[1]/div[1]/h5[1]";
//String xpathval = "//H5[text()='BofA Merrill Lynch']"
println xpathval

WebUI.modifyObjectProperty(findTestObject('Object Repository/Analyst Coverage/h5_Argus'), 'xpath', equals, xpathval, true)
def Objecttext = WebUI.getAttribute('Object Repository/Analyst Coverage/h5_Argus', 'xpath')
println Objecttext
}
