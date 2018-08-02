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

WebUI.openBrowser('https://yoyaku.sod.bla-one.net/password/forgot')

WebUI.verifyElementPresent(findTestObject('O20_ForgetPw_page/O20_ForgetPw_btn_Back_To_Login'), 0)

WebUI.verifyElementPresent(findTestObject('O20_ForgetPw_page/O20_ForgetPw_Email_Label'), 0)

WebUI.verifyElementPresent(findTestObject('O20_ForgetPw_page/O20_ForgetPw_Email_Input'), 0)

WebUI.verifyElementPresent(findTestObject('O20_ForgetPw_page/O20_ForgetPw_logo'), 0)

WebUI.verifyElementPresent(findTestObject('O20_ForgetPw_page/O20_ForgetPw_Description'), 0)

WebUI.verifyElementPresent(findTestObject('O20_ForgetPw_page/O20_ForgetPw_Title'), 0)

WebUI.verifyElementPresent(findTestObject('O20_ForgetPw_page/O20_ForgetPw_btn_Send_Reset_Pw'), 0)

