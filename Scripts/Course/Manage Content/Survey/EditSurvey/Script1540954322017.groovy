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

WebUI.callTestCase(findTestCase('Course/GoToContent'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Course/ManageContent/Survey/icon_edit_survey'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Survey/button_add_question'))

//thêm câu hỏi một lựa chọn
WebUI.switchToWindowTitle('Tạo câu hỏi khảo sát')

Thread.sleep(2000)

WebUI.setText(findTestObject('Course/ManageContent/Survey/input_single_question_name'), 'Câu hỏi một lựa chọn 2')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Survey/button_add_answer_single_question'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Course/ManageContent/Survey/input_answer'), 'đáp án 1')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Survey/button_save_question'))

Thread.sleep(2000)

WebUI.switchToWindowTitle('Sửa nội dung')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Survey/button_save_edit_survey'))

