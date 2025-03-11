package testFolder;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {
    private SliderPage sliderPage;

    @BeforeClass
    public void setupTest() {
        sliderPage = new SliderPage(driver);
        sliderPage.switchToFrame();
    }

    @Test
    public void testPageTitle() {
        String actualTitle = sliderPage.getPageTitle();
        Assert.assertEquals(actualTitle, TestData.Expected_Title, "Page title does not match");
    }

    @Test
    public void testDragAndDrop() {
        sliderPage.dragSlider(100);
        System.out.println("Slider moved successfully!");
    }
}
