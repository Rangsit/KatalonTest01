import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demos.telerik.com/aspnet-ajax/textbox/overview/defaultcs.aspx')

if (WebUI.verifyElementPresent(findTestObject('Keys/cookie'), 3)) {
    WebUI.click(findTestObject('Object Repository/Keys/cookie'))
}

WebUI.scrollToElement(findTestObject('Keys/panel'), 3)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Keys/textArea'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.delay(3)

WebUI.setText(findTestObject('Keys/textArea'), 'This is a test no. 1')

WebUI.delay(3)

not_run: WebUI.sendKeys(findTestObject('Keys/textArea'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.delay(3)

not_run: WebUI.setText(findTestObject('Keys/textArea'), 'Hello')

