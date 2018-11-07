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

WebUI.callTestCase(findTestCase('Authentication/Login2'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.click(findTestObject('Authentincation/Logout/Page Administrator/select_user_action'))

Thread.sleep(2000)

WebUI.click(findTestObject('Administrator/a_role_learner'))

Thread.sleep(2000)

WebUI.setText(findTestObject('User/Page Learner/input_course_search_box'), 'Khóa học tự động do thân tạo')

Thread.sleep(2000)

WebUI.verifyTextPresent('Khóa học tự động do thân tạo', false)

Thread.sleep(2000)

WebUI.click(findTestObject('User/Page Learner/a_name_of_course'))

Thread.sleep(2000)

WebUI.click(findTestObject('User/Page Learner/button_start_course'))

Thread.sleep(2000)

WebUI.click(findTestObject('User/Page Learner/button_qua_bai'))

Thread.sleep(3000)

WebUI.scrollToElement(findTestObject('User/Page Learner/test_question'), 3)

Thread.sleep(2000)

WebUI.click(findTestObject('User/Page Learner/radion_motluachon'))

Thread.sleep(2000)

WebUI.click(findTestObject('User/Page Learner/button_qua_bai'))

Thread.sleep(65000)

WebUI.click(findTestObject('User/Page Learner/button_qua_bai'))

Thread.sleep(3000)

WebUI.scrollToElement(findTestObject('User/Page Learner/test_question'), 3)

Thread.sleep(2000)

WebUI.click(findTestObject('User/Page Learner/radion_motluachon'))

Thread.sleep(2000)

WebUI.click(findTestObject('User/Page Learner/button_qua_bai'))

Thread.sleep(65000)

WebUI.click(findTestObject('User/Page Learner/button_qua_bai'))

Thread.sleep(2000)

WebUI.scrollToElement(findTestObject('User/Page Learner/test_question'), 3)

Thread.sleep(2000)

WebUI.click(findTestObject('User/Page Learner/radion_motluachon'))

Thread.sleep(2000)

WebUI.click(findTestObject('User/Page Learner/button_qua_bai'))

Thread.sleep(65000)

WebUI.click(findTestObject('User/Page Learner/button_finish_khaosat'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/icon_next_content'))

Thread.sleep(3000)

WebUI.click(findTestObject('User/Page Learner/button_start_test'))

Thread.sleep(3000)

WebUI.click(findTestObject('User/Page Learner/button_submit_test'))

Thread.sleep(3000)

WebUI.acceptAlert()

Thread.sleep(3000)

WebUI.click(findTestObject('User/Page Learner/button_accept'))

