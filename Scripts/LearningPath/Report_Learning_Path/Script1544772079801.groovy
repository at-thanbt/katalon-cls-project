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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Administrator/div_modun_learning_path'))

Thread.sleep(2000)

WebUI.setText(findTestObject('LearningPath/ManageLearningPath/input_search_learning_path'), 'Quy trình không thường xuyên Katalon 6')

Thread.sleep(4000)

WebUI.click(findTestObject('LearningPath/ManageLearningPath/icon_report_learning_path'))

Thread.sleep(2000)

String title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Quy trình không thường xuyên Katalon 6', true)

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/Report_Learning_Path/tab_list_step'))
Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/Report_Learning_Path/icon_detail_step'))
Thread.sleep(2000)

String title1 = WebUI.getWindowTitle()

WebUI.verifyMatch(title1, 'Bước 1', true)
Thread.sleep(2000)

WebUI.setText(findTestObject('LearningPath/Report_Learning_Path/input_seach_user'), 'Trần Thị d')
Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/Report_Learning_Path/button_export_detail_step'))
Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/Report_Learning_Path/button_back'))

Thread.sleep(2000)

String title2 = WebUI.getWindowTitle()

WebUI.verifyMatch(title2, 'Quy trình không thường xuyên Katalon 6', true)
Thread.sleep(2000)
