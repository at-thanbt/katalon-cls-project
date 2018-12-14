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

WebUI.callTestCase(findTestCase('Authentication/Login2_Learn_Learning_Path'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.maximizeWindow()

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/LearnLearningPath/modul_learning_path'))

Thread.sleep(2000)

WebUI.setText(findTestObject('LearningPath/LearnLearningPath/input_search_learning_path'), 'Quy trình không thường xuyên Katalon 6')

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/LearnLearningPath/choose_learning_path'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/LearnLearningPath/choose_course'))

Thread.sleep(2000)

WebUI.switchToWindowTitle('khóa học test ảnh')

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/LearnLearningPath/start_learn_course'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/LearnLearningPath/LearnCourse/button_finish'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/LearnLearningPath/LearnCourse/button_accept'))

Thread.sleep(10000)

WebUI.click(findTestObject('LearningPath/LearnLearningPath/modul_learning_path'))

Thread.sleep(2000)

WebUI.setText(findTestObject('LearningPath/LearnLearningPath/input_search_learning_path'), 'Quy trình không thường xuyên Katalon 6')

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/LearnLearningPath/choose_learning_path'))

Thread.sleep(20000)

WebUI.refresh()

Thread.sleep(5000)

WebUI.click(findTestObject('LearningPath/LearnLearningPath/choose_exam'))

Thread.sleep(2000)

WebUI.switchToWindowTitle('Danh sách chủ đề của kỳ thi')

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/LearnExam/icon_choose_category'))

Thread.sleep(2000)

WebUI.click(findTestObject('Examination/LearnExam/button_start_exam'))

Thread.sleep(10000)

WebUI.click(findTestObject('Examination/LearnExam/button_finish'))

Thread.sleep(2000)

WebUI.acceptAlert()

Thread.sleep(5000)

WebUI.acceptAlert()

Thread.sleep(5000)

WebUI.mouseOver(findTestObject('Administrator/select_user_action'))

Thread.sleep(5000)

WebUI.click(findTestObject('LearningPath/a_role_my_course'))

Thread.sleep(5000)

WebUI.click(findTestObject('LearningPath/LearnLearningPath/modul_learning_path'))

Thread.sleep(2000)

WebUI.setText(findTestObject('LearningPath/LearnLearningPath/input_search_learning_path'), 'Quy trình không thường xuyên Katalon 6')

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/LearnLearningPath/choose_learning_path'))

Thread.sleep(3000)

WebUI.click(findTestObject('LearningPath/LearnLearningPath/tab_detail'))

Thread.sleep(3000)

WebUI.verifyElementText(findTestObject('LearningPath/LearnLearningPath/label_thong_tin_chung'), 'Thông tin chung')

Thread.sleep(2000)

WebUI.verifyElementText(findTestObject('LearningPath/LearnLearningPath/label_all_step'), 'Tất cả các bước học')

Thread.sleep(2000)

WebUI.verifyElementText(findTestObject('LearningPath/LearnLearningPath/label_danh_gia'), 'Đánh giá')

Thread.sleep(2000)



