import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), GlobalVariable.email)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mr_id_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'mis')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'los')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), GlobalVariable.password)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20212020201920182017201620152014201_28b437'), 
    '1903', true)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_Sign up for our newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_September_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Sign up for our newsletter_optin'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Company_company'), 'mrak')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'BB')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Address (Line 2)_address2'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'Unknow')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '48', true)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/p_ZipPostal Code'))

WebUI.setText(findTestObject('Page_Login - My Store/input__postcode'), '23456')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/textarea_Additional information_other'), 'some phone number')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Home phone_phone'), '0981234567')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '0981234567')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__alias'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__alias'), 'My address new')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.verifyTextPresent('mis los', false)

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/a_Sign out'))

WebUI.closeBrowser()

