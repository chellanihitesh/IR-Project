package ir_data

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Excelfunctions {
	@Keyword
	def public ExcelWriting(String fileName,String sheetName,String status,int rowno,int colno) {
		File f1=new File(fileName);
		FileInputStream fIPS= new FileInputStream(fileName); //Read the spreadsheet that needs to be updated

		XSSFWorkbook wb=new XSSFWorkbook(fIPS);

		XSSFSheet sheet=wb.getSheet(sheetName);

		sheet.getRow(rowno).createCell(colno).setCellValue(status)
		//  sheet.createRow(rowno).createCell(colno).setCellValue(status);

		FileOutputStream fout=new FileOutputStream(fileName);
		wb.write(fout);

	}

	@Keyword
	def public excelReading(String fileName,String sheetName,int rowno,int colno) {
		File f1=new File(fileName);

		FileInputStream fIPS= new FileInputStream(fileName); //Read the spreadsheet that needs to be updated

		XSSFWorkbook wb=new XSSFWorkbook(fIPS);

		XSSFSheet sheet=wb.getSheet(sheetName);

		Row row=sheet.getRow(rowno)

		Cell cell=row.getCell(colno)

		return cell;

	}
}
