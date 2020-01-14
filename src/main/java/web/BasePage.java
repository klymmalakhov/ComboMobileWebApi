package web;

import com.codeborne.selenide.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import properties.PropertyHolder;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    private final Logger log = LoggerFactory.getLogger(BasePage.class);

    public void openPage(String pageName, String browserName) {
        log.info("Starting the {} browser", browserName);
        Configuration.browser = browserName;
        Configuration.reportsFolder = "target/surefire-reports";
        open(PropertyHolder.getPropValue("URL_" + pageName));
    }

}
