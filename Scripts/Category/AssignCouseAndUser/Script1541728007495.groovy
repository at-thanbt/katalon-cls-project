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

//WebUI.click(findTestObject('Administrator/div_modun_category'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Category/input_search_category'), 'Xóa chủ đề')

Thread.sleep(2000)

WebUI.click(findTestObject('Category/icon_edit_category'))

Thread.sleep(2000)

WebUI.click(findTestObject('Category/EditCategory/tab_course'))

Thread.sleep(2000)

WebUI.scrollToPosition(190, 200)

Thread.sleep(2000)

WebUI.click(findTestObject('Category/EditCategory/button_cancel_save_assign_course'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Category/input_search_category'), 'Xóa chủ đề')

Thread.sleep(2000)

WebUI.click(findTestObject('Category/icon_edit_category'))

Thread.sleep(2000)

WebUI.click(findTestObject('Category/EditCategory/tab_course'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Category/EditCategory/input_seach_course'), '123456')

Thread.sleep(2000)

WebUI.click(findTestObject('Category/EditCategory/checkbox_course'))

Thread.sleep(2000)

WebUI.click(findTestObject('Category/EditCategory/button_save_assign_course'))

Thread.sleep(2000)

WebUI.click(findTestObject('Category/EditCategory/tab_user'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Category/EditCategory/input_search_user'), 'user3')

Thread.sleep(2000)

WebUI.click(findTestObject('Category/EditCategory/checkbox_user'))

Thread.sleep(2000)

WebUI.click(findTestObject('Category/EditCategory/button_save_assign_user'))

Thread.sleep(2000)

WebUI.click(findTestObject('Category/EditCategory/tab_info'))

Thread.sleep(2000)

WebUI.click(findTestObject('Category/AddCategory/button_save_category'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Category/input_search_category'), 'Xóa chủ đề')

Thread.sleep(2000)

WebUI.click(findTestObject('Category/checkbox_all_category'))

Thread.sleep(2000)

WebUI.click(findTestObject('Category/button_delete_all_category'))

Thread.sleep(2000)

WebUI.click(findTestObject('Category/button_confirm_delete_category'))

Thread.sleep(4000)

WebUI.click(findTestObject('Category/icon_close_alert'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Category/input_search_category'), 'Xóa chủ đề')

Thread.sleep(2000)

WebUI.verifyTextNotPresent('Xóa chủ đề', false)

Thread.sleep(2000)

WebUI.click(findTestObject('Category/button_add_category'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Category/AddCategory/input_category_name'), 'Xóa chủ đề')

Thread.sleep(2000)

WebUI.click(findTestObject('Category/AddCategory/button_save_category'))

Thread.sleep(2000)

