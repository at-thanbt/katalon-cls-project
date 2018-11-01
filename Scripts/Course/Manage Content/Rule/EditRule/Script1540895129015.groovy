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

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Ruler/tab_ruler'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Ruler/checkbox_apply_time'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Course/ManageContent/Ruler/input_date_learn'), '2')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Ruler/checkbox_certificate'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Course/ManageContent/Ruler/input_time_certificate'), '1')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Ruler/checkbox_thang_danh_gia'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Ruler/selectbox_muc_danh_gia'))

Thread.sleep(2000)

WebUI.selectOptionByValue(findTestObject('Course/ManageContent/Ruler/choose_thang_danh-gia'), 'Thang mặc định', true)
Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Ruler/button_save_rule'))