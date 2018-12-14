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

WebUI.click(findTestObject('LearningPath/ManageLearningPath/button_add_learning_path'))

Thread.sleep(2000)

WebUI.setText(findTestObject('LearningPath/AddLearningPath/input_name_learning_path'), 'Quy trình không thường xuyên Katalon 6')

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/checkbox_not_frequent_learning_path'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/checkbox_certificate'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/button_see_certificate'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/icon_close_model_certificate'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/button_see_thang_danh_gia'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/icon_close_model_thang_danh_gia'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/textarea_receiver'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/choose_user'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/checkbox_receive_report'))

Thread.sleep(2000)

WebUI.setText(findTestObject('LearningPath/AddLearningPath/input_name_step_1'), 'Bước 1')

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/button_add_course'))

Thread.sleep(2000)

WebUI.setText(findTestObject('LearningPath/AddLearningPath/Course/input_search_course'), 'Khóa học test ảnh')

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/Course/button_apply'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/Course/checkbox_choose_couse'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/Course/button_add_course'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/checkbox_course_bat_buoc'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/button_add_exam'))

Thread.sleep(2000)

WebUI.setText(findTestObject('LearningPath/AddLearningPath/Exam/input_seach_exam'), 'Kỳ thi tạo từ Katalon')

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/Exam/button_apply'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/Exam/checkbox_choose_exam'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/Exam/button_add_exam'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/icon_setting_exam'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/icon_close_setting_exam'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/AddLearningPath/button_save_learning_path'))

Thread.sleep(2000)

WebUI.acceptAlert()

