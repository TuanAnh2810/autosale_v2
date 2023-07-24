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

WebUI.verifyElementText(findTestObject('2_man hinh gio hang/text title gio hang'), 'Giỏ hàng (1)')

WebUI.verifyElementVisible(findTestObject('2_man hinh gio hang/text ten san pham'))

WebUI.verifyElementText(findTestObject('2_man hinh gio hang/text ten san pham'), 'MISA meInvoice - Hóa đơn đầu ra')

//<<<<<<< HEAD
//WebUI.verifyElementNotClickable(findTestObject('man hinh gio hang/detail1_btn giam sl'))
//WebUI.verifyElementNotClickable(findTestObject('man hinh gio hang/detail1_btn tang sl'))
//WebUI.verifyElementNotClickable(findTestObject('man hinh gio hang/detail1_input sl'))
//WebUI.verifyElementVisible(findTestObject('man hinh gio hang/detail1_don gia'))
//=======
//WebUI.verifyElementNotClickable(findTestObject('2_man hinh gio hang/detail1_btn giam sl'))
//WebUI.verifyElementNotClickable(findTestObject('2_man hinh gio hang/detail1_btn tang sl'))
//WebUI.verifyElementNotClickable(findTestObject('2_man hinh gio hang/detail1_input sl'))
WebUI.verifyElementVisible(findTestObject('2_man hinh gio hang/detail1_don gia'))

//>>>>>>> 70f3495e0a1ccf6069731dcbcb2553867f41ca59
WebUI.verifyElementText(findTestObject('2_man hinh gio hang/detail1_don gia'), '1.000.000')

WebUI.verifyElementVisible(findTestObject('2_man hinh gio hang/detail1_thanh tien'))

WebUI.verifyElementVisible(findTestObject('2_man hinh gio hang/detail1_text dvt'))

WebUI.verifyElementVisible(findTestObject('2_man hinh gio hang/detail1_text phi khoi tao'))

WebUI.verifyElementText(findTestObject('2_man hinh gio hang/detail1_text phi khoi tao'), 'Phí Khởi tạo phần mềm')

WebUI.verifyElementAttributeValue(findTestObject('2_man hinh gio hang/detail1_input sl'), 'value', '1', 1)

WebUI.verifyElementNotPresent(findTestObject('2_man hinh gio hang/detail3_ten goi'), 1)

WebUI.scrollToElement(findTestObject('2_man hinh gio hang/btn_xem them'), 1)

WebUI.verifyElementNotVisible(findTestObject('2_man hinh gio hang/btn_them vao gio goi 5000'))

WebUI.click(findTestObject('2_man hinh gio hang/btn_xem them'))

//WebUI.scrollToElement(findTestObject('2_man hinh gio hang/btn_an bot'), 1)
for (int i = 1; i <= 7; i++) {
    WebUI.scrollToElement(findTestObject('2_man hinh gio hang/btn_an bot'), 1)

    WebUI.click(findTestObject('2_man hinh gio hang/btn_them vao gio', [('index') : i]))
}

WebUI.delay(1)

String[] ttArray = new String[]

for (int a = 3; a < 10; a++) {
    (ttArray[a]) = WebUI.getText(findTestObject('2_man hinh gio hang/detail_thanh tien', [('index1') : a]))
}

WebUI.verifyEqual(ttArray[3], '60.000.000')

WebUI.verifyEqual(ttArray[4], '450.000')

WebUI.verifyEqual(ttArray[5], '650.000')

WebUI.verifyEqual(ttArray[6], '1.050.000')

WebUI.verifyEqual(ttArray[7], '1.550.000')

WebUI.verifyEqual(ttArray[8], '3.150.000')

WebUI.verifyEqual(ttArray[9], '5.250.000')

//<<<<<<< HEAD
String[] mgArray = new String[]

for (int m = 3; m < 10; m++) {
    (mgArray[m]) = WebUI.getText(findTestObject('2_man hinh gio hang/detail_ma goi', [('index1') : m]))
}

WebUI.verifyEqual(mgArray[3], 'MEIR-100.000')

WebUI.verifyEqual(mgArray[4], 'MEIR-300')

WebUI.verifyEqual(mgArray[5], 'MEIR-500')

WebUI.verifyEqual(mgArray[6], 'MEIR-1.000')

WebUI.verifyEqual(mgArray[7], 'MEIR-2.000')

WebUI.verifyEqual(mgArray[8], 'MEIR-5.000')

WebUI.verifyEqual(mgArray[9], 'MEIR-10.000')

String[] motagArray = new String[]

for (int g = 3; g < 10; g++) {
    (motagArray[g]) = WebUI.getText(findTestObject('2_man hinh gio hang/detail_mota goi', [('index1') : g]))
}

WebUI.verifyEqual(motagArray[3], 'Gói 100.000 hóa đơn')

WebUI.verifyEqual(motagArray[4], 'Gói 300 hóa đơn')

WebUI.verifyEqual(motagArray[5], 'Gói 500 hóa đơn')

WebUI.verifyEqual(motagArray[6], 'Gói 1.000 hóa đơn')

WebUI.verifyEqual(motagArray[7], 'Gói 2.000 hóa đơn')

WebUI.verifyEqual(motagArray[8], 'Gói 5.000 hóa đơn')

WebUI.verifyEqual(motagArray[9], 'Gói 10.000 hóa đơn')

tongtien = WebUI.getText(findTestObject('Tong tien'))

WebUI.verifyEqual(tongtien, '73.100.000 VND')

WebUI.click(findTestObject('btn_tiep tuc'))

WebUI.setText(findTestObject('3_man hinh thanh toan/input_ ho va ten'), 'Nguyễn Tuấn Anh')

WebUI.setText(findTestObject('3_man hinh thanh toan/input_sdt'), '0373425707')

WebUI.setText(findTestObject('3_man hinh thanh toan/input_mst'), '0101000133')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('3_man hinh thanh toan/input_mst'), Keys.chord(Keys.ENTER))

tencty = WebUI.getText(findTestObject('3_man hinh thanh toan/input_ten cong ty'))

WebUI.scrollToElement(findTestObject('3_man hinh thanh toan/input_quanhuyen'), 1)

tinhtp = WebUI.getText(findTestObject('3_man hinh thanh toan/input_tinhTP'))

qhuyen = WebUI.getText(findTestObject('3_man hinh thanh toan/input_quanhuyen'))

diachi = WebUI.getText(findTestObject('3_man hinh thanh toan/input_dia chi'))

WebUI.setText(findTestObject('3_man hinh thanh toan/input_email'), 'qc.autosale@outlook.com')

WebUI.click(findTestObject('3_man hinh thanh toan/radio_btn_the noi dia'))

WebUI.check(findTestObject('3_man hinh thanh toan/checkbox_thoa thuan sd'))

WebUI.setText(findTestObject('3_man hinh thanh toan/input_mst'), GlobalVariable.mst)

WebUI.click(findTestObject('3_man hinh thanh toan/btn_Thanh toan'))

pu_tongtien = WebUI.getText(findTestObject('4_man hinh hd thanh toan/tongtien_jetpay'))

sdh = WebUI.getText(findTestObject('4_man hinh hd thanh toan/sdh_jetpay'))

//pu1_tongtien = pu_tongtien.replace(' VND', 'đ')
WebUI.verifyEqual(tongtien, pu_tongtien)

WebUI.setText(findTestObject('4_man hinh hd thanh toan/input_so the'), '9704000000000018')

WebUI.setText(findTestObject('4_man hinh hd thanh toan/input_ten the'), 'NGUYEN VAN A')

WebUI.setText(findTestObject('4_man hinh hd thanh toan/input_ngay phat hanh'), '03/07')

WebUI.click(findTestObject('4_man hinh hd thanh toan/btn_thanh toan'))

WebUI.setText(findTestObject('4_man hinh hd thanh toan/input_otp'), 'otp')

WebUI.click(findTestObject('4_man hinh hd thanh toan/btn_tiep tuc'))

WebUI.waitForElementVisible(findTestObject('5_man hinh xac nhan don hang/text tt thanh cong'), 5)

text_tt = WebUI.getText(findTestObject('5_man hinh xac nhan don hang/text tt thanh cong'))

String tt

tt = (('Đơn hàng #' + sdh) + ' đã thanh toán thành công')

WebUI.verifyEqual(text_tt, tt)

mkh = WebUI.getText(findTestObject('5_man hinh xac nhan don hang/text_ma kich hoat'))

WebUI.click(findTestObject('5_man hinh xac nhan don hang/btn_kich hoat ngay'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('6_man hinh my misa/textlink_dang nhap'), 5)

WebUI.click(findTestObject('6_man hinh my misa/textlink_dang nhap'))

WebUI.setText(findTestObject('6_man hinh my misa/username'), 'qc.autosale@outlook.com')

WebUI.setText(findTestObject('6_man hinh my misa/pass'), '12345678@Abc')

WebUI.sendKeys(findTestObject('6_man hinh my misa/pass'), Keys.chord(Keys.ENTER))

WebUI.waitForJQueryLoad(5)

WebUI.setText(findTestObject('6_man hinh my misa/popup_input hoten'), 'QC CRM MISA')

WebUI.setText(findTestObject('6_man hinh my misa/popup_input chuc vu'), 'Khác')

WebUI.setText(findTestObject('6_man hinh my misa/popup_input sdt'), '0985666777')

WebUI.setText(findTestObject('6_man hinh my misa/popup_input email'), 'qc.autosale@outlook.com')

WebUI.verifyElementAttributeValue(findTestObject('6_man hinh my misa/popup_input mst'), 'value', GlobalVariable.mst, 1)

WebUI.check(findTestObject('6_man hinh my misa/checkbox_xac nhan tt'))

//WebUI.verifyEqual(GlobalVariable.mst, mst_mymisa)
WebUI.click(findTestObject('6_man hinh my misa/popup_btn_tiep tuc'))

WebUI.click(findTestObject('6_man hinh my misa/btn_vao ung dung'))

WebUI.switchToWindowIndex('https://testapp3.meinvoice.vn/thiet-lap')

WebUI.setText(findTestObject('7_man hinh meinvoice/input_nganh nghe kd'), 'Bán buôn chuyên doanh khác')

WebUI.setText(findTestObject('7_man hinh meinvoice/input_ho va ten'), 'QC CRM MISA')

WebUI.setText(findTestObject('7_man hinh meinvoice/input_sdt'), '0985666777')

WebUI.setText(findTestObject('7_man hinh meinvoice/input_email'), 'qc.autosale@outlook.com')

WebUI.scrollToElement(findTestObject('7_man hinh meinvoice/input_cuc thue'), 1)

WebUI.setText(findTestObject('7_man hinh meinvoice/input_cuc thue'), 'Cục Thuế Tỉnh Ninh Bình')

WebUI.setText(findTestObject('7_man hinh meinvoice/input_quan ly thue'), 'Cục Thuế Tỉnh Ninh Bình')

WebUI.click(findTestObject('7_man hinh meinvoice/btn_tiep tuc'))

WebUI.click(findTestObject('7_man hinh meinvoice/btn_tiep tuc'))

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

WebUI.verifyEqual(slhd, '300.000')

WebUI.switchToWindowUrl('https://testid.misa.vn/subscription')

WebUI.setText(findTestObject('6_man hinh my misa/combobox_chon cty'), 'CÔNG TY TNHH HỒNG QUÂN')

WebUI.sendKeys(findTestObject('6_man hinh my misa/combobox_chon cty'), Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('6_man hinh my misa/textlink_ten sp1'))

