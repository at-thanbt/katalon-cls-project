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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By

//WebUI.callTestCase(findTestCase('Course/GoToContent'), [:], FailureHandling.STOP_ON_FAILURE)
Thread.sleep(5000)
WebUI.click(findTestObject('Course/ManageContent/NameContent/span_select_list_content'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/NameContent/content_test'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Course/ManageContent/Test/input_name_test'), 'Bài kiểm tra')

WebUI.click(findTestObject('Course/ManageContent/Test/button_add_new_question'))

Thread.sleep(2000)

//WebUI.click(findTestObject('Course/ManageContent/Test/select_type_question'))
//Thread.sleep(2000)
WebUI.click(findTestObject('Course/ManageContent/Test/TrueFalse/option_true_false'))

Thread.sleep(2000)

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('CKEDITOR.instances["txtNoiDungCauHoiLuaChonDungSai"].setData("<p>Câu hỏi lựa chọn đúng sai</p>")')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Test/TrueFalse/button_save_and_create_new_truefalse'))

WebUI.acceptAlert()

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Test/TrueFalseClause/option_true_false_cluase'))

Thread.sleep(2000)

js.executeScript('CKEDITOR.instances["txtNoiDungCauHoiMenhDeDungSai"].setData("<p>Câu hỏi mệnh đề đúng sai</p>")')

Thread.sleep(2000)

js.executeScript('CKEDITOR.instances["txtNoiDungPhuongAn_1"].setData("<p>Phươn án 1</p>")')

js.executeScript('CKEDITOR.instances["txtNoiDungPhuongAn_2"].setData("<p>Phươn án 2</p>")')

js.executeScript('CKEDITOR.instances["txtNoiDungPhuongAn_3"].setData("<p>Phươn án 3</p>")')

js.executeScript('CKEDITOR.instances["txtNoiDungPhuongAn_4"].setData("<p>Phươn án 4</p>")')

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Test/TrueFalseClause/button_save_and_close_truefalseclause'))

WebUI.acceptAlert()

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Test/tab_tuy_chon_nang_cao'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Course/ManageContent/Test/input_number_question_in_page'), '1')

WebUI.click(findTestObject('Course/ManageContent/Test/tab_noi_dung'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/Test/button_save_test'))
Thread.sleep(2000)
WebUI.acceptAlert()

