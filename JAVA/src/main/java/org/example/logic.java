package org.example;

import com.microsoft.playwright.*;

import java.nio.file.Paths;


public class logic {
   public static void main(String[] args) throws InterruptedException {
       Playwright playwright = Playwright.create();
       Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless (false));
       BrowserContext browserContext = browser.newContext();
       Page page = browserContext.newPage();
       page.navigate( "https://demowebshop.tricentis.com/login");
       page.fill( "#Email",  "sakinala@gmail.com");
       page.fill( "#Password", "p@ssword");
       page.click( "[value='Log in']");
       Thread.sleep(  3000);
       playwright.close();


   }
}
