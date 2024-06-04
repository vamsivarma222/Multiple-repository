import com.microsoft.playwright.*;
import org.junit.Test;


public class BrowserContextTest {

    @Test
    public void browserContextDemo()throws InterruptedException  {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless (false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();
        page.navigate("http://demo.automationtesting.in");
        Thread.sleep( 5000);
        browserContext.close();
    }
}