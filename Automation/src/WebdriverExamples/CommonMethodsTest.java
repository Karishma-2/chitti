package WebdriverExamples;

public class  CommonMethodsTest {

	public static void main(String[] args) {
		CommonMethods.launchBrowser("chrome", "webdriver.chrome.driver","C:\\Users\\velpu\\OneDrive\\Desktop\\chromedriver");
        CommonMethods.openurl("http://www.amazon.com");
		CommonMethods.closeBrowser();
	}

}
