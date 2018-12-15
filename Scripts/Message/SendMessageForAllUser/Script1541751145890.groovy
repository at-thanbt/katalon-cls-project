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

WebUI.callTestCase(findTestCase('Message/OpenPageMessage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Message/ReceiveMessage/button_add_message'))

Thread.sleep(3000)

WebUI.switchToWindowIndex(0)

String title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Gửi tin nhắn', true)

WebUI.click(findTestObject('Message/CreateMessage/diachinguoinhan'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.click(findTestObject('Message/CreateMessage/choose_all_user'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Message/CreateMessage/title_message'), 'Tin nhắn tạo từ Katalon gửi cho tất cả user')

Thread.sleep(2000)

WebUI.setText(findTestObject('Message/CreateMessage/input_content_message'), 'Nội dung tin nhắn được tạp từ Katalon')

Thread.sleep(2000)

WebUI.uploadFile(findTestObject('Message/CreateMessage/attach_file'), 'E:\\api.xlsx')

Thread.sleep(3000)

WebUI.click(findTestObject('Message/CreateMessage/button_send_message'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Message/SendMessage/input_search_message_send'), 'Tin nhắn tạo từ Katalon gửi cho tất cả user')

Thread.sleep(2000)

WebUI.verifyTextPresent('Tin nhắn tạo từ Katalon', false)

Thread.sleep(2000)


/*WebUI.callTestCase(findTestCase('Authentication/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('Authentication/Login2'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.click(findTestObject('Message/message_counter'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Message/ReceiveMessage/input_search_receive_message'), 'Tin nhắn tạo từ Katalon gửi cho tất cả user')

Thread.sleep(2000)

WebUI.verifyTextPresent('Tin nhắn tạo từ Katalon gửi cho tất cả user', false)

*/