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

//WebUI.callTestCase(findTestCase('Course/GoToContent'), [:], FailureHandling.STOP_ON_FAILURE)
Thread.sleep(5000)
WebUI.click(findTestObject('Course/ManageContent/NameContent/span_select_list_content'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/NameContent/content_flash'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Course/ManageContent/Flash/input_name_flash'), 'flash question')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/QuestionInContent/radio_question'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/QuestionInContent/button_add_question'))

//Tạo một lựa chọn
WebUI.switchToWindowTitle('Tạo câu hỏi')

Thread.sleep(2000)

WebUI.setText(findTestObject('Course/ManageContent/QuestionInContent/textarea_editor_name_of_question'), 'Câu hỏi một lựa chọn')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/QuestionInContent/a_create_new_answer_single'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Course/ManageContent/QuestionInContent/input_answer_single_answer'), 'đáp án 1')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/QuestionInContent/input_true_radio_single_answer'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/QuestionInContent/button_save_question'))

Thread.sleep(2000)

WebUI.switchToWindowTitle('Thêm nội dung')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/QuestionInContent/checkbox_choose_question'))

Thread.sleep(2000)

WebUI.uploadFile(findTestObject('Course/ManageContent/Flash/button_upload_file'), 'E:\\ban nhac 01.swf')

Thread.sleep(5000)

WebUI.click(findTestObject('Course/ManageContent/Flash/button_save'))

