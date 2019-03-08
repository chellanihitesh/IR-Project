import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.TexturePaintContext.Byte as Byte
import java.util.concurrent.TimeUnit as TimeUnit
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
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

//CustomKeywords.'seleniumUtilities.SeleniumKeywords.chromeBrowserLaunch'("https://qa-ir.amwater.com")
System.setProperty('webdriver.chrome.driver', 'C:\\Users\\mallikarjunaraog\\Desktop\\Katalon IR project\\Investor Relation\\chromedriver.exe')

ChromeDriver driver = new ChromeDriver()

driver.navigate().to('https://qa-ir.amwater.com')

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)

driver.manage().window().maximize()

Thread.sleep(10)

for (int i = 2; i <= 3; i++) {
    String path1 = '//div[@id=\'irscroll\']/ir-footer/div[2]/div/div[2]/ul/li['

    String path2 = ']/a'

    if (driver.findElement(By.xpath((path1 + i) + path2)).isDisplayed() && driver.findElement(By.xpath((path1 + i) + path2)).isEnabled()) {
        driver.findElement(By.xpath((path1 + i) + path2)).click()
    }
    
    WebUI.delay(3)

    String mainwindow = driver.getWindowHandle()

    Set<String> set = driver.getWindowHandles()

    Iterator<String> itr = set.iterator()

    while (itr.hasNext()) {
        String childwindow = itr.next()

        if (!(mainwindow.equals(childwindow))) {
            driver.switchTo().window(childwindow)

            String exptitle = driver.switchTo().window(childwindow).getTitle()

            String expurl = driver.switchTo().window(childwindow).getCurrentUrl()

            System.out.println(expurl)

            String acturl = CustomKeywords.'ir_data.Excelfunctions.excelReading'('C:\\Users\\mallikarjunaraog\\Desktop\\Katalon IR project\\Investor Relation\\DATA\\IR_DATA.xlsx', 
                'Privacy&Terms of use', i, 0)

            Assert.assertEquals(expurl, acturl)

            driver.close()
        }
    }
	
    driver.switchTo().window(mainwindow)

	
}



