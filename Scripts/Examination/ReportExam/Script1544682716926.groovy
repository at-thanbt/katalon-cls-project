import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//WebUI.callTestCase(findTestCase('Authentication/Login1'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(4000)

WebUI.click(findTestObject('Administrator/div_modun_report'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/button_report_exam'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/icon_detail_exam'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/button_export_file_exam'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/tab_category'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/icon_detail_category'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/icon_detail_test_of_student'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/icon_close_model_test_of_student'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/icon_export_test_of_student'))
Thread.sleep(2000)

WebUI.back()

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/tab_test_list'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/icon_detail_de_thi_goc'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/icon_close_de_thi_goc'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/tab_violint'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/tab_statistic_not_joined'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ReportExam/tab_category_info'))

Thread.sleep(2000)

