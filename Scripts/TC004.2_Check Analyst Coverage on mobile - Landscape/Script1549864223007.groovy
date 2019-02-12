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


WebUI.openBrowser('')

WebUI.navigateToUrl('https://ir.amwater.com/#/home')

WebUI.click(findTestObject('mobile_AnalystCoverage_new/Page_Investor Relations/button_Investing With Us_toggl'))

WebUI.click(findTestObject('Object Repository/mobile_AnalystCoverage_new/Page_Investor Relations/Page_Investor Relations/i_Investing With Us_fas fa-ang'))

WebUI.click(findTestObject('mobile_AnalystCoverage_new/Page_Investor Relations/a_Analyst Coverage'))

WebUI.verifyElementPresent(findTestObject('mobile_AnalystCoverage_new/Page_Investor Relations/p_John Staszak'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('mobile_AnalystCoverage_new/Page_Investor Relations/h5_Argus'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/h5_Atwater Thornton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/h5_Baird Equity Research'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/h5_Boenning  Scattergood'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/h5_BofA Merrill Lynch'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/h5_Goldman Sachs'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/h5_Guggenheim Securities'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/h5_HSBC Global Research'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/h5_Janney Montgomery Scott'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/h5_Macquarie Research'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/h5_Northcoast Research'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/h5_UBS Securities'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/h5_Wells Fargo'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Andy Cohen'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Angie Storozynski'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Ben Kallo'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Dan Ford'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_John Staszak'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Jonathan Reeder'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Julien Dumoulin-Smith'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Michael Gaugler'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Michael Lapides'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Rich Verdi'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Ryan Connors'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Shar Pourreza'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Steve Fleishman'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Analyst Coverage/p_Verity Mitchell'), 0, FailureHandling.CONTINUE_ON_FAILURE)

