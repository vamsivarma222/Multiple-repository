package in.at;

import com.microsoft.playwright.*;

public class Automation {
    public static void main (String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        BrowserType browserType = playwright.chromium();
        Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page=browserContext.newPage();
        page.navigate("https://www.demoblaze.com/");
        page.click("//a[@id='login2']");
        Thread.sleep(6000);
        page.fill("//input[@id='loginusername']","vamsi123");
        Thread.sleep(6000);
        page.fill("//input[@id='loginpassword']","vamsi123");
        Thread.sleep(6000);
        page.locator("//button[normalize-space()='Log in']").click();
        Thread.sleep(3000);
        page.click("//a[normalize-space()='Nokia lumia 1520']");
        Thread.sleep(3000);
        page.click("//a[normalize-space()='Add to cart']");
        Thread.sleep(3000);
        page.click("//a[normalize-space()='Cart']");
        Thread.sleep(3000);
        page.click("//button[normalize-space()='Place Order']");
        Thread.sleep(3000);
        page.fill("//input[@id='name']","vamsi");
        Thread.sleep(2000);
        page.fill("//input[@id='city']","vizag");
        Thread.sleep(2000);
        page.fill("//input[@id='country']","i love india");
        Thread.sleep(2000);
        page.fill("//input[@id='card']","99999999");
        Thread.sleep(2000);
        page.fill("//input[@id='month']","8");
        Thread.sleep(2000);
        page.fill("//input[@id='year']","2025");
        Thread.sleep(2000);
        page.click("//button[normalize-space()='Purchase']");
        page.click("//button[normalize-space()='OK']");
        System.out.println("pass");
        browser.close();
        page.close();
        playwright.close();
    }
}
