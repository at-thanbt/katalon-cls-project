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

WebUI.callTestCase(findTestCase('Authentication/Login1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Administrator/div_modun_learning_path'))

Thread.sleep(2000)

WebUI.setText(findTestObject('LearningPath/input_search_learning_path'), 'Quy trình không thường xuyên Katalon 1')

Thread.sleep(4000)

WebUI.click(findTestObject('LearningPath/icon_edit_learning_path'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/EditLearning/tab_user'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/EditLearning/radio_user'))

Thread.sleep(2000)

WebUI.setText(findTestObject('LearningPath/EditLearning/input_search_user'), 'user1')

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/EditLearning/checkbox_all'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/EditLearning/button_add'))

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/EditLearning/button_save'))

Thread.sleep(2000)

WebUI.acceptAlert()

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/EditLearning/button_send_approve'))

Thread.sleep(2000)

WebUI.acceptAlert()

Thread.sleep(2000)

WebUI.acceptAlert()

Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/button_approve'))
Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/icon_detail_learning_approve'))
Thread.sleep(2000)

WebUI.click(findTestObject('LearningPath/button_approve_learning'))
Thread.sleep(2000)

WebUI.acceptAlert()
Thread.sleep(2000)
WebUI.acceptAlert()
Thread.sleep(2000)
