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
//WebUI.click(findTestObject('Administrator/div_modun_exam'))
//Thread.sleep(2000)
//WebUI.setText(findTestObject('Examination/ManageExam/input_search_exam'), 'Kỳ thi tạo từ Katalon')
//Thread.sleep(2000)
WebUI.click(findTestObject('Examination/ManageExam/icon_edit_exam'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/icon_setup_category'))

Thread.sleep(4000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/tab_teacher'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Examination/ManageExam/EditExam/input_search_teacher'), 'admin1')

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/checkbox_choose_teacher'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/button_add_teacher'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Examination/ManageExam/EditExam/input_search_teacher'), 'admin2')

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/checkbox_choose_teacher'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/button_add_teacher'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/tab_list_monitor'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Examination/ManageExam/EditExam/input_search_monitor'), 'admin1')

Thread.sleep(3000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/checkbox_choose_monitor'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/button_add_monitor'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/tab_constructor'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/checkbox_choose_constructor'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/button_save_constructor'))

Thread.sleep(2000)

WebUI.acceptAlert()

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/EditExam/button_send_request'))

Thread.sleep(3000)

WebUI.acceptAlert()

Thread.sleep(3000)

WebUI.acceptAlert()

Thread.sleep(10000)

WebUI.click(findTestObject('Examination/ManageExam/button_duyet_exam'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/icon_detail_duyet_exam'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/button_duyet'))

Thread.sleep(3000)

WebUI.acceptAlert()

Thread.sleep(3000)

WebUI.acceptAlert()

Thread.sleep(3000)

WebUI.click(findTestObject('Examination/ManageExam/button_back'))

