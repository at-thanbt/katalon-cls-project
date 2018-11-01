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

WebUI.callTestCase(findTestCase('Course/GoToContent'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Course/ManageContent/NameContent/span_select_list_content'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/NameContent/content_section'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Course/ManageContent/Section/input_text_section'), 'Chuyên đề 1')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Section/button_save'))

Thread.sleep(7000)

WebUI.click(findTestObject('Course/ManageContent/Section/icon_edit_section'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Course/ManageContent/Section/input_text_section'), 'Chuyên đề 2')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Section/button_update'))

Thread.sleep(4000)

WebUI.click(findTestObject('Course/ManageContent/Section/icon_delete_section'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Section/button_agree_delete_section'))

