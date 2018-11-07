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
Thread.sleep(4000)

WebUI.click(findTestObject('Course/ManageContent/AssignUser/button_assign_user'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Course/ManageContent/AssignUser/input_search_user'), 'admin2')

Thread.sleep(4000)

WebUI.click(findTestObject('Course/ManageContent/AssignUser/checkbox_choose_user'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/AssignUser/button_save_assign_user'))

Thread.sleep(3000)

WebUI.click(findTestObject('Course/ManageContent/AssignUser/tab_course'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/AssignUser/link_go_to_course_content'))

Thread.sleep(3000)

WebUI.click(findTestObject('Course/ManageContent/AssignUser/button_publish_course'))

Thread.sleep(5000)

WebUI.callTestCase(findTestCase('Authentication/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

