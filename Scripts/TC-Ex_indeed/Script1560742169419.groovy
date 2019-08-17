import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://th.indeed.com/')

WebUI.setText(findTestObject('Indeed/what'), 'Automated Test')

WebUI.sendKeys(findTestObject('Indeed/where'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

not_run: WebUI.delay(3)

WebUI.setText(findTestObject('Indeed/where'), 'Bangkok')

WebUI.click(findTestObject('Indeed/findJobs'))

output = WebUI.getText(findTestObject('Indeed/results'))

println(output)

if (WebUI.verifyMatch(output, '.* jobs', true)) {
    KeywordUtil.markPassed('Pass: Actual Result matches Expected Result')
} else {
    KeywordUtil.markFailed('Fail: Actual Result does not match Expected Result')
}

WebUI.closeBrowser()

