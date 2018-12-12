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
Thread.sleep(3000)

WebUI.setText(findTestObject('Examination/ManageExam/input_search_exam'), 'Kỳ thi tạo từ Katalon')

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/icon_setup_category'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/icon_setup_category_detail'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/button_add_test'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Examination/ManageExam/SetupCategory/input_name_test'), 'Đề thi 1')

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/button_get_question_from_bank'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/checkbox_select_all'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/button_luu_vao_de_thi'))

Thread.sleep(3000)

WebUI.acceptAlert()

Thread.sleep(3000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/button_close'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/tab_nang_cao'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/checkbox_hiethi_true_false'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/button_save_dethi'))

Thread.sleep(3000)

WebUI.acceptAlert()

Thread.sleep(5000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/icon_edit_test'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/button_get_question_from_bank'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/a_loai_cau_hoi'))

Thread.sleep(2000)

WebUI.selectOptionByValue(findTestObject('Examination/ManageExam/SetupCategory/select_AnyQuestion'), 'essay', true)

//WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/option_essay'))
Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/button_apply'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/checkbox_choose_essay'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/button_luu_vao_de_thi'))

Thread.sleep(2000)

WebUI.acceptAlert()

Thread.sleep(3000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/button_close'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/button_save_edit_test'))

Thread.sleep(3000)

WebUI.acceptAlert()

Thread.sleep(5000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/tab_list_student'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Examination/ManageExam/SetupCategory/input_seach_student'), 'BIDV002')

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/checkbox_choose_student'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/button_add_student'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/tab_dethi'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/ManageExam/SetupCategory/button_finish'))

Thread.sleep(2000)

WebUI.acceptAlert()

Thread.sleep(3000)

WebUI.acceptAlert()

WebUI.callTestCase(findTestCase('Authentication/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

