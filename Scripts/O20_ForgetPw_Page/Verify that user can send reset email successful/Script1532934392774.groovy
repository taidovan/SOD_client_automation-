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

WebUI.setText(findTestObject('O20_ForgetPw_page/O20_ForgetPw_Email_Input'), 'taistore001@yopmail.com')

WebUI.click(findTestObject('O20_ForgetPw_page/O20_ForgetPw_btn_Send_Reset_Pw'))

WebUI.comment('verify error message visible')

WebUI.waitForElementVisible(findTestObject('O20_ForgetPw_page/O20_Toast_Message'), 0)

WebUI.verifyTextPresent('認証メールを送信しました', false)

WebUI.comment('page navigate to reset completed so verify page reset completed elements visible')

WebUI.verifyElementPresent(findTestObject('O20_ForgetPw_page/O20-1_ForgetPw_Completed_Page/O20-1_ForgetPw_Completed_logo'), 
    0)

WebUI.verifyElementPresent(findTestObject('O20_ForgetPw_page/O20-1_ForgetPw_Completed_Page/O20-1_ForgetPw_Completed_Descripiton'), 
    0)

WebUI.verifyTextPresent('パスワード再設定メールを送信しました。ご確認ください', false)

WebUI.verifyElementPresent(findTestObject('O20_ForgetPw_page/O20-1_ForgetPw_Completed_Page/O20-1_ForgetPw_Completed_btn_Back_To_Login'), 
    0)

WebUI.verifyTextPresent('ログインページへ戻る', false)

WebUI.comment('back to login page')

WebUI.click(findTestObject('O20_ForgetPw_page/O20-1_ForgetPw_Completed_Page/O20-1_ForgetPw_Completed_btn_Back_To_Login'))

WebUI.waitForPageLoad(0)

WebUI.comment('Check email come to inbox yopmail')

WebUI.navigateToUrl('http://www.yopmail.com/en/')

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('O20_ForgetPw_page/Yopmail_Page/Yopmail_input_mail'), 'taistore001@yopmail.com')

WebUI.click(findTestObject('O20_ForgetPw_page/Yopmail_Page/Yopmail_input_btn_check_Inbox'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('O20_ForgetPw_page/Yopmail_Page/Yopmail_btn_refresh_mail'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('O20_ForgetPw_page/Yopmail_Page/Yopmail_btn_refresh_mail'))

WebUI.waitForPageLoad(0)

WebUI.switchToFrame(findTestObject('O20_ForgetPw_page/Yopmail_Page/Yopmail_frame'), 0)

WebUI.click(findTestObject('O20_ForgetPw_page/Yopmail_Page/Yopmail_btn_kochira'))

WebUI.waitForPageLoad(0)

not_run: WebUI.comment('check email come to inbox mailinator')

not_run: WebUI.navigateToUrl('http://www.mailinator.com/')

not_run: WebUI.waitForPageLoad(0)

not_run: WebUI.setText(findTestObject('O20_ForgetPw_page/Mailinator_page/Mailinator_email_input'), 'taistore001')

not_run: WebUI.click(findTestObject('O20_ForgetPw_page/Mailinator_page/Mailinator_btn_go'))

not_run: WebUI.click(findTestObject('O20_ForgetPw_page/Mailinator_page/Mailinator_email_inbox'))

not_run: WebUI.click(findTestObject('O20_ForgetPw_page/Mailinator_page/Mailinator_first_email'))

not_run: WebUI.comment('click at btn kochira to reset pw')

not_run: WebUI.switchToFrame(findTestObject('O20_ForgetPw_page/Mailinator_page/Mailinator_inbox_content_iframe'), 0)

not_run: WebUI.click(findTestObject('O20_ForgetPw_page/Mailinator_page/Mailinator_btn_Kochira'))

WebUI.comment('Verify O21 reset pw elements')

WebUI.switchToWindowUrl('https://yoyaku.sod.bla-one.net/password/setup')

WebUI.waitForJQueryLoad(0)

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_Title'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Input'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Confirm_Label'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Label'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Confirm_Input'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_Title'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_Description'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_btn_SettingPw'), 0)

not_run: WebUI.comment('Verify password validation')

not_run: WebUI.comment('password is empty')

not_run: WebUI.click(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Input'))

not_run: WebUI.click(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Label'))

not_run: WebUI.verifyTextPresent('パスワードを入力してください\n', false)

not_run: WebUI.comment('NewPw confirm is empty')

not_run: WebUI.click(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Confirm_Input'))

not_run: WebUI.click(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Confirm_Label'))

not_run: WebUI.verifyTextPresent('再度パスワードを入力してください', false)

not_run: WebUI.comment('password is wrong format')

not_run: WebUI.setText(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Input'), '123456789')

not_run: WebUI.verifyTextPresent('パスワードは半角英数字8文字以上で大文字、小文字、「_ + - @」の記号を含めて入力してください', false)

not_run: WebUI.comment('password right format but less than 8 chars')

not_run: WebUI.setText(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Input'), 'Abcd@1')

not_run: WebUI.verifyTextPresent('パスワードは半角英数字8文字以上で大文字、小文字、「_ + - @」の記号を含めて入力してください', false)

not_run: WebUI.comment('NewPw confirm is different with NewPw')

not_run: WebUI.setText(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Input'), 'Abcd@1234')

not_run: WebUI.setText(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Confirm_Input'), 'Abcd@123456')

not_run: WebUI.verifyTextPresent('確認用パスワードと新しいパスワードが一致しません。', false)

WebUI.comment('register pw completed')

WebUI.setText(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Input'), 'Abcd@1234')

WebUI.setText(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_NewPw_Confirm_Input'), 'Abcd@1234')

WebUI.click(findTestObject('O21_RegisterPw_Page/O21_RegisterPw_btn_SettingPw'))

WebUI.delay(10)

WebUI.comment('verify reset completed')

not_run: WebUI.verifyElementPresent(findTestObject('O22_RegisterPw_Completed_Page/O22_RegisterPw_Completed_btn_BackToLogin'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('O21_RegisterPw_Page/O22_RegisterPw_Completed_Page/O22_RegisterPw_Completed_Description'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('O21_RegisterPw_Page/O22_RegisterPw_Completed_Page/O22_RegisterPw_Completed_Title'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('O21_RegisterPw_Page/O22_RegisterPw_Completed_Page/O22_RegisterPw_Completed_Title'), 
    'パスワード再設定')

not_run: WebUI.verifyElementText(findTestObject('O21_RegisterPw_Page/O22_RegisterPw_Completed_Page/O22_RegisterPw_Completed_Description'), 
    'パスワードの設定が完了しました。')

not_run: WebUI.verifyElementText(findTestObject('O21_RegisterPw_Page/O22_RegisterPw_Completed_Page/O22_RegisterPw_Completed_btn_BackToLogin'), 
    'サインインページへ')

WebUI.comment('verify back to login')

WebUI.click(findTestObject('O22_RegisterPw_Completed_Page/O22_RegisterPw_Completed_btn_BackToLogin'))

WebUI.comment('Verify already back to login page')

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/O1_Login_Logo'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/O1_Login_btn_Signin'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Input'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Label'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/O1_Login_btn_ForgetPw'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/Password/O1_Login_PW_Input'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/Password/O1_Login_PW_Label'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/O1_Login_Description'), 0)

WebUI.comment('Verify element texts')

WebUI.verifyElementText(findTestObject('O1_Login_Page/O1_Login_Description'), 'ご登録のメールアドレスとパスワードでログインが可能です')

WebUI.verifyElementText(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Label'), 'メールアドレス')

WebUI.verifyElementText(findTestObject('O1_Login_Page/Password/O1_Login_PW_Label'), 'パスワード')

WebUI.verifyElementText(findTestObject('O1_Login_Page/O1_Login_btn_Signin'), 'サインイン')

WebUI.verifyElementText(findTestObject('O1_Login_Page/O1_Login_btn_ForgetPw'), 'パスワードを忘れた方')

