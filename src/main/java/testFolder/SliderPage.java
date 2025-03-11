package testFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPage {
    private final WebDriver driver;

    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void switchToFrame() {
        driver.switchTo().frame(driver.findElement(By.xpath(TestData.frame)));
    }

    public void dragSlider(int xOffset) {
        WebElement slider = driver.findElement(By.xpath(TestData.Green_Slider));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, xOffset, 0).perform();
    }
}
