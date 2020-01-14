package web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {

    private final Logger log = LoggerFactory.getLogger(BasePage.class);

    public void openBrowser(String browserName) {
        log.info("Starting the {} browser", browserName);
    }

    public void openPage(String pageName) {
        log.info("Open the {} page", pageName);
    }
}
