package net.automation.pages;

import com.typesafe.config.Config;
import net.serenitybdd.core.pages.PageObject;
import utilities.ConfigLoader;

import java.util.concurrent.TimeUnit;

public class Google extends PageObject {
    private static Config conf = ConfigLoader.load();

   public void goToHomePage()
   {
//        openUrl(conf.getString("url"));
       openUrl(conf.getString("webdriver.base.url"));
       getDriver().manage().window().maximize();
   }

}
