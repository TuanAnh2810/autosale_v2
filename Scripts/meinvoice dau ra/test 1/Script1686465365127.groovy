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

WebUI.navigateToUrl('https://teststore.misa.vn/v2/quote?pid=220')

WebUI.maximizeWindow()

WebUI.click(findTestObject('1_man hinh bao gia/btn_mua ngay 100k'))

WebUI.waitForElementVisible(findTestObject('2_man hinh gio hang/text title gio hang'), 2)

WebUI.scrollToElement(findTestObject('2_man hinh gio hang/btn_xem them'), 1)

WebUI.click(findTestObject('2_man hinh gio hang/btn_xem them'))

WebUI.click(findTestObject('btn_tiep tuc'))

WebUI.setText(findTestObject('3_man hinh thanh toan/input_ ho va ten'), 'Nguyễn Đắc Tuấn Anh')

WebUI.setText(findTestObject('3_man hinh thanh toan/input_sdt'), '0373425707')

WebUI.setText(findTestObject('3_man hinh thanh toan/input_mst'), '0101000133')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('3_man hinh thanh toan/input_mst'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('3_man hinh thanh toan/input_quanhuyen'), 1)

WebUI.setText(findTestObject('3_man hinh thanh toan/input_email'), 'qc.autosale@outlook.com')

WebUI.click(findTestObject('3_man hinh thanh toan/radio_btn_the noi dia'))

WebUI.setText(findTestObject('3_man hinh thanh toan/input_mst'), '0101000133-034')

WebUI.click(findTestObject('btn_tiep tuc'))

WebUI.setText(findTestObject('4_man hinh hd thanh toan/input_so the'), '9704000000000018')

WebUI.setText(findTestObject('4_man hinh hd thanh toan/input_ten the'), 'NGUYEN VAN A')

WebUI.setText(findTestObject('4_man hinh hd thanh toan/input_ngay phat hanh'), '03/07')

WebUI.click(findTestObject('4_man hinh hd thanh toan/btn_thanh toan'))

WebUI.setText(findTestObject('4_man hinh hd thanh toan/input_otp'), 'otp')

WebUI.click(findTestObject('4_man hinh hd thanh toan/btn_tiep tuc'))

WebUI.waitForElementVisible(findTestObject('5_man hinh xac nhan don hang/text tt thanh cong'), 5)

WebUI.click(findTestObject('5_man hinh xac nhan don hang/btn_kich hoat ngay'))

WebUI.switchToWindowIndex('1')

WebUI.waitForElementVisible(findTestObject('6_man hinh my misa/textlink_dang nhap'), 5)

WebUI.click(findTestObject('6_man hinh my misa/textlink_dang nhap'))

WebUI.setText(findTestObject('6_man hinh my misa/username'), 'qc.autosale@outlook.com')

WebUI.setText(findTestObject('6_man hinh my misa/pass'), '12345678@Abc')

WebUI.sendKeys(findTestObject('6_man hinh my misa/pass'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('6_man hinh my misa/popup_input mst'), 5)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('6_man hinh my misa/popup_input mst'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('6_man hinh my misa/popup_input hoten'), 'QC CRM MISA')

WebUI.setText(findTestObject('6_man hinh my misa/popup_input chuc vu'), 'Khác')

WebUI.setText(findTestObject('6_man hinh my misa/popup_input sdt'), '0985666777')

WebUI.setText(findTestObject('6_man hinh my misa/popup_input email'), 'qc.autosale@outlook.com')

WebUI.click(findTestObject('6_man hinh my misa/popup_btn_tiep tuc'))

WebUI.switchToWindowIndex('2')

WebUI.setText(findTestObject('7_man hinh meinvoice/input_nganh nghe kd'), 'Bán buôn chuyên doanh khác')

WebUI.setText(findTestObject('7_man hinh meinvoice/input_ho va ten'), 'QC CRM MISA')

WebUI.setText(findTestObject('7_man hinh meinvoice/input_sdt'), '0985666777')

WebUI.setText(findTestObject('7_man hinh meinvoice/input_email'), 'qc.autosale@outlook.com')

WebUI.scrollToElement(findTestObject('7_man hinh meinvoice/input_cuc thue'), 1)

WebUI.setText(findTestObject('7_man hinh meinvoice/input_cuc thue'), 'Cục Thuế Tỉnh Ninh Bình')

WebUI.setText(findTestObject('7_man hinh meinvoice/input_quan ly thue'), 'Cục Thuế Tỉnh Ninh Bình')

WebUI.click(findTestObject('7_man hinh meinvoice/btn_tiep tuc'))

WebUI.click(findTestObject('7_man hinh meinvoice/btn_tiep tuc'))

//WebUI.click(findTestObject('7_man hinh meinvoice/text link close huong dan'))
WebUI.click(findTestObject('7_man hinh meinvoice/text dong y thoa thuan'))

WebUI.click(findTestObject('7_man hinh meinvoice/btn_dong y thoa thuan'))

WebUI.click(findTestObject('7_man hinh meinvoice/btn_close thoa thuan'))

WebUI.click(findTestObject('7_man hinh meinvoice/text link close huong dan'))

WebUI.click(findTestObject('7_man hinh meinvoice/btn_bo qua huong dan'))

WebUI.click(findTestObject('7_man hinh meinvoice/btn_close thoa thuan'))

WebUI.switchToFrame(findTestObject('7_man hinh meinvoice/frame_Chatbox'), 5)

WebUI.click(findTestObject('7_man hinh meinvoice/btn_thu nho chat bot'))

WebUI.switchToWindowTitle('Hóa đơn điện tử MISA meInvoice')

WebUI.click(findTestObject('7_man hinh meinvoice/tab_he thong'))

WebUI.click(findTestObject('7_man hinh meinvoice/tab_quan ly tai nguyen'))

slhd = WebUI.getText(findTestObject('7_man hinh meinvoice/sl hoa don da mua'))

WebUI.verifyEqual(slhd, '100.000')

WebUI.switchToWindowUrl('https://testid.misa.vn/subscription')

WebUI.setText(findTestObject('6_man hinh my misa/combobox_chon cty'), 'CÔNG TY TNHH HỒNG QUÂN')

WebUI.sendKeys(findTestObject('6_man hinh my misa/combobox_chon cty'), Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('6_man hinh my misa/textlink_ten sp1'))

