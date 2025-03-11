package testFolder;

import org.openqa.selenium.WebDriver;

public class SliderPage {
    private final WebDriver driver;

    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
