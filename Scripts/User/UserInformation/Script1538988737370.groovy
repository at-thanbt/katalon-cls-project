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

WebUI.callTestCase(findTestCase('Authentication/Login1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Administrator/select_user_action'))

WebUI.click(findTestObject('Administrator/a_information_account'))

//WebUI.click(findTestObject('UserInformation/Page User Account/button_select_picture_account'))
//WebUI.click(findTestObject('UserInformation/Page User Account/a_tab_branch'))
WebUI.click(findTestObject('UserInformation/Page User Account/button_Save Information'))

Thread.sleep(3000)

WebUI.verifyTextPresent('Thông tin cá nhân của bạn đã được cập nhật', false)

WebUI.click(findTestObject('UserInformation/Page User Account/button_close_alert'))

Thread.sleep(3000)

WebUI.click(findTestObject('UserInformation/Page User Account/a_tab_course'))

Thread.sleep(1000)

WebUI.setText(findTestObject('UserInformation/Page User Account/seach_course'), 'thời gian video')

WebUI.verifyTextPresent('thời gian video', false)

Thread.sleep(3000)

WebUI.callTestCase(findTestCase('Authentication/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

