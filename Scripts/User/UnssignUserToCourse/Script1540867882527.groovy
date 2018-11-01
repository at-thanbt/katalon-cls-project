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
import org.openqa.selenium.Keys as Keys

Thread.sleep(10000)

WebUI.mouseOver(findTestObject('Administrator/select_user_action'))

Thread.sleep(5000)

WebUI.click(findTestObject('User/Page Learner/a_role_administrator'))

WebUI.click(findTestObject('Administrator/div_modun_user'))

Thread.sleep(3000)

WebUI.verifyTextPresent('Quản lý người dùng', false)

WebUI.setText(findTestObject('User/Page Manage User/input_txtUserSearchBox'), 'admin1')

Thread.sleep(3000)

WebUI.click(findTestObject('User/Page Manage User/icon_edit_user'))

Thread.sleep(3000)

WebUI.click(findTestObject('User/Page Edit User/tab_course'))

WebUI.setText(findTestObject('User/Page Edit User/input_search_course_in_user'), 'Vận hành CLS trong Doanh Nghiệp')

Thread.sleep(3000)

WebUI.click(findTestObject('User/Page Edit User/Tab Course/checkbox_assign_course'))

WebUI.click(findTestObject('User/Page Edit User/Tab Course/button_save_assign_course'))

Thread.sleep(5000)

WebUI.mouseOver(findTestObject('Administrator/select_user_action'))

Thread.sleep(3000)

WebUI.click(findTestObject('Administrator/a_role_learner'))

WebUI.setText(findTestObject('User/Page Learner/input_course_search_box'), 'Vận hành CLS trong Doanh Nghiệp')

WebUI.verifyTextNotPresent('Vận hành CLS trong Doanh Nghiệp', false)

Thread.sleep(3000)

WebUI.callTestCase(findTestCase('Authentication/Logout'), [:], FailureHandling.STOP_ON_FAILURE)



