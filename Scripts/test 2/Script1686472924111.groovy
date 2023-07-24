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

WebUI.navigateToUrl('https://testapp3.meinvoice.vn/login/1?ReturnUrl=%2F')

WebUI.click(findTestObject('Object Repository/test/Page_ng nhp  Ha n in t MISA meInvoice/input_MISA meInvoice_TaxCode'))

WebUI.setText(findTestObject('Object Repository/test/Page_ng nhp  Ha n in t MISA meInvoice/input_MISA meInvoice_TaxCode'), 
    '0101000133-022')

WebUI.setText(findTestObject('Object Repository/test/Page_ng nhp  Ha n in t MISA meInvoice/input_M s thu_UserName'), 'qc.autosale@outlook.com')

WebUI.click(findTestObject('Object Repository/test/Page_ng nhp  Ha n in t MISA meInvoice/input_Email hoc s in thoi_btnLogin'))

WebUI.setEncryptedText(findTestObject('Object Repository/test/Page_ng nhp  Ha n in t MISA meInvoice/input_Cho mng, QC CRM MISA_Password'), 
    'RigbBhfdqOBZqUu2yVyN4A==')

WebUI.click(findTestObject('Object Repository/test/Page_ng nhp  Ha n in t MISA meInvoice/input_Email hoc s in thoi_btnLogin'))

WebUI.click(findTestObject('Object Repository/test/Page_Ha n in t MISA meInvoice/a_ng hng dn bt u s dng'))

WebUI.click(findTestObject('Object Repository/test/Page_Ha n in t MISA meInvoice/div_ng_icon mi-64 icon-button-livechat'))

WebUI.click(findTestObject('Object Repository/test/Page_Ha n in t MISA meInvoice/svg_H tr trc tuyn_lc-1mpchac'))

WebUI.closeBrowser()

