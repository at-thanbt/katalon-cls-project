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

WebUI.click(findTestObject('Administrator/div_modun_exam'))

Thread.sleep(3000)

WebUI.setText(findTestObject('Examination/ManageExam/input_search_exam'), 'Kỳ thi tạo từ Katalon')

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/icon_setup_category'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/icon_setup_category_detail'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/MarkTesr/link_mark_test'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/MarkTesr/button_mark'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/MarkTesr/button_see_test'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/MarkTesr/link_cham_diem'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Examination/MarkTesr/input_score'), '1')

Thread.sleep(2000)

WebUI.setText(findTestObject('Examination/MarkTesr/input_reply'), 'ahihi')

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/MarkTesr/button_save_mark'))

Thread.sleep(2000)

WebUI.click(findTestObject('Administrator/link_admin'))

