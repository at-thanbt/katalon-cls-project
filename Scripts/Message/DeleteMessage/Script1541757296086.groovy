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

WebUI.click(findTestObject('Message/message_counter'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Message/ReceiveMessage/input_search_receive_message'), 'Tin nhắn tạo từ Katalon gửi cho tất cả user')

Thread.sleep(4000)

WebUI.click(findTestObject('Message/ReceiveMessage/checkbox_all'))

Thread.sleep(2000)

WebUI.click(findTestObject('Message/ReceiveMessage/button_delete'))

Thread.sleep(2000)

WebUI.click(findTestObject('Message/ReceiveMessage/button_confirm_delete_message'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Message/ReceiveMessage/input_search_receive_message'), 'Tin nhắn tạo từ Katalon gửi cho chi nhánh')

Thread.sleep(4000)

WebUI.click(findTestObject('Message/ReceiveMessage/checkbox_all'))

Thread.sleep(2000)

WebUI.click(findTestObject('Message/ReceiveMessage/button_delete'))

Thread.sleep(2000)

WebUI.click(findTestObject('Message/ReceiveMessage/button_confirm_delete_message'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Message/ReceiveMessage/input_search_receive_message'), 'Tin nhắn tạo từ Katalon gửi cho khóa học')

Thread.sleep(4000)

WebUI.click(findTestObject('Message/ReceiveMessage/checkbox_all'))

Thread.sleep(2000)

WebUI.click(findTestObject('Message/ReceiveMessage/button_delete'))

Thread.sleep(2000)

WebUI.click(findTestObject('Message/ReceiveMessage/button_confirm_delete_message'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Message/ReceiveMessage/input_search_receive_message'), 'Tin nhắn tạo từ Katalon gửi cho một người dùng')

Thread.sleep(4000)

WebUI.click(findTestObject('Message/ReceiveMessage/checkbox_all'))

Thread.sleep(2000)

WebUI.click(findTestObject('Message/ReceiveMessage/button_delete'))

Thread.sleep(2000)

WebUI.click(findTestObject('Message/ReceiveMessage/button_confirm_delete_message'))

Thread.sleep(2000)

