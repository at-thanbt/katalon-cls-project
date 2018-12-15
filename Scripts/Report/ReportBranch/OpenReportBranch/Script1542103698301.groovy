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

WebUI.callTestCase(findTestCase('Authentication/Login1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Report/ReportBranch/link_report_branch'))

Thread.sleep(2000)

String title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Chi nhánh', true)

WebUI.click(findTestObject('Report/Course/link_admin'))

Thread.sleep(2000)

WebUI.click(findTestObject('Administrator/div_modun_report'))

Thread.sleep(2000)

WebUI.click(findTestObject('Report/ReportBranch/button_report_branch'))

Thread.sleep(2000)

String title1 = WebUI.getWindowTitle()

WebUI.verifyMatch(title1, 'Chi nhánh', true)

//WebUI.click(findTestObject('Report/Course/button_export_list_course'))
Thread.sleep(2000)

WebUI.setText(findTestObject('Report/ReportBranch/input_search_branch'), 'Cà mau')

Thread.sleep(2000)

WebUI.click(findTestObject('Report/ReportBranch/icon_detail_branch'))

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/tab_learner'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Report/ReportBranch/input_search_user'), 'Admin2')

Thread.sleep(2000)

WebUI.verifyTextPresent('admin2', false)

WebUI.click(findTestObject('Report/ReportBranch/button_export_user'))

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/tab_content'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Report/ReportBranch/input_search_course'), 'Tạo ở chi nhánh')

Thread.sleep(2000)

WebUI.verifyTextPresent('Tạo ở chi nhánh', false)

WebUI.click(findTestObject('Report/ReportBranch/button_export_course'))

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/tab_time_line'))

Thread.sleep(2000)

WebUI.click(findTestObject('Report/ReportBranch/button_export_timeline'))

Thread.sleep(2000)

WebUI.click(findTestObject('Report/ReportBranch/page_2'))

Thread.sleep(2000)

WebUI.click(findTestObject('Report/ReportBranch/page_3'))

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/tab_info'))

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('Authentication/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

