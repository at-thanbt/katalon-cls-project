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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ntmtien.cls.vn/account/login')

WebUI.setText(findTestObject('Course/Page Manage Course/addcourse/Page_ng nhp/input_UserName'), 'admin1')

WebUI.setText(findTestObject('Course/Page Manage Course/addcourse/Page_ng nhp/input_Password'), '123456')

WebUI.sendKeys(findTestObject('Course/Page Manage Course/addcourse/Page_ng nhp/input_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Course/Page Manage Course/addcourse/Page_Qun tr vin/div_Kho hc'))
Thread.sleep(2000)

WebUI.click(findTestObject('Course/Page Manage Course/addcourse/Page_Qun l kha hc/span_THM KHA HC'))
Thread.sleep(2000)

WebUI.setText(findTestObject('Course/Page Manage Course/addcourse/Page_Qun l kha hc/input_TenKhoaHoc'), 'khóa học 1')
Thread.sleep(2000)
WebUI.selectOptionByValue(findTestObject('Course/Page Manage Course/addcourse/Page_Qun l kha hc/select_La chn mc'), '4', true)
Thread.sleep(2000)

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('CKEDITOR.instances["GioiThieuKhoaHoc"].setData("<p>testContent</p>")')


WebUI.click(findTestObject('Course/Page Manage Course/addcourse/Page_Qun l kha hc/input_saveCourse'))


//WebUI.closeBrowser()

